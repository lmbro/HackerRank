/*

File:    JavaArraylist.java
Purpose: HackerRank Challenge, Java Arraylist
Author:  Lucas Brown
Version: 1.0
Date:    August 5, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.


Task
-----
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in the yth position of the xth line.

Take your input from System.in.


Input Format
-------------
The first line has an integer n. In each of the next n lines there will be an integer d denoting the number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.


Constraints
------------
1 <= n <= 20000
0 <= d <= 50000
1 <= q <= 1000
1 <= x <= n


Output Format
--------------
In each line, output the number located in the yth position of the xth line. If there is no such position, just print "ERROR!"


Sample Input
-------------
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output
--------------
74
52
37
ERROR!
ERROR!

*/

import java.util.Scanner;
import java.util.ArrayList;

public class JavaArraylist {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int n_lines = scan.nextInt();
        ArrayList<Integer[]> arrList = new ArrayList<Integer[]>();


        // Build arrList
        
        for( int i = 0; i < n_lines; i++ ) {
            
            int n_elements = scan.nextInt();

            // Protect against d=0, has the benefit of shifting array by one to match query
            Integer[] arr = new Integer[n_elements+1];
            arr[0] = n_elements;

            // Build arr
            for( int j = 1; j <= n_elements; j++ ) {
                arr[j] = scan.nextInt();
            }

            arrList.add( arr );
        }


        // Respond to queries

        int n_queries = scan.nextInt();
        for( int i = 0; i < n_queries; i++ ) {

            int row = scan.nextInt() - 1;  // Queries are not zero-indexed
            int col = scan.nextInt();      // Columns already shifted by one

            if( row > arrList.size() || col > arrList.get(row)[0] ) {
                System.out.println( "ERROR!" );
            } else {
                System.out.println( arrList.get(row)[col] );
            }
        }
    }
}