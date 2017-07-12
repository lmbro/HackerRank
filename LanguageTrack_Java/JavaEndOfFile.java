/**

JavaEndOfFile.java
Purpose: HackerRank Challenge, Java End-of-file

@author Lucas Brown
@version 1.0
July 11, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.


Input Format
-------------
Read some uknown n lines of input from stdin until you reach EOF, each line of input contains a non-empty string.


Output Format
--------------
For each line, print the line number, followed by a single space, and then the line content received as input.


Sample Input
-------------
Hello world
I am a file
Read me until end-of-file.

Sample Output
--------------
1 Hello world
2 I am a file
3 Read me until end-of-file

*/

import java.util.Scanner;
import java.util.ArrayList;

public class JavaEndOfFile {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        ArrayList<String> input = new ArrayList<String>();

        while( scan.hasNextLine() ) {
            input.add( scan.nextLine() );
        }
        
        for( int i = 0; i < input.size(); i++ ) {
            System.out.printf( "%d %s%n", i+1, input.get(i) );
        }
    }
}