/*

File:    JavaSubstringComparisons.java
Purpose: HackerRank Challenge, Java Substring Comparisons
Author:  Lucas Brown
Version: 1.0
Date:    August 1, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Given a string s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substring of length k.


Input Format
-------------
The first line contains a string denoting s.
The second line contains an integer denoting k.


Constraints
------------
1 <= s.length() <= 1000
s consists of English alphabetic letters only.


Output Format
--------------
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.


Sample Input
-------------
welcometojava
3

Sample Output
--------------
ava
wel

*/

import java.util.Scanner;

public class JavaSubstringComparisons {
  
    public static String getSmallestAndLargest( String str, int k ) {

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String smallest = "z";  // z is lexicographically largest letter
        String largest = "A";   // A is the lexicographically smallest letter

        for( int i = 0; i+k <= str.length(); i++ ) {
            
            String substr = str.substring( i, i+k );

            if( substr.compareTo(smallest) < 0 ) {
                smallest = substr;
            }

            if( substr.compareTo(largest) > 0 ) {
                largest = substr;
            }
        }
       
        return smallest + "\n" + largest;
    }

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */