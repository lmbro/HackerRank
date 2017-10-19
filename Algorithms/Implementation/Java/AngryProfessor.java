/*

File:    AngryProfessor.java
Purpose: HackerRank Challenge, Angry Professor
Author:  Lucas Brown
Version: 1.0
Date:    August 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts.


Task
-----
Given the arrival time of each student, determine if the class is canceled.


Input Format
-------------
The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the class) and K (the cancellation threshold). The second line contains N space-separated integers (a1, a2, ..., aN) describing the arrival times for each student.

NOTE: Non-positive arrival times (ai <= 0) indicate that the student arrived early or on time; positive arrival times (ai > 0) indicate the student arrived ai minutes late.


Output Format
--------------
For each test case, print the word YES if the class is canceled or NO if it is not.


Constraints
------------
1 <= T <= 10
1 <= N <= 1000
1 <= K <= N
-100 <= a[i] <= 100


Sample Input
-------------
2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output
--------------
YES
NO

*/

import java.util.Scanner;

public class AngryProfessor {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int numTests = scan.nextInt();
        for( int i = 0; i < numTests; i++ ) {

            int numStudents = scan.nextInt();
            int cancelThreshold = scan.nextInt();
            
            int onTimeStudents = 0;
            for( int j = 0; j < numStudents; j++ ) {
            
                int arrivalTime = scan.nextInt();
                if( arrivalTime <= 0 ) {
                    onTimeStudents++;
                }
            }

            if( onTimeStudents < cancelThreshold ) {
                System.out.println( "YES" );
            } else {
                System.out.println( "NO" );
            }

        }

        scan.close();
    }
}
