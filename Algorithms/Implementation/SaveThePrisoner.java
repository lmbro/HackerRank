/*

File:    template.java
Purpose: HackerRank Challenge, CHALLENGE_NAME
Author:  Lucas Brown
Version: X.X
Date:    MONTH DAY, YEAR

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
A jail has N prisoners, and each prisoner has a unique id number, S, ranging from 1 to N. There are M sweets that must be distributed to the prisoners.

The jailer decides the fairest way to do this is by sitting the prisoners down in a circle (ordered by ascending S), and then, starting with some random S, distribute one candy at a time to each sequentially numbered prisoner until all M candies are distribut. For example, if the jailer picks prisoner S = 2, then his distribution order order would be (2, 3, 4, 5, ... , n-1, n, 1, 2, 3, 4, ... ) until all M sweets are distributed.

But wait -- there's a catch -- the very last sweet is poisoned!


Task
-----
Can you find an dprint the ID number of the last prisoner to receive a sweet so he can be warned?


Input Format
-------------
The first line contains an integer, T, denoting the number of test casses.
The T subsequent lines each contain 3 space-separated integers:
N (the number of prisoners), M (the number of sweets), and S (the prisoner ID), respectively.


Constraints
------------
1 <= T <= 100
1 <= N <= 10^9
1 <= M <= 10^9
1 <= S <= N


Output Format
--------------
For each test case, print the ID number of the prisoner who receives the poisoned sweet on a new line.


Sample Input
-------------
2
5 2 1
5 2 2

Sample Output
--------------
2
3

*/

import java.util.Scanner;

public class SaveThePrisoner {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int test_cases = scan.nextInt();

        for( int i = 0; i < test_cases; i++ ) {

            int n_prisoners = scan.nextInt();
            int n_sweets = scan.nextInt();
            int first_id = scan.nextInt();
            int last_id;

            n_sweets -= n_prisoners - first_id + 1;

            if( n_sweets < 0 ) {
                last_id = n_prisoners + n_sweets;
            } else {
                last_id = n_sweets % n_prisoners;
                if( last_id == 0 ) {
                    last_id = n_prisoners;
                }
            }

            System.out.println( last_id );
        }
    }
}