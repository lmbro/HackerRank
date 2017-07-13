/**

SortingComparator.java
Purpose: HackerRank Challenge, Sorting: Comparator

@author  Lucas Brown
@version 1.0
July 12, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. The Player class is provided; it has two fields:

1. A string, name
2. An integer, score


Task
-----
Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare( Player a, Player b ) method implementing the Comparator.compare(T o1, T o2) method.


Input Format
-------------
Locked stub code in the Solution class handles the following input from stdin: 
The first line contains an integer, n, denoting the number of players.
Each of the n subsequent lines constains a player's respective name and score.


Constraints
------------
0 <= score <= 1000
Two or more players can have the same name.
Player names consist of lowercase English alphabetic letters.


Output Format
--------------
You are not responsible for printing any output to stdout. Locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.


Sample Input
-------------
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output
--------------
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50

*/

import java.util.*;

/**
 * @author Lucas Brown
 * @param a - the first player to compare
 * @param b - the second player to compare
 * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
 */
class Checker implements Comparator<Player> {

    public int compare( Player a, Player b ) {
        
        if( a.score > b.score ) {
            return -1;
        } else if ( a.score < b.score ) {
            return 1;
        } else {
            return a.name.compareTo( b.name );
        }
    }
}
/* --------------------------------------------------------------
        BEGIN (1/1): Code provided by HackerRank               */
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class SortingComparator {  // LMBRO: Changed class name from Solution to match filename

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
/*      END (1/1): Code provided by HackerRank
-------------------------------------------------------------- */