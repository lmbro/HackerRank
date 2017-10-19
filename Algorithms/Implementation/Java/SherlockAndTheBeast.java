/*

File:    SherlockAndTheBeast.java
Purpose: HackerRank Challenge, Sherlock and The Beast
Author:  Lucas Brown
Version: 1.0
Date:    August 29, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggest Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue - a number, N. Sherlock determines the key to removing the virus is to find the largest Decent Number having N digits.

A Decent Number has the following properties:
1. It's digits can only be 3's and/or 5's
2. The number of 3's it contains is divisible by 5.
3. The number of 5's it contains is dvisible by 3.
4. If there are more than one such number, we pick the largest one.

Moriarty's virust shows a clock cowning


Task
-----
Moriarty's virus shows a clock counting down to The Beast's desctruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!


Input Format
-------------
The first line is an integer, T, dentoing the number of test cases.
The T subsequent lines each contain an integer, N, detailing the number of digits in the number.


Output Format
--------------
Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.


Constraints
------------
1 <= T <= 20
1 <= N <= 100000


Sample Input
-------------
4
1
3
5
11

Sample Output
--------------
-1
555
33333
55555533333

*/

import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int testCases = scan.nextInt();

        for( int i = 0; i < testCases; i++ ) {

            int digits = scan.nextInt();
            int numFives = 0;
            int numThrees = 0;

            for( int j = 0; j*3 <= digits; j++ ) {

                if( (digits - j*3) % 5 == 0 ) {
                    numFives = j*3;
                    numThrees = digits - numFives;
                }

            }

            if( numFives == 0 && numThrees == 0 ) {
                System.out.println( "-1" );
                continue;
            }

            for( int five = 0; five < numFives; five++ ) {
                System.out.print( "5" );
            }
            for( int three = 0; three < numThrees; three++) {
                System.out.print( "3" );
            }
            System.out.println();
        }
    }
}