/*

File:    Day1_OnceInATram.java
Purpose: HackerRank Competition, Week of Code 34, Day 1: Once in a Tram
Author:  Lucas Brown
Version: 1.0 
Date:    7/17/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
One day, Jack was going home by tram. When he got his ticket, he noticed that the number on the ticket was not lucky. A lucky ticket is a six-digit number on the ticket in which the sume of the first three digits is equal to the sum of the last three digits.

For example, the number 165912 is lucky because 1 + 6 + 5 = 12 and 9 + 1 + 2 = 12.

Since the number on the ticket wasn't lucky, Jack needs you help to find the next lucky ticket number.

For example, if Jack's ticket number is 165901, then the next lucky ticket number is 165903.


Task
-----
Given Jack's current ticket number, find and print the next lucky ticke number.


Input Format
-------------
The firt line contains an integer, x, denoting the 6-digit number on the ticket.


Constraints
------------
10^5 <= x <= 10^6 - 2


Output Format
--------------
For the given input, find and print the next lucky ticket number.


Sample Input
-------------
555555

Sample Output
--------------
555564

*/


import java.util.Scanner;

/**
 * HackerRank Competition, Week of Code 34, Day 1
 * Challenge: Once in a Tram
 * Read comments at beginning of this source file for details
 * 
 * @author Lucas Brown
 * @version 1.0
 */
public class Day1_OnceInATram {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int ticket = scan.nextInt();
    
        int[] digit = new int[6];
        int[] sum = new int[2]; // sum[0] = digit[0] + digit[1] + digit[2]

        // Break tickent number into an array of it's digits
        for( int i = 0; i < 6; i++ ) {

            digit[i] = ticket % 10;
            ticket /= 10;
        }

        // Find sum of the first three and last three digits
        sum[0] = digit[0] + digit[1] + digit[2];
        sum[1] = digit[3] + digit[4] + digit[5];

        // We want the next lucky ticket, even if the one we're given is lucky
        do { 
            incrementDigit( digit, sum, 0 );  // sum is updated in incrementDigit
        } while( sum[0] != sum[1] );

        // Output answer
        for( int i = 5; i >= 0; i-- ) {
            System.out.print( digit[i] );
        }
        System.out.println( "" );
    }

    /**
     * incrementDigit increases the number held in the digit array by one and updates the sum array, containing the sum of the first three and last three digits.
     * 
     * This method written for 6 digit numbers - please see the "Constraints" section at the top of this source file.
     * 
     * @param digit - integer array containing digits of number ( d[0] = one's place )
     * @param sum - integer array contianing sum of first three (sum[0]) and last three (sum[1]) digits
     * @param i - integer to increment
     * @return void
     */
    public static void incrementDigit( int[] digit, int[] sum, int i ) {

        if( digit[i] == 9 ) {
            digit[i] = 0;
            incrementDigit( digit, sum, i+1 );
        } else {
            digit[i]++;
            if( i > 2 ) {
                sum[1] = digit[3] + digit[4] + digit[5];
            }
            sum[0] = digit[0] + digit[1] + digit[2];
        }
        return;
    } 

}