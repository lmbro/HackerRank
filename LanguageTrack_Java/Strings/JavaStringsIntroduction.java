/*

File:    JavaStringsIntroduction.java
Purpose: HackerRank Challenge, Java Strings Introduction
Author:  Lucas Brown
Version: 1.0
Date:    August 1, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given two strings of lowercase English letters, A and B, perform the following operations:
1. Sum the lengths of A and B
2. Determine if A is lexicographically larger than B (i.e. does B come before A in the dictionary?).
3. Capitalize the first letter in A and B and print them on a single line, separated by a space.


Input Format
-------------
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.


Constraints
------------
The strings are comprised of only lowercase English letters.


Output Format
--------------
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically larger than B or No if it's not.
For the third line, capitalie the first letter in both A and B and print them on a single line, separated by a space.


Sample Input
-------------
hello
java

Sample Output
--------------
9
No
Hello Java

*/

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String strA = scan.next();
        String strB = scan.next();

        // Task 1: Print the sum of the lengths of A and B
        System.out.println( strA.length() + strB.length() );

        // Task 2: Determine if A is lexicographically larger than B
        if( strA.compareTo( strB ) > 0 ) {
            System.out.println( "Yes" );
        } else {
            System.out.println( "No" );
        }

        // Task 3: Capitalize the first letter in both A and B and print them on a single line, separated by a space.
        System.out.printf( "%s %s%n", capitalize(strA), capitalize(strB) );
    }

    public static String capitalize( String str ) {

        str = str.toLowerCase();
        char[] strArray = str.trim().toCharArray();
        strArray[0] = Character.toUpperCase( strArray[0] );

        return new String(strArray);
    }

    /**
     * This function is from the Editorial on HackerRank, read after the challenge was complete. I'm including it here for my own personal reference
     * 
     * @author HackerRank user Shafaet
     * @see <a href="https://www.hackerrank.com/challenges/java-strings-introduction/editorial">Java Strings Introduction Editorial</a>
     */
    public static String capitalizeFirstLetter(String original) {
    if (original == null || original.length() == 0) {
        return original;
    }
    return original.substring(0, 1).toUpperCase() + original.substring(1);
}