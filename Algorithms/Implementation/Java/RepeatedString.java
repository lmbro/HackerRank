/*

File:    RepeatedString.java
Purpose: HackerRank Challenge, Repeated String
Author:  Lucas Brown
Version: 1.0
Date:    September 12, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.


Task
-----
Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.


Input Format
-------------
The first line contains a single string, s.
The second line contains an integer, n.


Output Format
--------------
Print a single integer denoting the number of letter a's in the first n letters of the infinite string created by repeating s infinitely many times.


Constraints
------------
1 <= s.length() <= 100
1 <= n <= 10^12
For 25% of the test cases, n <= 10^6


Sample Input 0
---------------
aba
10


Sample Output 0
----------------
7


Sample Input 1
---------------
a
1000000000000


Sample Output 1
----------------
1000000000000

*/

import java.util.Scanner;

public class RepeatedString {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        String str = scan.nextLine();
        long rpt = scan.nextLong();
        scan.close();

    }
}
        