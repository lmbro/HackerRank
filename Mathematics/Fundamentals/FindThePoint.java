/*

File:    FindThePoint.java
Purpose: HackerRank Challenge, Find the Point
Author:  Lucas Brown
Version: 1.0
Date:    July 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Consider two points, p = (p_x, p_y) and q = (q_x, q_y). We consider the inversion or point reflection, r = (r_x, r_y), of a point p across point q to be a 180 degree rotation of point p around point q.


Task
-----
Given n sets of points p and q, find r for each pair of points and print two space-separated integers denoting the respective values of r_x and r_y on a new line.


Input Format
-------------
The first line contains an integer, n, denoting the number of sets of points. Each of the n subsequent lines contains four space-separated integers describing the respective values of p_x, p_y, q_x, and q_z definting points p = (p_x, p_y) and q = (q_x, q_y).


Constraints
------------
1 <= n <= 15
- 100 <= p_x, p_y, q_x, q_y <= 100


Output Format
--------------
For each pair of points p and q, print the corresponding respective values of r_x and r_y as two space-separated integers on a new line.


Sample Input
-------------
2
0 0 1 1
1 1 2 2

Sample Output
--------------
2 2
3 3

*/

import java.util.Scanner;

public class FindThePoint {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_sets = scan.nextInt();
        for( int i = 0; i < n_sets; i++ ) {

            int p_x = scan.nextInt();
            int p_y = scan.nextInt();
            int q_x = scan.nextInt();
            int q_y = scan.nextInt();

            int r_x = q_x + (q_x - p_x);
            int r_y = q_y + (q_y - p_y);

            System.out.printf( "%d %d%n", r_x, r_y );
        }
    }
}