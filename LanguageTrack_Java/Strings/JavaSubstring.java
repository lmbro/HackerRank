/*

File:    JavaSubstring.java
Purpose: HackerRank Challenge, Java Substring
Author:  Lucas Brown
Version: 1.0
Date:    August 1, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1. 


Input Format
-------------
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.


Constraints
------------
1 <= s.length() <= 100
0 <= start < end <= n
String s consists of English alphabetic letters (i.e., [a-zA-Z]) only.


Output Format
--------------
Print the substring in the inclusive range from start to end-1.


Sample Input
-------------
Helloworld
3 7

Sample Output
--------------
lowo

*/

import java.util.Scanner;

public class JavaSubstring {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        String str = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println( str.substring( start, end ) );
    }
}