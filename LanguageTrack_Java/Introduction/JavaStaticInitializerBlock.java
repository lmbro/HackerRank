/**

JavaStaticInitializerBlock.java
Purpose: HackerRank Challenge, Java Static Initializer Block

@author  Lucas Brown
@version 1.0
July 11, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Static initializer blocks are executed when the class is loaded, and you can initialize static variables in those block.


Task
-----
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.


Input Format
-------------
There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.


Constraints
------------
-100 <= B <= 100
-100 <= H <= 100


Output Format
--------------
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.


Sample Input 1
---------------
1
3

Sample Output 1
----------------
3


Sample Input 2
---------------
-1
2

Sample Output 2
----------------
java.lang.Exception: Breadth and height must be positive

*/

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int B;
    static int H;
    static boolean flag;

    static {

        Scanner scan = new Scanner( System.in );
        B = scan.nextInt();
        H = scan.nextInt();

        if( B <= 0 || H <= 0 ) {
            flag = false;
            System.out.println( "java.lang.Exception: Breadth and height must be positive" );
        } else {
            flag = true;
        }
    }

/* --------------------------------------------------------------
        BEGIN (1/1): Code provided by HackerRank               */

    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
            
        }//end of main

}//end of class

/*      END (1/1): Code provided by HackerRank
-------------------------------------------------------------- */