/*

File:    Restaurant.java
Purpose: HackerRank Challenge, Restaurant
Author:  Lucas Brown
Version: 1.0
Date:    August 26, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Martha is interviewing at Subway. One of the rounds of the interview requires her to cut a bread of size l x b into smaller identical pieces such that each piece is a square having maximum possible side length wih no left over piece of bread.


Task
-----
Given l and b, find the number of indentical square pieces with the maximum possible side length that can be cut out of the piece of bread with no bread left over.


Input Format
-------------
The first line contains an integer T. 
The next T lines contain two space separated integers l and b which denote length and breadth of the bread.


Constraints
------------
1 <= T <= 1000
1 <= l, b <= 1000


Output Format
--------------
T lines, each containing an integer that denotes the number of squares of maximum size, when the bred is cut as per the given condition.


Sample Input
-------------
2
2 2
6 9

Sample Output
--------------
1
6

*/

import java.util.Scanner;

public class Restaurant {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        
        int num_tests = scan.nextInt();
        for( int i = 0; i < num_tests; i++ ) {

            int length = scan.nextInt();
            int breadth = scan.nextInt();
            int side = Math.min( length, breadth );

            while( side > 0 ) {
                 
                if( length % side == 0 && breadth % side == 0 ) {
                    break;
                }
                side--;
            }

            System.out.println( (length/side)*(breadth/side) );
        }
    }
}