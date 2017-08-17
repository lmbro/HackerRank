/*

File:    CuttingPaperSquares.java
Purpose: HackerRank Challenge, Cutting Paper Squares
Author:  Lucas Brown
Version: 1.0
Date:    August 17, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Mary has an n x m piece of paper that she wants to cut into 1x1 peices according to the following rules:
    - She con only cut one piece of paper at a time, meaning she cannot fold the paper or layer already-cut pieces on top of one another.
    - Each cut is a straight line from one side of the paper to the other side of the paper.


Task
-----
Given n and m, find and print the minimum number of cuts Mary must make to cut the paper into n*m squares that are 1x1 unit in size.


Input Format
-------------
A single line of two space-separated integers denoting the respective values of n and m.


Constraints
------------
1 <= n, m <= 10^9


Output Format
--------------
Print a long integer denoting the minimum number of cuts needed to cut the entire paper into 1x1 squares.


Sample Input
-------------
3 1

Sample Output
--------------
2 

*/

import java.util.Scanner;

public class CuttingPaperSquares {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        long cuts = ( (long)rows ) * ( cols - 1 ) + ( rows - 1 );
        System.out.println( cuts );
    }
}