/*
***** Background *****
Maria plays n games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as score = [s0, s1, ... , sn-1]. After each game i, she checks to see if score si breaks her record for most or least points scored so far during the season.

***** Task *****
Given Maria's array of scores for a season of n games, find and print the number of times she breaks her record for most and least points scored during the season.
NOTE: Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

***** Input Format *****
The first line contains an integer denoting n (the number of games)
The second line contains n space-separated integers describing the respective values of s0, s1, ... ,sn-1

***** Constraints *****
1 <= n <= 1000
0 <= si <= 10^8
*/

#include <iostream>

int main(){
    short n;
    int score, record_high, record_low;
    int high_break=0;
    int low_break=0;
    
    std::cin >> n;
    std::cin >> record_high;    // First game of the season sets high and low record
    record_low = record_high;

    for(int i=1; i<n; i++){
        std::cin >> score;
        if( score > record_high){
            record_high = score;
            high_break++;
        } else if ( score < record_low ){
            record_low = score;
            low_break++;
        }
    }

    std::cout << high_break << " " << low_break << std::endl;
    return 0;
}


/*
SAMPLE INPUT
9
10 5 20 20 4 5 2 25 1


EXPECTED OUTPUT
2 4
*/