/*

File:    BestDivisor.java
Purpose: HackerRank Challenge, Best Divisor
Author:  Lucas Brown
Version: 1.0
Date:    August 26, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Kristen loves playing with and comparing numbers. She thinks that if she takes two different positive numbers, the one whose digits sum to a larger number is better than the other. If the sum of digits is equal for both numbers, then she thinks the smaller number is better. For example, Kristen thinks that 13 is better than 31 and that 12 is better than 11.


Task
-----
Given an integer, n, can you find the divisor of n that Kristen will consider the best?


Input Format
-------------
A single integer denoting n.


Constraints
------------
0 < n <= 10^5


Output Format
--------------
Print an integer denoting the best divisor of n.


Sample Input
-------------
12

Sample Output
--------------
6

*/


import java.util.Scanner;

public class BestDivisor {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        scan.close();

        int fav_num = 0;
        int sqrt_n = (int)Math.ceil( Math.sqrt(n) );
        
        for( int i = 1; i <= sqrt_n; i++ ) {

            if( n % i == 0 ) {
                fav_num = compareNumbers( compareNumbers( i, n/i ), fav_num );
            }
        }

        System.out.println( fav_num );
    }

    public static int compareNumbers( int a, int b ) {

        int sum_a = 0;
        int digit_a = a;
        int sum_b = 0;
        int digit_b = b;

        while( digit_a > 0 ) {
            sum_a += digit_a % 10;
            digit_a = digit_a / 10;
        }
        while( digit_b > 0 ) {
            sum_b += digit_b % 10;
            digit_b = digit_b / 10;
        }

        // The numbers whose digits sum to a larger number is better than the other.
        if( sum_a > sum_b ) {
            return a;
        } else if( sum_b > sum_a ) {
            return b;
        }

        // If the sum of digits is equal for both numbers, then the smaller number is better
        if( a < b ) {
            return a;
        }
        return b;
    }
}