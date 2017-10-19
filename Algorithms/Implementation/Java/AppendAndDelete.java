/*

File:    AppendAndDelete.java
Purpose: HackerRank Challenge, Append and Delete
Author:  Lucas Brown
Version: 1.0
Date:    August 28, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
You have a string, s, of lowercase English alphabetic letters. You can perform two types of operations on s:

1. Append a lowercase English alphabetic letter to the end of the string.
2. Delete the last character in the string. Performing this operation on an empy string results in an empty string.


Task
-----
Given an integer, k, and two strings, s and t, determine whether or not you can convert s to t by performing EXACTLY k of the aboe operations on s. If it's possible, print Yes; otherwise, print No.


Input Format
-------------
The first line contains a string, s, denoting the initial string.
The second line contains a string, t, denoting the desired final string. The third line contains an integer, k, denoting the desired number of operations. 


Output Format
--------------
Print Yes if you can obtain string t by performing exactly k operations on s; otherwise, print No.


Constraints
------------
1 <= s.length() <= 100
1 <= t.length() <= 100
1 <= k <= 100
s and t consist of lowercase English alphabetic characters.


Sample Input
-------------
hackerhappy
hackerrank
9

Sample Output
--------------
Yes

*/

import java.util.Scanner;

public class AppendAndDelete {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        String initial = scan.nextLine();
        String target = scan.nextLine();
        int operationsDesired = scan.nextInt();
        scan.close();

        int operationsRequired = 0;
        int minStringLength = Math.min( initial.length(), target.length() );

        // Due to the nature of the problem, we only need to search from the beginning of the strings until we find  a character that does not match. Every character after this must be deleted and added. If the strings vary in length, additional characters must be added or removed, which is handled after this loop.
        for( int i = 0; i < minStringLength; i++ ) {

            if( initial.charAt(i) != target.charAt(i) ) {
                operationsRequired = 2*( minStringLength - i );
                break;
            }
        }
        operationsRequired += Math.max( initial.length(), target.length() ) - minStringLength;


        if( operationsRequired % operationsDesired == 0 ) {
            System.out.println( "Yes" );
        } else {
            System.out.println( "No" );
        }
    }
}