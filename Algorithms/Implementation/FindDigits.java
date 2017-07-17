/*

File:    FindDigits.java
Purpose: HackerRank Challenge, Find Digits
Author:  Lucas Brown
Version: 1.0
Date:    MONTH DAY, YEAR

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------


Task
-----
Given an integer, N, traverse it's digits (d1, d2, ..., dn) and determin how many digits evenly divide N (i.e., count the number of times N divided by each digit di has a remainder of 0). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurence of the sam evenly divisible digit should be counted (i.e., for N = 111, the answer is 3 ).


Input Format
-------------
The first line is an integer, T, indicating the number of test cases.
The T subsequent lines contain an integer, N.

Constraints
------------
1 <= T <= 15
0 < 5 < 10^9


Output Format
--------------
For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.


Sample Input
-------------
2
12
1012

Sample Output
--------------
2
3

*/

import java.util.Scanner;

public class FindDigits {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int test_cases = scan.nextInt();
        
        for( int i = 0; i < test_cases; i++ ) {

            int number = scan.nextInt();
            int decay = number;
            int c = 0;

            while( decay > 0 ) {

                int digit = decay % 10;
                decay /= 10;
                
                if( digit == 0 ) {
                    continue;
                } else if( number % digit == 0) {
                    c++;
                }
            }

            System.out.println( c );
        }
    }
}