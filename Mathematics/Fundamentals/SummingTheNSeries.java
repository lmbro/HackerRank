/*

File:    SummingTheNSeries.java
Purpose: HackerRank Challenge, Summing the N series
Author:  Lucas Brown
Version: 1.0
Date:    August 23, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
You are given a sequence whose n'th term is:

Tn = n^2 - (n-1)^2

You have to evalaute the series:

Sn = T1 + T2 + T3 + ... + Tn


Task
-----
Find Sn mod( 10^9 + 7 )


Input Format
-------------
The first line of input contains T, the number of test cases.
Each test case consists of one line containing a single integer, n.


Constraints
------------
1 <= T <= 10
1 <= n <= 10^16


Output Format
--------------
For each test case, print the required answer in a line.


Sample Input
-------------
2
2
1

Sample Output
--------------
4
1

*/

import java.util.Scanner;

public class SummingTheNSeries {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int numCases = scan.nextInt();

        for( int i = 0; i < numCases; i++ ) {

            long n = scan.nextLong();

            // ( a * b ) % x = ( ( a % x ) * ( b % x ) ) % x
            n = n % ( (long)1e9 + 7 );
            System.out.println( (n*n) % ( (long)1e9 + 7 ) );
        }

    }
}