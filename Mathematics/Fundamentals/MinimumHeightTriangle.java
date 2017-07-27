/*

File:    MinimumHeightTriangle.java
Purpose: HackerRank Challenge, Minimum Height Triangle
Author:  Lucas Brown
Version: 1.0
Date:    July 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given integers b and a, find the smallest integer h, such that there exists a triangle of height h, base b, having an area of at least a.


Input Format
-------------
In the first and only line, the are two space-separated integers b and a, denoting respectively the base of a triangle and the desired minimum area.


Constraints
------------
1 <= b <= 10^6
1 <= a <= 10^6


Output Format
--------------
In a single line, print a single integer h, denoting the minimum height of a triangle with base b and area at least a.


Sample Input 0
---------------
2 2

Sample Output 0
----------------
2


Sample Input 1
---------------
17 100

Sample Output 1
----------------
12

*/

import java.util.Scanner;

public class MinimumHeightTriangle {

    static int lowestTriangle( int base, int area ) {
        return (int)Math.ceil( 2.0 * area / base );
    }
/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */