/**

JavaDatatypes.java
Purpose: HackerRank Challenge, Java Datatypes

Author: Lucas Brown
Version: 1.0 7/11/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
For this excercise, we'll work with primitives used to hold integer values (byte, short, int, and long).


Task
-----
Given an input integer, you must determine which primitive data types are capable of properly storing that input.


Input Format
-------------
The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.


Output Format
--------------
For each input variable n and appropriate primitive dataType, you must determine if the given primitives (for int) are capable of storing it. If yes, then print:

"n can be fitted in: "
"* dataType"

If there is more than one appropriate data type, print each one on it's own line and order them by size ( byte < short < int < long ).

If the number cannot be stored in oe of the four aforementioned primitives, print the line:
"n can't be fitted anywhere."


Sample Input
-------------
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output
---------
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

*/

import java.util.Scanner;

public class JavaDatatypes {
    
    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int num_tests = scan.nextInt();

        for( int i = 0; i < num_tests; i++ ) {

            try {
                long n = scan.nextLong();

                String[] solution = { "* byte", "* short", "* int", "* long" };
                byte solution_index;
                if( -128 <= n && n <= 127 ) {
                    solution_index = 0;
                } else if ( -32768 <= n && n <= 32767 ) {
                    solution_index = 1;
                } else if ( -2147483648 <= n && n <= 2147483647 ) {
                    solution_index = 2;
                } else {
                    solution_index = 3;
                }

                System.out.printf( "%d can be fitted in:%n", n );
                for( int j = solution_index; j < 4; j++ ) {
                    System.out.println( solution[j] );
                }
            } catch( Exception e ) {
                String s = scan.next();
                System.out.printf( "%s can't be fitted anywhere.%n", s );
            }
        }
    }
}