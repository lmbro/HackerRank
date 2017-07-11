/**

HurdleRace.java
Purpose: HackerRank Challenge, The Hurdle Race

Author: Lucas Brown
Version: 1.0 7/10/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Dan is playing a video game in which his character competes in a hurdle race by jumping over n hurdles with heights h[0], h[1], ... , h[n-1]. He can initially jumpa a maximum height of k units, but he has an unlimited supply of magic beverages that help him jump higher! Each time Dan drinks a magic beverage, the maximum height he can jump during the race increases by 1 unit.


Task
-----
Given n, k, and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.


Input Format
-------------
The first line contains two space-separated integers describing the respective values of n (the number of hurdles) and k (the maximum height he can jump without consuming any beverages).
The second line contains n space-separated integers describing the respective values of h[0], h[1], ..., h[n-1].


Constraints
------------
1 <= n, k <= 100
1 <= h[i] <= 100


Output Format
--------------
Print an integer denoting the minimum number of magic beverages Dan must drink to complete teh hurdle race.


Sample Input 0
---------------
5 4
1 6 3 5 2

Sample Output 0
----------------
2


Sample Input 1
---------------
5 7
2 5 4 5 2

Sample Output 1
----------------
0

*/

import java.util.Scanner;

public class HurdleRace {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_hurdles = scan.nextInt();
        int h_max = scan.nextInt();
        int magic_drinks = 0;
        int h_i;

        for( int i = 0; i < n_hurdles; i++ ) {
            h_i = scan.nextInt();
            if( h_i > h_max ) {
                magic_drinks += ( h_i - h_max );
                h_max = h_i;
            }
        }

        System.out.print0ln( magic_drinks );
    }
}

