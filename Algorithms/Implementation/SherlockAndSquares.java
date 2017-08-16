/*

File:    SherlockAndSquares.java
Purpose: HackerRank Challenge, Sherlock and Squares
Author:  Lucas Brown
Version: 1.0
Date:    August 16, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).


Input Format
-------------
The first line contains T, the number of test cases. T test cases follow, each in a new line. Each test case contains two space-separated integers denoting A and B.


Constraints
------------
1 <= T <= 100
1 <= A <= B <= 10^9


Output Format
--------------
For each test case, print the required anser in a new line.


Sample Input
-------------
2
3 9
17 24

Sample Output
--------------
2
0

*/

import java.util.Scanner;

public class SherlockAndSquares {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int test_cases = scan.nextInt();

        for( int i = 0; i < test_cases; i++ ) {

            int intA = scan.nextInt();
            int intB = scan.nextInt();

            int rootA = (int)( Math.ceil( Math.sqrt(intA) ) );
            int rootB = (int)( Math.floor( Math.sqrt(intB) ) );

            System.out.println( rootB - rootA + 1 );

        }
    }
}