/*

File:    ArmyGame.java
Purpose: HackerRank Challenge, Army Game
Author:  Lucas Brown
Version: 1.0
Date:    July 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Luke is daydreaming in Math class. He has a sheet of graph paper with n rows and m columns, and he imagines tht there is an army base in each cell for a total of n*m bases. He wants to drop supplies at strategic points on the sheet, marking each drop point with a red dot. If a base contains at least one package inside or on top of its border fence, then it's cosidered to be supplied.


Task
-----
Given n and m, what's the minimum number of packages that Luke must drop to supply all of his bases?


Input Format
-------------
Two space-separated integers describing the respective values of n and m.


Constraints
------------
0 < n,m <= 1000


Output Format
--------------
Print a single integer denoting the minimum number of supply packages Luke must drop.


Sample Input
-------------
2 2

Sample Output
--------------
1

*/

import java.util.Scanner;

public class ArmyGame {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int packages = 0;

        if( rows % 2 != 0 ) {
            packages += (int)Math.ceil( columns / 2.0 );
            rows--;
        }
        if( columns % 2 != 0 ) {
            packages += rows / 2;
            columns--;
        }

        packages += ( rows * columns ) / 4;           

        System.out.println( packages );
    }
}