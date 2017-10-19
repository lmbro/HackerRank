/*

File:    CircularArrayRotation.java
Purpose: HackerRank Challenge, Circular Array Rotation
Author:  Lucas Brown
Version: 1.0
Date:    July 15, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
John Watson performs an operation called a right circular rotation on an array of integers a[0], a[1], ..., a[n-1]. After performing one right circular operator, the array is transformed from [ a[0], a[1], ..., a[n-1] ] to [ a[n-1], a[0], ..., a[n-2] ].


Task
-----
Watson performs this operator k times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks q queries, where each query consists of a single integer, m, for which you must print the element at index m in the rotated array.


Input Format
-------------
The first line contains 3 space-separated integers, n, k, and q, respectively.
The second line contains n space-separated integers, where each integer i describes array element a[i] (where 0 <= i < n).
Each of the q subsequent lines contains a single integer denoting m.


Constraints
------------
1 <= n <= 10^5
1 <= a[i] <= 10^5
1 <= k <= 10^5
1 <= q <= 500
0 <= m <= n-1


Output Format
--------------
For each query, print the value of the element at index m of the rotated array on a new line.


Sample Input
-------------
3 2 3
1 2 3
0
1
2

Sample Output
--------------
2
3
1

*/

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int array_size = scan.nextInt();
        int n_rotations = scan.nextInt();
        int n_queries = scan.nextInt();

        int[] input = new int[array_size];
        int[] rotated = new int[array_size];

        for( int i = 0; i < array_size; i++ ) {
            input[i] = scan.nextInt();
        }

        rotateArray( input, rotated, n_rotations );

        for(int i = 0; i < n_queries; i++ ) {
            int m = scan.nextInt();
            System.out.println( rotated[m] );
        }
        
        scan.close();
        return;
    }

    public static void rotateArray( int[] input, int[] rotated, int k ) {

        k = k % input.length;
        for( int i = 0; i < input.length; i++ ) {

            if( i + k < input.length ) {
                rotated[i+k] = input[i];
            } else {
                rotated[i+k - input.length] = input[i];
            }
        }
        return;
    }
}