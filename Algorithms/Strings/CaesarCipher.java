/*

File:    CaesarCipher.java
Purpose: HackerRank Challenge, Caesar Cipher
Author:  Lucas Brown
Version: 1.0
Date:    September 13, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, making it unreadable by his enemies.

NOTE: The cipher ONLY encrypts letters; symbols, such as -, remain unencrypted.
NOTE: Lowercase letters remain lowercase, uppercase letters remain uppercase

Task
-----
Given a string, S, and a number, K, encrypt S and print the resulting string.


Input Format
-------------
The first line contains an integer, N, which is the length of the unencrypted string.
The second line contains the unencrypted string, S.
The third line contains the integer encryption key, K, which is the number of letters to rotate.


Output Format
--------------
For each test case, print the encoded string.


Constraints
------------
1 <= N <= 100
0 <= K <= 100
S is a valid ASCII string and doesn't contain any spaces.


Sample Input
-------------
11
middle-Outz
2


Sample Output
--------------
okffng-Qwvb

*/


import java.util.Scanner;


public class CaesarCipher {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int length = scan.nextInt();
        String original = scan.next();
        int key = scan.nextInt();
        scan.close();

        char[] encrypt = original.toCharArray();

        for( int i = 0; i < length; i++ ) {

            int code = encrypt[i];

            if( code >= 65 && code <= 90 ) {
            // ASCII Code 65 = 'A'
            // ASCII Code 90 = 'Z'

                code += key;
                while( code > 90 ) {  // key can be as large as 100, so we may need to repeat
                    code = 64 + ( code - 90 );
                }
                encrypt[i] = (char)code;
                
            } else if ( code >= 97 && code <= 122 ) {
            // ASCII Code 97 = 'a'
            // ASCII Code 122 = 'z'

                code += key;
                while( code > 122 ) {  // key can be as large as 100, so we may need to repeat
                    code = 96 + ( code - 122 );
                }
                encrypt[i] = (char)code;

            }
        }
        
        System.out.println( encrypt );
    }
}