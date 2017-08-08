/*

File:    Java1DArray_Part2.java
Purpose: HackerRank Challenge, Java 1D Array (Part 2)
Author:  Lucas Brown
Version: 1.0
Date:    August 7, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


---------------
IMPORTANT NOTE 
---------------
In the interest of giving credit where credit is due, I was unable to solve all test cases on my own. I reviewed the discussion section of this problem and found many solutions based around a depth-first search. This concept was new to me, so after reviewing and understanding code snippets various users were discussion and reading about the depth-first search, I implemented it. I did not copy another user's code, however I did read it to understand the concept so my implementation is very similar (though I feel most implementations of this would be very similar to one another).


Background
-----------
You're standing at index 0 of an n-element array named game. From some index i ( where 0 <= i < n ), you can perform the following moves:

    - Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
    - Move Forward:
        - If cell i+1 contains a zero, you can walk to cell i+1.
        - If cell i+leap contains a zero, you can jump to cell i+leap.
        - If you're standing in a cell n-1 or the value of i+leap >= n, you can walk or jump of the end of the array and win the game.

In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.


Task
-----
Given leap and game, complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).


Input Format
-------------
The first line contains an integer, q, denoting the number of queries (i.e., function calls). The 2*q subsequent lines describe each query over two lines:
1. The first line contains two space-separated integers describing the respective values of n and leap.
2. The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of game[0], game[1], ..., game[n-1].


Constraints
------------
1 <= q <= 5000
2 <= n <= 100
0 <= leap <= 100
It is guaranteed that the value of game[0] is always 0


Output Format
--------------
Return true if you can win the game; otherwise, return false.


Sample Input
-------------
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output
--------------
YES
YES
NO
NO

*/

import java.util.Scanner;

public class Java1DArray_Part2 {

    public static boolean canWin( int leap, int[] game ) {

        // This function seems a bit unneccessary, but I prefer not to edit HackerRank provided code regardless of whether or not it is editable in the HackerRank editor. I needed the third parameter so a new function had to be made.
        return solutionSearch( game, leap, 0 );
    }

    public static boolean solutionSearch( int[] game, int leap, int i ) {

        if( i < 0 || game[i] == 1 ) {
            // Landed on a 1 or out of lower bound
            return false;
        } else if( i + leap >= game.length || i + 1 >= game.length ) {
            // Made it to th end and completed the game!
            return true;
        }

        game[i] = 1;  // Mark cell as visited

        // Continue search for a successful path
        return solutionSearch(game,leap,i-1) || solutionSearch(game,leap,i+1) || solutionSearch(game,leap,i+leap);
    }

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int q = scan.nextInt();
        
        while( q-- > 0 ) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for( int i = 0; i < n; i++ ) {
                game[i] = scan.nextInt();
            }

            System.out.println( ( canWin(leap, game) ) ? "YES" : "NO" );
        }
        scan.close();
    }
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */