/*

File:    ChocolateFeast.java
Purpose: HackerRank Challenge, Chocolate Feast
Author:  Lucas Brown
Version: 1.0
Date:    September 13, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Little Bobby loves chocolate, and he frequently goes to his favorite 5&10 store, Penny Auntie, with n dollars to buy chocolates. Each chocolate has a flat cost of c dollars, and the store has a promotion where they allow you to trade in m chocolate wrappers in exchange for 1 free piece of chocolate.

For example, if m = 2 and Bobby has n = 4 dollars that he uses to buy 4 chocolates at c = 1 dollar apiece, he can trade in the 4 wrappers to buy 3 more chocolates. Now he has 2 more wrappers that he can trade in for 1 more chocolate. Because he only has 1 wrapper left at this point, and 1 < m, he was only able to eat a total of 7 pieces of chocolate.


Task
-----
Given n, c, and m for t trips to the store, can you determine how many chocolates Bobby eats during each trip?

    t = trips to store
    n = money Bobby has
    c = cost of 1 candy
    m = number of wrappers to trade in for 1 candy


Input Format
-------------
The first line contains an integer, t, denoting the number of trips Bobby makes to the store. Each line i of the t subsequent lines contains three space-separated integers describing the respective n, c, and m values for one of Bobby's trips to the store.


Output Format
--------------
For each trip to Penny Auntie, print the total number of chocolates Bobby eats on a new line.


Constraints
------------
1 <= t <= 1000 ( t = trips to store )
2 <= n <= 10^5 ( n = money Bobby has )
1 <= c <= n    ( c = cost of 1 candy )
2 <= m <= n    ( m = number of wrappers to trade in for 1 candy )


Sample Input
-------------
3
10 2 5
12 4 4
6 2 2


Sample Output
--------------
6
3
5

*/

import java.util.Scanner;


public class ChocolateFeast {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int trips = scan.nextInt();

        for( int i = 0; i < trips; i++ ) {

            int money = scan.nextInt();
            int cost = scan.nextInt();
            int tradeForOne = scan.nextInt();

            int candies = money/cost;
            int wrappers = candies;

            while( wrappers >= tradeForOne ) {

                int newCandies = wrappers/tradeForOne;
                candies += newCandies;
                wrappers = newCandies + ( wrappers % tradeForOne );
            }

            System.out.println( candies );
        }
    }
}