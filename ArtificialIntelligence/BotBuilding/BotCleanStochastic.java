/*

File:    BotCleanStochastic.java
Purpose: HackerRank Challenge, Bot Clean Stochastic
Author:  Lucas Brown
Version: 1.0
Date:    August 3, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.

---------------
IMPORTANT NOTE
---------------
This problem seems the same as the BotClean.java challenge. Aside from slightly changing the method name from next_move to nextMove (to conform to challenge), I copied my code from BotClean.java and recieved full credit. I'm including this file for completeness.


Background
-----------
A deterministic environment is one where the next state is completely determined by the current state of the environment and the task executed by the agent. If there is any randomness involved in determining the next state, the environment is stochastic.


Task
-----
he game Bot Clean took place in a deterministic environment. In this version, the bot is given 200 moves to clean as many dirty cells as possible. The grid initially has 1 dirty cell. When the bot cleans this cell, a new cell in the grid is made dirty. The new cell can be anywhere in the grid.

The bot here is positioned at the top left corner of a 5*5 grid. Your task is to move the bot to appropriate dirty cell and clean it.


Input Format
-------------
The first line contains two space separated integers which indicate the current position of the bot.
The board is indexed using Matrix Convention.
5 lines follow representing the grid. Each cell in the grid is represented by any of the following 3 characters: 'b' indicates the bot's current position, 'd' indicates a dirty cell, and '-' indicates a clear cell in the grid.

NOTE: If the bot is on a dirty cell, the cell will still have a 'd' on it.


Output Format
--------------
The output is the action that is taken by the bot in the current step, and it can be either one of the movements in 4 directions or cleaning up the cell in which it is currently located. The valid output strings are LEFT, RIGHT, UP, DOWN, or CLEAN. If the bot ever reaches a dirty cell, output CLEAN to clean the dirty cell. Repeat this process until all the cells on the grid are cleaned.


Sample Input
-------------
0 0
b---d
-----
-----
-----
-----

Sample Output
--------------
RIGHT

*/

import java.util.Scanner;

public class BotCleanStochastic {

    static void nextMove( int posr, int posc, String[] board ) {

        char[][] grid = new char[5][5];
        int min_dis = 99;
        int dis_x = 0;
        int dis_y = 0;

        for( int i = 0; i < board.length; i++ ) {
            grid[i] = board[i].toCharArray();
            for( int j = 0; j < grid.length; j++ ) {

                if( grid[i][j] != 'd' ) {
                    continue;
                }

                int dis = Math.abs(j - posc) + Math.abs(i - posr);
                if( dis < min_dis ) {
                    min_dis = dis;
                    dis_x = j - posc;
                    dis_y = i - posr;
                }                
            }
        }

        if( min_dis == 0 ) {
            System.out.println( "CLEAN" );
        } else if( dis_x > 0 ) {
            System.out.println( "RIGHT" );
        } else if( dis_x < 0 ) {
            System.out.println( "LEFT" );
        } else if( dis_y < 0 ) {
            System.out.println( "UP" );
        } else {
            System.out.println( "DOWN" );
        }      
        
    }    

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        nextMove(pos[0], pos[1], board);
    }
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */