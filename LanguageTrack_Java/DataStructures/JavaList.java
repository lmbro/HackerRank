/*

File:    JavaList.java
Purpose: HackerRank Challenge, Java List
Author:  Lucas Brown
Version: 1.0
Date:    August 10, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.


Input Format
-------------
The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:
    - If the first line of a query contains the String "Insert", then the second line contains two space separated integers x y, and the value y must be inserted into L and index x.
    - If the first line of a query contains the String "Delete", then the second line contains index x, whose element must be deleted from L.


Constraints
------------
1 <= N <= 4000
1 <= Q <= 4000
Each element in is a 32-bit integer


Output Format
--------------
Print the updated list L as a single line of space-separated integers.


Sample Input
-------------
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
--------------
0 1 78 12 23

*/

// void add( int index, E element );
// E remove( int index );

import java.util.Scanner;
import java.util.ArrayList;

public class JavaList {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        // Build initial list

        int n_elements_initial = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n_elements_initial);

        for( int i = 0; i < n_elements_initial; i++ ) {
            list.add( scan.nextInt() ) ;
        }

        // Queries

        int n_queries = scan.nextInt();

        for( int i = 0; i < n_queries; i++ ) {
            
            scan.nextLine();
            String command = scan.nextLine();

            if( command.equals( "Insert" ) ) {
                list.add( scan.nextInt(), scan.nextInt() );
            } else if( command.equals( "Delete" ) ) {
                list.remove( scan.nextInt() );
            } else {
                System.out.println( "Error: Invalid command." );
            }
        }
 
        // Print out final list

        for( int i : list ) {
            System.out.print( i + " " ) ;
        }
        System.out.println("");
    }
}