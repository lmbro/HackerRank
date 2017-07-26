/*

File:    BotClean.java
Purpose: HackerRank Challenge, Bot Clean
Author:  Lucas Brown
Version: 1.0
Date:    July 22, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
The goal of Artificial Intelligence is to create a rational agent. An agent gets input from the environment through sensors and acts on the environment with actuators. In this challenge, you will program a simple bot to perform the correct actions based on environmental input.

Meet the bot MarkZoid. It's a cleaning bot whose sensor is a head mounted camera and whose actuators are the wheels beneath. It's used to clean the floor.

The bot here is positioned at the top left corner of a 5x5 grid. Your task is to move the bot to clean all the dirty cells.


Task
-----
Complete the function next_move that takes in 3 parameters posr, posc being the co-ordinates of the bot's current position and board which indicates the board state to print the bot's next move.

The codechecker will keep calling the function next_move till the game is over or you make an invalid move.



Input Format
-------------
The first line contains two space separated integers which indicate the current position of the bot.
The board is indexed using Matrix Convention.
5 lines follow representing the grid. Each cell in the gride is represented by any of the following 3 characters: 'b' indicates the bot's current position, 'd' indicates a dirty cell, and '-' indicates a clear cell in the grid.

NOTE: If the bot is on a dirty cell, the cell will still have a 'd' on it.


Output Format
--------------
The output is the action that is taken by the bot in the current step, and it can be either one of the movements in 4 directions or cleaning up the cell in which it is currently located. The valid output strings are LEFT, RIGHT, UP, DOWN, or CLEAN. If the bot ever reaches a dirty cell, output CLEAN to clean the dirty cell. Repeat this process until all the cells on the grid are cleaned.


Sample Input 0
---------------
0 0
b---d
-d--d
--dd-
--d--
----d

Sample Output 0
----------------
RIGHT


Sample Input 1
---------------
0 1
-b--d
-d--d
--dd-
--d--
----d

Sample Output 1
----------------
DOWN

*/

public class BotClean {

    static void next_move(int posr, int posc, String[] board){
        
        String move = null

        int row = posr;
        int col = posc;

        while( move.equals( null ) ) {
            

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
        next_move(pos[0], pos[1], board);
    }
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */