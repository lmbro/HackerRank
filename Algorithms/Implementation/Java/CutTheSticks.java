/*

File:    CutTheSticks.java
Purpose: HackerRank Challenge, Cut the Sticks
Author:  Lucas Brown
Version: 1.0
Date:    September 8, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick. 

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation, we make a cut of length 2 from each of the six sticks. For the next cut operation, four sticks are left (of non-zero length), whose lengths are the following:
3 2 2 6

The above step is repeated until no sticks are left.

Note: For each cut operation, you must recalculate the length of the smallest sticks (excluding zero-length sticks).


Task
-----
Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.


Input Format
-------------
The first line contains a single integer N.
The next line contains N integers: a[0], a[1], ..., a[N-1] separated by space, where a[i] represents the length of the ith stick.


Output Format
--------------
For each operation, print the number of sticks that are cut, on separate lines.


Constraints
------------
1 <= N <= 1000
1 <= a[i] <= 1000


Sample Input 0
---------------
6
5 4 4 2 2 8


Sample Output 0
----------------
6
4
2
1


Sample Input 1
---------------
8
1 2 3 4 3 3 2 1


Sample Output 1
----------------
8
6
4
1

*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CutTheSticks {

    public static void main( String[] args ) {

        // Build input array of stick lengths

        Scanner scan = new Scanner( System.in );
        final int N = scan.nextInt();
        int[] stickLengths = new int[N];

        for( int i = 0; i < N; i++ ) {
            stickLengths[i] = scan.nextInt();
        }

        // Create TreeMap of stick lengths and their counts

        Map<Integer, Integer> stickLengthCounts = new TreeMap<Integer, Integer>();
        for( int length : stickLengths ) {
            Integer count = stickLengthCounts.get(length);
            if( count == null ) {
                count = 0;
            }
            count++;
            stickLengthCounts.put( length, count );
        }

        // Print the number of sticks remaining after each cut step

        int remainingSticks = N;
        for( Map.Entry<Integer, Integer> entry : stickLengthCounts.entrySet() ) {
            System.out.println( remainingSticks );
            remainingSticks -= entry.getValue();
        }
    }
}