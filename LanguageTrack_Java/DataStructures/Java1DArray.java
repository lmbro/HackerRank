/*

File:    Java1DArray.java
Purpose: HackerRank Challenge, Java 1D Array
Author:  Lucas Brown
Version: 1.0
Date:    August 5, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're going to have. 


Task
-----
The code in your editor does the following:
1. Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
2. Reads n integers corresponding to a[0], a[1], ..., a[n-1] from stdin and saves each integer a[i] to a variable val.
3. Attempts to print each element of an array of integers named a.

Write the following code in the unlocked portion of your editor:
1. Create an array, a, capable of holding n integers.
2. Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.


Input Format
-------------
The first line contains a single integer, n, denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element a[i].


Output Format
--------------
You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.


Sample Input
-------------
5
10
20
30
40
50

Sample Output
--------------
10
20
30
40
50

*/


/* --------------------------------------------------------------
            BEGIN (1/2): Code provided by HackerRank
-------------------------------------------------------------- */
import java.util.*;

public class Java1DArray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
/* --------------------------------------------------------------
            End (1/2): Code provided by HackerRank
-------------------------------------------------------------- */

        int[] a = new int[n];
        for( int i = 0; i < n; i++ ) {
            int val = scan.nextInt();
            a[i] = val;
        }

/* --------------------------------------------------------------
            BEGIN (2/2): Code provided by HackerRank
-------------------------------------------------------------- */
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
/* --------------------------------------------------------------
            End (2/2): Code provided by HackerRank
-------------------------------------------------------------- */
