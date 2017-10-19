/*

File:    ManasaAndStones.java
Purpose: HackerRank Challenge, Manasa and Stones
Author:  Lucas Brown
Version: 1.0
Date:    September 27, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. 

NOTE: The numbers on the stones are in increasing order.


Task
-----
Given that the number on the first stone was 0, find all the possible values for the number on the last stone.


Input Format
-------------
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n ( the number of stones ). The second line contains a, and the third line cotains b.


Output Format
--------------
Space-separated list of numbers which are the possible values of the last stone in increasing order.


Constraints
------------
1 <= T <= 10
1 <= n, a, b, <= 10^3


Sample Input
-------------
2
3 
1
2
4
10
100


Sample Output
--------------
2 3 4 
30 120 210 300 

*/


import java.util.Scanner;

public class ManasaAndStones {

    /*
    We know that the difference between two numbers is either a or b - let's call the spaces gaps.
    At minimum, 0 gaps are a apart ( and n-1 gaps are b apart ). Note there are n-1 gaps for n stones.
    At maximum, n-1 gaps are a apart ( and 0 gaps are b apart ).

    Since the first stone's number is zero, the last stone's number = a_gaps*a + b_gaps*b
    To find the possible values for the last stone's number given a and b, solve the equation for a_gaps = 0, 1, 2, ..., n-1
    Note that b_gaps = (n-1) - a_gaps

    To list the possible numbers for smallest to largest, let b be the smaller number and solve starting at a_gaps = 0.
    */
    public static void main( String[] args ) {
        
        Scanner scan = new Scanner( System.in );
        int testCases = scan.nextInt();
        
        for( int i = 0; i < testCases; i++ ) {

            int stones = scan.nextInt();
            int diffA = scan.nextInt();  // Difference 'a' between numbers of two consecutive rocks
            int diffB = scan.nextInt();  // Difference 'b' between numbers of two consecutive rocks

            if( diffA == diffB ) {  // If the diffs are the same, no work needs to be done
                System.out.println( diffA * (stones-1) );
                continue;
            } else if( diffB > diffA ) {  // To get the numbers in increasing order, diffB needs to be the smaller diff
                int temp = diffA;
                diffA = diffB;
                diffB = temp;
            }

            int previous = 0;
            for( int a_gaps = 0; a_gaps < stones; a_gaps++ ) {
                
                int lastStone = ( a_gaps * diffA ) + ( (stones-1 - a_gaps) * diffB );

                if( lastStone != previous ) {  // Prevent printing the same number twice
                    System.out.printf( "%d ", lastStone );
                }

                previous = lastStone;
            }

            System.out.printf( "%n" );
        }

        scan.close();
    }
}