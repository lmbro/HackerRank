/**

JavaLoopsII.java
Purpose: HackerRank Challenge, Java Loops II

Author: Lucas Brown
Version: 1.0 7/11/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
We use the integers a, b, and n to create the following series:
(a + b*2^0), (a + b*2^0 + b*2^1 ), ... , (a + b*2^0 + b*2^1 + ... + b*2^(n-1) ).


Task
-----
You are given q queries in the form of a, b, and n. For eacy query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.


Input Format
-------------
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a[i], b[i], and n[i] values of that query.


Constraints
------------
0 <= q <= 500
0 <= a, b <= 50
1 <= n <= 15


Output Format
--------------
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.


Sample Input
-------------
2
0 2 10
5 3 5

Sample Output
--------------
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/

import java.util.Scanner;

public class JavaLoopsII {

        public static void main( String[] args ) {

                Scanner scan = new Scanner( System.in );
                int queries = scan.nextInt();

                for( int i = 0; i < queries; i++ ) {

                        int a_i = scan.nextInt();
                        int b_i = scan.nextInt();
                        int n_i = scan.nextInt();

                        printSeries( a_i, b_i, n_i );
                }
        }

        public static void printSeries( int sum, int product, int n ) {

                sum += product;
                System.out.printf( "%d ", sum );

                for( int i = 1; i < n; i++ ) {

                        product *= 2;
                        sum += product;
                        System.out.printf( "%d ", sum );
                }

                System.out.println("");
        }
}