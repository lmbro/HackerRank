/*

File:    LibraryFine.java
Purpose: HackerRank Challenge, Library Fine
Author:  Lucas Brown
Version: 1.0
Date:    September 8, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structures is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e., fine = 0).
fine = 0 Hackos

2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date:
fine = 15 Hackos * ( the number of days late )

3. If the book is returned after the expected return month, but still within the same calendar year as the expecdted return date:
fine = 500 Hackos * ( the number of months late )

4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10,000 Hackos.
fine = 10,000 Hackos


Input Format
-------------
The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned. 
The second line contains 3 space-separated integers dentoing the respective day, month, and year on which the book was expected to be returned ( the due date ).


Output Format
--------------
Print a single integer denoting the library fine for the book received as input.


Constraints
------------
1 <= D <= 31
1 <= M <= 12
1 <= Y <= 3000
It is guaranteed that the dates will be valid Gregorian calendar dates.


Sample Input
-------------
9 6 2015
6 6 2015

Sample Output
--------------
45

*/

import java.util.Scanner;


public class LibraryFine {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int[] returned = new int[3];
        int[] due = new int[3];

        // Sorry America, Day/Month/Year makes way more sense.

        returned[0] = scan.nextInt();
        returned[1] = scan.nextInt();
        returned[2] = scan.nextInt();

        due[0] = scan.nextInt();
        due[1] = scan.nextInt();
        due[2] = scan.nextInt();

        if( returned[2] > due[2] ) {
            System.out.println( 10000 );
        } else if( returned[2] == due[2] && returned[1] > due[1] ) {
            System.out.println( 500 * ( returned[1] - due[1] ) );
        } else if( returned[2] == due[2] && returned[1] == due[1] && returned[0] > due[0] ) {
            System.out.println( 15 * ( returned[0] - due[0] ) );
        } else {
            System.out.println( 0 );
        }
    }
}