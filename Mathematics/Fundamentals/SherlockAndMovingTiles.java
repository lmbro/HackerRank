/*

File:    SherlockAndMovingTiles.java
Purpose: HackerRank Challenge, Sherlock and Moving Tiles
Author:  Lucas Brown
Version: 1.0
Date:    August 26, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Sherlock is given 2 square tiles, initially both of whose side have length L placed in an x-y plane, so that the bottom left corner of each square coincides with the origin and their sides are parallell to the axes.

At t=0, both squares start moving along line y = x (along positive x and y) with velocities S_1 and S_2.


Task
-----
For each query of form q_i, Sherlock has to report the time at which the overlapping area of tiles is equal to q_i.

NOTE: Assume all distances in meters, time in seconds and velocities in meter per seconds unless otherwise specified.


Input Format
-------------
First line contains integers L, S_1, S_2. Next line contains Q, the number of queries. Each of the next Q lines consists of one integer q_i in one line.


Constraints
------------
1 <= L, S_1, S_2 <= 10^9
1 <= Q <= 10^5
1 <= q_i <= L^2
S_1 != S_2


Output Format
--------------
For each query, print the required answer in one line. Your answer will be considered correct if it is at most 0.0001 away from the true answer.


Sample Input
-------------
10 1 2
2
50
100

Sample Output
--------------
4.1421
0.0000

*/

import java.util.Scanner;

public class SherlockAndMovingTiles {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        double length = scan.nextDouble();
        double[] sqSpeed = new double[2];
        sqSpeed[0] = scan.nextDouble();
        sqSpeed[1] = scan.nextDouble();


        int num_queries = scan.nextInt();
        for( int i = 0; i < num_queries; i++ ) {

            double overlapArea = scan.nextDouble();
            double time = Math.sqrt(2) * ( length - Math.sqrt(overlapArea) ) / ( sqSpeed[0] - sqSpeed[1] );

            if( time < 0 ) {
                time *= -1;
            }

            System.out.println( time );
        }
    }
}


