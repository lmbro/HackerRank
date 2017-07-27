/*

File:    Handshake.java
Purpose: HackerRank Challenge, Handshake
Author:  Lucas Brown
Version: 1.0
Date:    July 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
At the annual meeting of Board of Directors of Acme Inc, everyone starts shaking hands with everyone else in the room. Given the fact that any two persons shake hand exactly once, can you tell the total count of handshakes?


Input Format
-------------
The first line contans the number of test cases, T.
The next T lines each contain an integer N, the total number of Board of Directors of Acme.


Constraints
------------
1 <= T <= 1000
0 < N < 10^6


Output Format
--------------
Print the number of handshakes for each test-case in a new line.


Sample Input
-------------
2
1
2

Sample Output
--------------
0
1

*/

import java.util.Scanner;

public class Handshake {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_cases = scan.nextInt();

        for( int i = 0; i < n_cases; i++ ) {
            int n_people = scan.nextInt();
            System.out.println( n_people * ( n_people - 1 ) / 2 );
        }
    }
}