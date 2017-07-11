/*

Leaderboard.java
Purpose: HackerRank Challenge, Climbing the Leaderboard

Author: Lucas Brown
Version: 1.0 7/10/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she beats each level? The game uses Dense Ranking, so it's leaderboard works like this:
- Dense Ranking:
	- The player(s) with the highest score is ranked number 1 on the leaderboard
	- Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number
	- Example: Four players with the scores 100, 90, 90, and 80 would be ranked 1, 2, 2, and 3, respectively

When Alice starts playing, there are already n people on the leaderboard. The score of each player i is denoted by s[i]. Alice plays for m levels, and we denote her total score after passting each level j as alice[j]. After completing each level, Alice wants to know her current rank.


Task
-----
You are given an array, scores, of monotonically decreasing leaderboard scores, and another array alice of Alice's cumulative scores for each level of the game. You must print m integers. The jth integer should indicate the current rank of alice after passing the jth level.


Input Format
-------------
The first line contains an integer, n, denoting the number of players already on the leaderboard.
The next line contains n space-separated integers describing the respecte values of scores scores[0], scores[1], ... , scores[n-1]
The next line contains an integer, m, denoting the number of levels Alice beats
The last line contains m space-separated itegers describing the respective values of alice[0], alice[1], ... , alice[m]


Constraints
------------
1 <= n <= 2x10^5
1 <= m <= 2x10^5
0 <= scores[i] <= 10^9 for 0 <= i < n
0 <= alice[j] <= 10^9 for 0 <= j < m
The existing leaderboard, scores[i], is in descending order
Alice's scores are cumulative, so alice is in ascending order


Output Format
--------------
Print m integers. The jth integer should indicate the rank of alice after passing the jth level.


Sample Input
-------------
7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output
-------------
6
4
2
1

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Leaderboard {

	public static void main( String[] args ) {

		Scanner scan = new Scanner( System.in );

		ArrayList<Integer> scoreboard = new ArrayList<Integer>();

		int n_players = scan.nextInt();
		int score = scan.nextInt();
		scoreboard.add( score );
		for( int i = 1; i < n_players; i++ ) {
			score = scan.nextInt();
			if( score != scoreboard.get( scoreboard.size() - 1 ) ) {
				scoreboard.add( score );
			}
		}

		int n_levels = scan.nextInt();
		int[] rank = { scoreboard.size() };
		for( int i = 0; i < n_levels; i++ ) {
			score = scan.nextInt();
			System.out.println( getRank( score, rank, scoreboard ) );
		}
			
	}

	public static int getRank( int score, int[] rank, ArrayList<Integer> scoreboard ) {

		if( score < scoreboard.get( scoreboard.size() - 1 ) ) {
			return rank[0] + 1;
		}

		for( int i = rank[0]-1; i >= 0; i-- ) {
			
			if( score == scoreboard.get(i) ) {
				rank[0] = i + 1;
				return rank[0];
			} else if( score < scoreboard.get(i) ) {
				rank[0] = i + 2;
				return rank[0];
			}
		}
		rank[0] = 1;
		return rank[0];
	}
}

			




