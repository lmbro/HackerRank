/*

File:    JavaBigInteger.java
Purpose: HackerRank Challenge, Java BigInteger
Author:  Lucas Brown
Version: 1.0
Date:    August 2, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
In this problem, you have to add and multiple huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.


Input Format
-------------
There will be two lines containing two numbers, a and b.


Constraints
------------
a and b are non-negative integers and can have maximum 200 digits.


Output Format
--------------
Output two lines. The first line should contain a + b, and the second line should contain a x b. Don't print any leading zeros.


Sample Input
-------------
1234
20

Sample Output
--------------
1254
24680

*/

import java.util.Scanner;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        scan.close();

        System.out.println( a.add(b) );
        System.out.println( a.multiply(b) );
    }
}