/*

File:    BigSorting.java
Purpose: HackerRank Challenge, Big Sorting
Author:  Lucas Brown
Version: 1.0
Date:    July 17, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Consider an array of numeric strings, unsorted, where each string is a positive number anywhere from 1 to 10^6 digits. Sort the array's elements in non-decreasing (ascending) order of their real-world integer values and print each element of the sorted array on a new line.


Input Format
-------------
The first line contains an integer, n, denoting the number of strings in unsorted.
Each of the n subsequent lines contains a string of integers describing an element of the array.


Constraints
------------
1 <= n <= 2x10^5
Each string is guaranteed to represent a positive integer without leading zeros.
The total number of digits across all strings in unsorted is between 1 and 10^6 inclusive.


Output Format
--------------
Print each element of the sorted array on a new line.


Sample Input
-------------
6
31415926535897932384626433832795
1
3
10
3
5

Sample Output
--------------
1
3
3
5
10
31415926535897932384626433832795

*/

import java.util.Scanner;
import java.math.BigInteger;

public class BigSorting {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( Sytem.in );
        
        // Input
        int n = scan.nextInt();
        String[] unsorted = new String[n]; 
        for( int i = 0; i < n; i++ ) {
            unsorted[i] = scan.next();
        }
        scan.close();
    }
}

