/*

File:    JavaSubarray.java
Purpose: HackerRank Challenge, Java Subarray
Author:  Lucas Brown
Version: 1.0
Date:    August 5, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
We dfine the following:

A subarray of an n-element array is an array composed from a contiguous block of the orignal array's elements. For example, if array = [1, 2, 3], then the subarrays are [1], [2], [3], [1, 2], [2, 3], and [1, 2, 3]. Something like [1, 3] would not be a subarray as it's not a contiguous subsection of the original array.

The sum of an array is the total sum of it's elements.
    An array's sum is negative if the total sum of its elements is negative.
    An array's sum is positive if the total sum of its elements is positive.


Task
-----
Given an array of n integers, find and print its number of negative subarrays on a new line.


Input Format
-------------
The first line contains a single integer, n, denoting the length of an array A = { a0, a1, ..., an-1 }
The second line contains n space-separated integers describing each respective element, a[i], in array A.


Constraints
------------
1 <= n <= 100
-10^4 <= a[i] <= 10^4


Output Format
--------------
Print the number of subarrays of A having negative sums.


Sample Input
-------------
5
1 -2 4 -5 1

Sample Output
--------------
9

*/

import java.util.Scanner;

public class JavaSubarray {

    public static void main( String[] args ) {

        // Input

        Scanner scan = new Scanner( System.in );
        
        int n_elements = scan.nextInt();
        int[] arr = new int[n_elements];

        for( int i = 0; i < n_elements; i++ ) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        
        // Find and count negative subarrays

        int count = 0;
        for( int i = 0; i < arr.length; i++ ) {
            int sum = 0;
            for( int j = i; j < arr.length; j++ ) {
                sum += arr[j];
                if( sum < 0 ) {
                    count++;
                }
            }
        }

        System.out.println( count );
    }
}