/*

File:    ConnectingTowns.java
Purpose: HackerRank Challenge, Connecting Towns
Author:  Lucas Brown
Version: 1.0
Date:    August 16, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Gandalf is travelling from Rohan to Rivendell to meet Frodo but there is no direct route from Rohan (T1) to Rivendell (TN).

But there are towns T2, T3, T4, ..., TN-1 such that there are N1 routes from town T1 to T2, and in general, Ni routes from Ti to Ti+1 for i=1 to n-1 and 0 routes for any other Ti to Tj for j != i+1.

Note: Gandalf has to pass all the towns Ti for i=1 to n-1 in numerical order to reach TN. For each Ti, Ti+1 there are only Ni distince routes Gandalf can take.


Input Format
-------------
The first line contains an integer T, T test-cases follow.
Each test-case has 2 lines:
The first line contains an integer N (the number of towns).
The second line contains N-1 space separated integers where the ith integer denotes the number of routes, Ni, from the town Ti to Ti+1.


Constraints
------------
1 <= T <= 1000
2 < N <= 100
1 <= Ni <= 1000


Output Format
--------------
Total number of routes to T1 to TN modulo 12345667


Sample Input
-------------
2
3
1 3
4
2 2 2

Sample Output
--------------
3
8

*/

import java.util.Scanner;

public class ConnectingTowns {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_queries = scan.nextInt();

        long test = 1227600;

        for( int i = 0; i < n_queries; i++ ) {

            int n_towns = scan.nextInt();
            long n_routes = 1;
            for( int j = 0; j < n_towns - 1; j++ ) {
                int n_i = scan.nextInt();
                n_routes = ( n_routes * n_i ) % 1234567;
            }
            System.out.println( n_routes );
        }
    }
}