/*

File:    SequenceEquation.java
Purpose: HackerRank Challenge, Sequence Equation
Author:  Lucas Brown
Version: 1.0
Date:    July 15, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------


Task
-----
You are given a sequence of n integers, p(1), p(2), ... , p(n). Each element in the sequence is distinct and satisfies 1 <= p(x) <= n. For each x where 1 <= x <= n, find any integer y such that p(p(y)) = x and print the value on a new line.


Input Format
-------------
The first line contains an integer, n, denoting the number of elements in the sequence. The second line contains n space-separated integers denoting the respective valeus of p(1), p(2), ..., p(n-1).


Constraints
------------
1 <= n <= 50
1 <= p(x) <= 50, where 1 <= x <= n
Each element in the sequence is distinct


Output Format
--------------
For each x from 1 to n, print an integer denoting any valid y satisfying the equation p(p(y)) = x on a new line.


Sample Input
-------------
3
2 3 1

Sample Output
--------------
2
3
1

*/

import java.util.Scanner;

public class SequenceEquation {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n = scan.nextInt();

        /*
        p(x) values are distinct, so if we know p(x), we know p_inverse(x):
            p(a) = b;
            a = p_inverse(b);

        p(p(y)) = x
        p(y) = p_inverse(x)
        y = p_inverse( p_inverse (x) ).

        Instead of building p, build p_inverse.
        */
        int[] p_inverse = new int[n+1];  // Avoid issues with index being off-by-one
        for( int i = 1; i < n+1; i++ ) {
            int p_x = scan.nextInt();
            p_inverse[p_x] = i;
        }

        for( int i = 1; i < n+1; i++ ) {

            System.out.println( p_inverse[ p_inverse[ i ] ] );
        }
    }
}