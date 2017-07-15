/*

File:    UtopiaTree.java
Purpose: HackerRank Challenge, Utopian Tree
Author:  Lucas Brown
Version: 1.0
Date:    July 15, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, it's height increases by 1 meter.


Task
-----
Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?


Input Format
-------------
The first line contains an integer, T, the number of test cases.
T subsequent lines each contain an integer, N, denoting the number of cycles for that test cases.


Constraints
------------
1 <= T <= 10
0 <= N <= 60


Output Format
--------------
For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.


Sample Input
-------------
3
0
1
4

Sample Output
--------------
1
2
7

*/

import java.util.Scanner;

public class UtopianTree {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int t = scan.nextInt();
        int[] cycles = new int[t];

        for( int i = 0; i < t; i++ ) {
            cycles[i] = findHeight( scan.nextInt() );
        }

        for( int height : cycles ) {
            System.out.println( height );
        }
    }

    public static int findHeight( int n ) {

        int height = 1;
        for( int i = 0; i < n; i++ ) {
            if( i % 2 == 0 ) {
                height *= 2;
            } else {
                height++;
            }
        }
        return height;
    }
}