/*

File:    JavaAnagrams.java
Purpose: HackerRank Challenge, Java Anagrams
Author:  Lucas Brown
Version: 1.0
Date:    August 2, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.


Input Format
-------------
The first line contains a string denoting a.
The second line contains a string denoting b.


Constraints
------------
1 <= length(a), length(b) <= 50
Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.


Output Format
--------------
Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.


Sample Input
-------------
anagram
margana

Sample Output
--------------
Anagrams

*/

import java.util.Scanner;

public class JavaAnagrams {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        char[] strA = scan.next().toLowerCase().toCharArray();
        char[] strB = scan.next().toLowerCase().toCharArray();

        if( checkAnagrams( strA, strB ) ) {
            System.out.println( "Anagrams" );
        } else {
            System.out.println( "Not Anagrams" );
        }

    }

    public static boolean checkAnagrams( char[] strA, char[] strB ) {

        if( strA.length != strB.length ) {
            return false;
        }

        int diff_letters = strA.length;

        for( int i = 0; i < strA.length; i++ ) {
            for( int j = 0; j < strB.length; j++ ) {

                if( strA[i] == strB[j] ) {
                    strB[j] = '$';
                    diff_letters--;
                    break;
                }
            }
        }
        
        if( diff_letters == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}