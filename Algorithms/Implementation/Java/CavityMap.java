/*

File:    CavityMap.java
Purpose: HackerRank Challenge, Cavity Map
Author:  Lucas Brown
Version: 1.0
Date:    September 20, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
You are given a square map of size nxn. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).


Task
-----
You need to find all the cavities on the map and depict them with the uppercase character X.


Input Format
-------------
The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.


Output Format
--------------
Output n lines, denoting the resulting map. Each cavity should be replaced with character X.


Constraints
------------
1 <= n <= 100


Sample Input
-------------
4
1112
1912
1892
1234


Sample Output
--------------
1112
1X12
18X2
1234

*/


import java.util.Scanner;

public class CavityMap {

    public static void main( String[] args ) {

        // Initialization and Input
        
        Scanner scan = new Scanner( System.in );

        int grid_size = scan.nextInt();
        int[][] grid = new int[grid_size][grid_size];

        for( int i = 0; i < grid_size; i++ ) {

            int temp = scan.nextInt();
            int j = grid_size - 1;
            while( temp > 0 ) {
                grid[i][j] = temp % 10;
                temp /= 10;
                j--;
            }
        }
        scan.close();

        // Output

        for( int i = 0 ; i < grid_size; i++ ) {
            for( int j = 0; j < grid_size; j++ ) {

                if( isCavity(grid, i, j) ) {
                    System.out.print( "X" );
                } else {
                    System.out.printf( "%d", grid[i][j] );
                }
            }
            System.out.printf( "%n" );
        }
    }

    public static boolean isCavity( int[][] grid, int i, int j ) {

        // Cavities cannot be on borders
        if( i == 0 || j == 0 || i == grid.length-1 || j == grid.length-1 ) {
            return false;
        }

        if(        grid[i+1][j] >= grid[i][j] ) {
            return false;
        } else if( grid[i-1][j] >= grid[i][j] ) {
            return false;
        } else if( grid[i][j+1] >= grid[i][j] ) {
            return false;
        } else if( grid[i][j-1] >= grid[i][j] ) {
            return false;
        }
        
        return true;
    }
}