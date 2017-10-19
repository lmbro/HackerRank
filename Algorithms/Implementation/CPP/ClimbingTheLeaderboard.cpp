/*
***** Background *****
Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she beats each level? The game uses Dense Ranking, so it's leaderboard works like this:
- Dense Ranking:
	- The player(s) with the highest score is ranked number 1 on the leaderboard
	- Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number
	- Example: Four players with the scores 100, 90, 90, and 80 would be ranked 1, 2, 2, and 3, respectively

When Alice starts playing, there are already n people on the leaderboard. The score of each player i is denoted by s[i]. Alice plays for m levels, and we denote her total score after passting each level j as alice[j]. After completing each level, Alice wants to know her current rank.

***** Task *****
You are given an array, scores, of monotonically decreasing leaderboard scores, and another array alice of Alice's cumulative scores for each level of the game. You must print m integers. The jth integer should indicate the current rank of alice after passing the jth level.

***** Input Format *****
The first line contains an integer, n, denoting the number of players already on the leaderboard.
The next line contains n space-separated integers describing the respecte values of scores scores[0], scores[1], ... , scores[n-1]
The next line contains an integer, m, denoting the number of levels Alice beats
The last line contains m space-separated itegers describing the respective values of alice[0], alice[1], ... , alice[m]

***** Constraints *****
1 <= n <= 2x10^5
1 <= m <= 2x10^5
0 <= scores[i] <= 10^9 for 0 <= i < n
0 <= alice[j] <= 10^9 for 0 <= j < m
The existing leaderboard, scores[i], is in descending order
Alice's scores are cumulative, so alice is in ascending order

***** Output Format *****
Print m integers. The jth integer should indicate the rank of alice after passing the jth level.

*/

#include <cstdio>
#include <vector>

int main(){

	int n; // Number of players on leaderboard at start of program
	std::scanf( "%d", &n );

	int scores[n]; // Leaderboard at start program
	std::scanf( "%d", &scores[0] );
	std::vector<int> leaderboard = { scores[0] }; // Dynamic leaderboard, duplicates removed
	for( int i=1; i<n; i++){
		std::scanf( "%d", &scores[i] );
		if( scores[i] != scores[i-1] ){
			leaderboard.push_back( scores[i] );
		}
	}

	int m; // Number of games alice plays
	std::scanf( "%d", &m );

	int alice[m]; // Alice's rank, not score - we don't need to store score
	int score = 0;
	for( int j=0; j<m; j++ ){
		std::scanf( "%d", &score );

		// This needs to be replaced with a faster search algorithm
		for( int k=0; k<leaderboard.size(); k++ ){
			if( score == leaderboard[k] ){
				alice[j] = k+1;
				break;
			} else if( score > leaderboard[k] ){
				alice[j] = k+1;
				leaderboard.insert( leaderboard.begin() + k, score );
				break;
			} else {
				alice[j] = leaderboard.size() + 1;
			}
		}
	}
	

	for( int j=0; j<m; j++ ){
		std::printf( "%d\n", alice[j] );
	}
	return 0;
}

/*
SAMPLE INPUT 0
7
100 100 50 40 40 20 10
4
5 25 50 120

EXPECTED OUTPUT 0
6
4
2
1

*/
