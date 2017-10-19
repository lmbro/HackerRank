/*

File:    JumpingOnTheCloudsRevisited.java
Purpose: HackerRank Challenge, Jumping on the Clouds: Revisited
Author:  Lucas Brown
Version: 1.0
Date:    MONTH DAY, YEAR

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Aerith is playing a cloud game! In this game, there are n clouds numbered sequentially from 0 to n-1. Each cloud is either an ordinary cloud or a thundercloud.

Aerith starts on cloud 0 with energy level E = 100. She can use 1 unit of energy to make a jump of size k to cloud (i+k)%n, and she jumps until she gets back to cloud 0. If Aerith lands on a thunderclod, her energy (E) decreases by 2 additional units. The game ends when Aerith lands back on cloud 0.


Task
-----
Given the values of n, k, and the configuration of the clouds, can you determine the final value of E after the game ends?


Input Format
-------------
The first line contains two space-separated integers, n (the number of clouds) and k (the jump distance), respectively.
The second line contains n space-separated integers describing the respective values of clouds c[0], c[1], ..., c[n-1].
    if c[i] = 0, c[i] is an ordinary cloud
    if c[i] = 1, c[i] is a thundercloud


Constraints
------------
2 <= n <= 25
1 <= k <= n
n % k = 0
c[i] is either 1 or 0


Output Format
--------------
Print the final value of E on a new line


Sample Input
-------------
8 2
0 0 1 0 0 1 1 0

Sample Output
--------------
92

*/

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    public static void main( String[] args ) {

        // Game parameters
        Scanner scan = new Scanner( System.in );
        int n_clouds = scan.nextInt();
        int k_jump = scan.nextInt();
        int[] cloud_types = new int[n_clouds];
        for( int i = 0; i < n_clouds; i++ ) {
            cloud_types[i] = scan.nextInt();
        }
        scan.close();

        // Begin game
        int energy = 100;
        int current_cloud = 0;
        do {
            current_cloud = ( current_cloud + k_jump ) % n_clouds;
            if( cloud_types[current_cloud] == 1 ) {
                energy -= 3;
            } else {
                energy -= 1;
            }
        } while( current_cloud != 0 );

        // Game Won!
        System.out.println( energy );
    }
}