/*

File:    BotSavesPrincess.java
Purpose: HackerRank Challenge, Bot saves princess
Author:  Lucas Brown
Version: 1.0
Date:    July 19, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Princess Peach is trapped in one of the four corners of a square grid. You are in the center of the grid and can move one step at a time in any of the four directions. Can you rescue the princess?


Input Format
-------------
The first line contains an odd integer N ( 3 <= N < 100 ) denoting the size of the grid. This is followed by an NxN grid. Each cell is denoted by "-" ( ascii value: 45 ). The bot position is denoted by "m" and the princess position is denoted by "p".

Grid is indexed using Matrix Convention.

| (0, 0)    (0, 1)    (0, 2) |
| (1, 0)    (1, 1)    (1, 2) |
| (2, 0)    (2, 1)    (2, 2) |


Output Format
--------------
Print out the moves you will take to rescue the princess in one go. The moves must be separated by "\n", a new line. The valid moves are LEFT or RIGHT or UP or DOWN.


Sample Input
-------------
3
---
-m-
p--

Sample Output
--------------
DOWN
LEFT

*/

import java.util.Scanner;

public class BotSavesPrincess {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int[] princess = new int[2];
        int[] bot = new int[2];

        int grid_size = scan.nextInt();
        scan.nextLine();  // Eat newline character after int input

        for( int i = 0; i < grid_size; i++ ) {
        
            String row = scan.nextLine();
            String[] cell = row.split("");

            for( int j = 0; j < grid_size; j++ ) {

                if( cell[j].equals("p") ) {
                    princess[0] = i;
                    princess[1] = j;
                } else if( cell[j].equals("m") ) {
                    bot[0] = i;
                    bot[1] = j;
                }
            }
        }

        /*/ Remove for submission
        System.out.printf( "%nPrincess: (%d, %d)%n", princess[0], princess[1] );
        System.out.printf( "Bot     : (%d, %d)%n%n", bot[0], bot[1] );
        /**/


        // Positive i_dis means bot needs to move down
        // Positive j_dis means bot needs to move up
        int i_dis = princess[0] - bot[0];
        int j_dis = princess[1] - bot[1];

        while( i_dis != 0 && j_dis != 0 ) {
        
            if( i_dis > 0 ) {
                System.out.println( "DOWN" );
                i_dis--;
            } else if( i_dis < 0 ) {
                System.out.println( "UP" );
                i_dis++;
            }

            if( j_dis > 0 ) {
                System.out.println( "RIGHT" );
                j_dis--;
            } else if( j_dis < 0 ) {
                System.out.println( "LEFT" );
                j_dis++;
            }
        }

    }
}