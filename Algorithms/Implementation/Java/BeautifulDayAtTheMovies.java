/*

File:    BeautifulDayAtTheMovies.java
Purpose: HackerRank Challenge, Beautiful Days At The Movies
Author:  Lucas Brown
Version: 1.0
Date:    July 14, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Lily likes to play games with integers and their reversals. For some integer x, we define reversed(x) to be the reversal of all digits in x. For example, reversed(123) = 321.


Task
-----
Logan wants to go to the movies with Lily on some day x satisfying i <= x <= j, but he knows she only goes to the moves on days she considers to be beautiful. Lily considers a day to be beautifuly if the absolute value of the difference between x and reveresed(x) is even divisible by k.

Given i, j, and k, count and print the number of beautifuly days when Logan and Lily can go to the movies.


Input Format
-------------
A single line of three space-separated integers describing the respective values of i, j, and k.


Constraints
------------
1 <= i <= j <= 2 x 10^6
1 <= k <= 2 x 10^9


Output Format
--------------
Print the number of beautifuly days in the inclusive range between i and j.


Sample Input
-------------
20 23 6

Sample Output
--------------
2

*/

import java.util.Scanner;

public class BeautifulDayAtTheMovies {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int n_days = 0;

        for( int z = i; z <= j; z++ ) {

            if( Math.abs( z - reversed( z ) ) % k == 0 ) {
                n_days++;
            }
        }
        
        System.out.println( n_days );
    }

    public static int reversed( int x ) {

        int rev_x = 0;

        while( x != 0 ) {

            rev_x = (rev_x * 10) + ( x % 10 );
            x = x / 10;
        }
        return rev_x;
    }
}