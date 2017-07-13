/**

JavaOutputFormatting.java
Purpose: HackerRank Challenge, CHALLENGE_NAME

Author: Lucas Brown
Version: 1.0 7/11/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Java's System.out.printf function can be used to print formatted output.


Task
-----
You must format and print the input to complete the solution.


Input Format
-------------
Every line of input will contain a String followed by an integer.
There are exactly three lines of input.


Constraints
------------
Each String will have a maximum of 10 alphabetic characters.
Each integer will be in the inclusive range from 0 to 999.


Output Format
--------------
In each line of output there should be two columns:
1. <String> left justified using exactly 15 characters
2. <integer> expressed as exactly 3 digits ( including padding zeros if necessary );


Sample Input
-------------
java 100
cpp 65
python 50


Sample Output
--------------
================================
java           100 
cpp            065 
python         050 
================================

*/

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String[] str_arr = new String[3];
        int[] int_arr = new int[3];
        for( int i = 0; i < 3; i++ ) {
            str_arr[i] = scan.next();
            int_arr[i] = scan.nextInt();
            // Catch newline character. Removed from submission (no newline characters in input stream). Left here for command-line use.
            scan.nextLine(); /**/ 
        }

        System.out.println( "================================" );
        for(int i = 0; i < 3; i++ ) {
            System.out.printf( "%-15s%03d%n", str_arr[i], int_arr[i] );
        }
        System.out.println( "================================" );
    }
}