/*

File:    JavaStringReverse.java
Purpose: HackerRank Challenge, Java String Reverse
Author:  Lucas Brown
Version: 1.0
Date:    August 2, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given a string A, print Yes if it is a palindrome, print No otherwise.


Constraints
------------
A will consist of at most 50 lower case English letters.


Sample Input
-------------
madam

Sample Output
--------------
Yes

*/

import java.util.Scanner;
import java.util.Arrays;

public class JavaStringReverse {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        char[] strA = scan.next().toCharArray();

        System.out.println( isPalindrome(strA) );
    }

    public static String isPalindrome( char[] strA ) {

        if( strA.length == 1 ) {
            return "Yes";
        }
        
        if( strA[0] == strA[strA.length-1] ) {
            if( strA.length == 2 ) {
                return "Yes";
            } else {
                return isPalindrome( Arrays.copyOfRange( strA, 1, strA.length-1 ) );
            }
        }

        return "No";
    }
}