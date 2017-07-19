/*

File:    Day2_MaximumGcdAndSum.java
Purpose: HackerRank Competition, Week of Code 34, Day 1: Once in a Tram
Author:  Lucas Brown
Version: 1.0
Date:    July 18, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
You are given two arrays A and B containing n elements each. Choose a pair of elements (x,y) such that:
* x belongs to array A
* y belongs to array B
* gcd(x,y) is the maximum of all pairs (x,y).

If there is more than once such pair (x,y) having maximum gcd, then choose the one with maximum sum. Print the sum of elements of this maximum-sum pair.

NOTE: gcd(x,y) returns the largers integer that divides both x and y.


Input Format
-------------
The first line of input contains n denoting the total number of elements of arrays A and B. 
Next line contains n space separated positive integers denoting the elements of array A. 
Next line contains n space separated positive integers denoting the elements of array B.


Constraints
------------
1 <= n <= 5 x 10^5
1 <= a[i] <= 10^6
1 <= b[i] <= 10^6


Output Format
--------------
From all the pairs having maximum gcd, print the sum of one that has the maximum sum.


Sample Input
-------------
5
3 1 4 2 8
5 2 12 8 3

Sample Output
--------------
16

*/

import java.util.Scanner;
import java.util.Arrays;  

/**
 * HackerRank Competition, Week of Code 34, Day 2
 * Challenge: Maximum GCD and Sum
 * Read comments at beginnig of this source file for details
 * 
 * @author Lucas Brown
 * @version 5.1
 */
public class Day2_MaximumGcdAndSum {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for( int i = 0; i < n; i++ ) {
            a[i] = scan.nextInt();
        }
        for( int i = 0; i < n; i++ ) {
            b[i] = scan.nextInt();
        }

        Arrays.sort( a );
        Arrays.sort( b );

        System.out.println( getMaxGcdSum( a, b ) );

        return;        
    }
    
    /**
     * Get maximum sum of a pair (a[i], b[i]) which have the greatest common denomitor of any pair (a[i], b[i])
     * 
     * @param a - Integer array (not int array)
     * @param b - Integer array (not int array)
     * @return maximum sum of a pair (a[i], b[i]) which have the greatest common denomitor of any pair (a[i], b[i])
     */
    public static int getMaxGcdSum( int[] a, int[] b ) {

        if( a[a.length-1] == b[b.length-1] ) {
            return a[a.length-1] + b[b.length-1];
        }

        int i = a.length - 1;
        int j = b.length - 1;
        int max_gcd = modifiedEuclid( a[i], b[j], 0 );
        int max_sum = a[i] + b[j];

        while( i >= 0 && j >= 0 ) {

            System.out.println( "a[i] = " + a[i] + "  b[i] = " + b[j] );

            if( a[i] < max_gcd || b[j] < max_gcd ) {
                return max_sum;
            } else if( a[i] == b[j] ) {
                return a[i]+b[j];
            }


            int gcd = modifiedEuclid( a[i], b[j], max_gcd );

            System.out.println( "GCD: " + gcd + "  Max GCD: " + max_gcd );

            if( gcd > max_gcd ) {
                max_gcd = gcd;
                max_sum = a[i] + b[j];
            }

            if( a[i] < b[j] ) {
                if( j > 0 ) {
                    j--;
                } else {
                    i--;
                }
            } else if( a[i] > b[j] ) {
                if( i > 0 ) {
                    i--;
                } else {
                    j--;
                }
            } 
        }
        return max_sum;
    }

    /**
     * Non-recursive implementation of Euclid's algorithm for find GCD of two numbers.
     * If x drops below some number, we stop looking.
     * 
     * @param x - first integer to compare
     * @param y - second integer to compare
     * @param min - lowest common denominator before giving up our search and returning 0
     * @return greatest common denominator of x and y if it is > min, 0 if the GCD < min
     * @see <a href="http://www.java67.com/2012/08/java-program-to-find-gcd-of-two-numbers.html">Java67, Euclid's Algorithm</a>
     */
    public static int modifiedEuclid( int x, int y, int min ) {

        if( x < min ) {
            return 0;
        } else if( y == 0 ) {
            return x;
        } else {
            return modifiedEuclid( y, x%y, min );
        }
    }
}