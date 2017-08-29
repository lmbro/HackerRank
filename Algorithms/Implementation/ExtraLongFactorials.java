/*

File:    ExtraLongFactorials.java
Purpose: HackerRank Challenge, Extra Long Factorials
Author:  Lucas Brown
Version: 1.0
Date:    August 28, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
You are given an integer N. Print the factorial of this number.

N! = N * (N-1) * (N-1) * ... * 3 * 2 * 1


Input Format
-------------
Input consists of a single integer N, where 1 <= N <= 100


Output Format
--------------
Print the factorial of N.


Constraints
------------
1 <= N <= 100


Sample Input
-------------
25

Sample Output
--------------
15511210043330985984000000

*/

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        scan.close();

        BigInteger n_factorial = BigInteger.ONE;

        for( int i = 2; i <= n; i++ ) {

            n_factorial = new BigInteger( 
                n_factorial.multiply( BigInteger.valueOf(i) ).toString() );
        }

        System.out.println( n_factorial );
    }
}