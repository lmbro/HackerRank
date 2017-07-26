/*

File:    BotSavesPrincess2.java
Purpose: HackerRank Challenge, Bot saves princess - 2
Author:  Lucas Brown
Version: 1.0
Date:    July 21, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
In this version of "Bot saves princess", Princess Peach and bot's position are randomly set. Can you save the princess?


Task
-----
Complete the function nextMove which takes in 4 parameters - an integer N, integers r and c indicating the row and column position of the bot and the character array grid - and output the next move the bot makes to rescue the princess.


Input Format
-------------
The first line of the input is N (<100), the size of the board (NxN). The second line of the input contains two space separated integers, which is the position of the bot.

Grid incexed using Matrix Convention.

The position of the princess is indicated by the character 'p' and the position of the bot is indicated by the character 'm' and each cell is denoted by '-'


Output Format
--------------
Output only the next move you take to rescue the princess. Valid moves are LEFT, RIGHT, UP, or DOWN.


Sample Input
-------------
5
2 3
-----
-----
p--m-
-----
-----

Sample Output
--------------
LEFT

*/

import java.util.Scanner;

public class BotSavesPrincess2 {

    static void nextMove( int n, int r, int c, String[] grid ) {

        for( int i = 0; i < n; i++ ) {
            
            String[] cell = grid[i].split("");

            for( int j = 0; j < n; j++ ) {

                if( cell[j].equals("p") ) {
                    if( i - r > 0 ) {
                        System.out.println( "DOWN" );
                        return;
                    } else if( i - r < 0 ) {
                        System.out.println( "UP" );
                        return;
                    }

                    if ( j - c > 0 ) {
                        System.out.println( "RIGHT" );
                        return;
                    } else if( j - c < 0 ) {
                        System.out.println( "LEFT" );
                        return;
                    }
                }
            }
        }                    
    }


/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);
    }
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */