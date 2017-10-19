/*

File:    ViralAdvertising.java
Purpose: HackerRank Challenge, Viral Advertising
Author:  Lucas Brown
Version: 1.0
Date:    July 15, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new poduct, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e., floor(5/2) = 2) like the advertisement and each person shares it with 3 of their friends; the remaininging people (i.e., 5 - floor(5/2) = 3) delete the advertisement because it doesn't interest them. So, at the beginnging of the second day, floor(5/2) * 3 = 6 people receive the advertisement.

On the second day, half of the 6 people who received the advertisement share it with 3 new friends. So, at the beginning of the third day, floor(6/2) * 3 = 3 * 3 = 9 people receive the advertisement.

Assume that at the beginning of the ith day, m people received the advertisement, floor(m/2)  people like and share it with 3 new friends, and m - floor(m/2) people dislike and delete it. At the beginnign of the (i+1)th day, floor(m/2) * 3 people receive the advertisement.


Task
-----
Given an integer, n, find and print the total number of people who liked HackerLand Enterprise's advertisement during the first n days. It is guaranteed that no two people will have any friends in common and, after a person shares he advertisement with a friend, the friend always sees it the next day.


Input Format
-------------
A single integer, n, denoting the number of days.


Constraints
------------
1 <= n <= 50


Output Format
--------------
Print the number of people who liked the advertisement during the first n days.


Sample Input
-------------
3

Sample Output
--------------
9

*/

import java.util.Scanner;

public class ViralAdvertising {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int n_days = scan.nextInt();
        int n_people = 5;
        int n_like = 0;

        for( int i = 0; i < n_days; i++ ) {

            n_people /= 2;
            n_like += n_people;
            n_people *= 3;
        }

        System.out.println( n_like );
    }
}