/*

File:    Java2DArray.java
Purpose: HackerRank Challenge, Java 2D Array
Author:  Lucas Brown
Version: 1.0
Date:    August 5, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
You are given a 6x6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

The sum of an hourglass is the sum of all numbers within it. 


Task
-----
In this problem you have to print the largest sum among all the hourglasses in the array.


Input Format
-------------
There will be exactly 6 lines, each containing 6 integers separated by spaces. Each integer will be between -9 and 9 inclusive.


Constraints
------------
Each integer will be between -9 and 9 inclusive.


Output Format
--------------
Print the answer to this problem on a single line.


Sample Input
-------------
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
--------------
19

*/

import java.util.Scanner;

public class Java2DArray {

    public static void main( String[] args ) {

        // Gather Input

        Scanner scan = new Scanner( System.in );

        int height = 6;  // Better approach than hard-coding 6's everywhere, allows for easier updating of the program should it be necessary.
        int width = 6;
        int[][] arr = new int[height][width];

        for( int i = 0; i < height; i++ ) {
            for( int j = 0; j < width; j++ ) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();


        // Loop over all hourglasses and find max sum.
        
        int max_sum = -9 * 7;  // Minimum possible sum.

        for( int i = 0; i < height-2; i++ ) {
            for( int j = 0; j < width-2; j++ ) {
                int sum = sumHourglass( i, j, arr );
                if( sum > max_sum ) {
                    max_sum = sum;
                }
            }
        }
        System.out.println( max_sum );
    }

    public static int sumHourglass( int i_corner, int j_corner, int[][] arr ) {
        
        int sum = 0;
        
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {

                sum += arr[i+i_corner][j+j_corner];
            }
        }

        sum -= ( arr[1+i_corner][j_corner] + arr[1+i_corner][2+j_corner] );

        return sum;
    }
}