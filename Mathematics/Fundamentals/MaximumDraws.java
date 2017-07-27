/*

File:    MaximumDraws.java
Purpose: HackerRank Challenge, Maximum Draws
Author:  Lucas Brown
Version: 1.0
Date:    July 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Jim is off to a party and is searching for a matching pair of socks. His drawer is filled with socks, each pair of a different color. In its worst case scenario, how many socks (x) should Jim remove from his drawer until he finds a matching pair?


Input Format
-------------
The first line contains the number of test cases T.
The next T lines contains an integer N which indicates the total pairs of socks present in the drawer.


Constraints
------------
1 <= T <= 1000
0 < N < 10^6


Output Format
--------------
Print the number of Draws (x) Jim mkes in the worst case scenario.


Sample Input
-------------
2
1
2

Sample Output
--------------
2
3

*/

import java.util.Scanner;

public class MaximumDraws {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_cases = scan.nextInt();

        for( int i = 0; i < n_cases; i++ ) {

            int n_pairs = scan.nextInt();
            System.out.println( n_pairs + 1 );
        }
    }
}