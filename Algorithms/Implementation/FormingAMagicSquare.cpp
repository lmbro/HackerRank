/*

Forming a Magic Square.cpp
Purpose: HackerRank Challenge, Forming a Magic Square

Author: Lucas Brown
Version: 0.1 6/29/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
We define a magic square to be an NxN matrix of distinct positive integers from 1 to N^2 where the sum of any row, column, or diagonal (of length N) is always equal to the same number (i.e., the magic constant)
Consider a 3x3 matrix, s, of integers in the inclusive range [1, 9]. We can convert any digit, a, to any other digit, b, in the range [1, 9] at a cost |a-b|


Task
-----
Given, s, convert it into a magic square at minimal cost by changing zero or more of it's digits. Then print this cost on a new line.
NOTE: The resulting magic square must contain distinct integers in the inclusive range [1, 9]


Input Format
-------------
There are 3 lines of input. Each line describes a row of the matrix in the form of 3 space-separated integers denoting the respective first, second, and third elements of that row.


Constraints
------------
All integers, s, are in the inclusive range [1, 9]


Output Format
--------------
Print an integer denoting the minimum cost of turning matrix s into a magic square


Sample Input 0
--------------
4 9 2
3 5 7
8 1 5

Sample Output 0
---------------
1


Sample Input 1
--------------
4 5 8
2 4 1
1 9 7

Sample Output 1
---------------
14

*/


#include <cstdio>
#include <vector>

class Square {
    private:
        std::vector< std::vector<int> > square;
        int row_sum[3];
        int col_sum[3];
        int dia_sum[2];
        int magic_number;
        bool is_magic;
    public:
        Square();
        
        void setIndex( int i, int j, int value );
        void setMagicNumber( int n );
        void findSums();
        bool testMagic();

        int getIndex( int i, int j );
        int getMagicNumber();
        bool isMagic();
};

int main() {

    Square input_square;
    
    for( int i = 0; i < 3; i++ ) {
        for( int j = 0; j < 3; j++ ) {
            int val;
            std::scanf( "%d", &val );
            input_square.setIndex( i, j, val );
        }
    }

    // Display Input square
    std::puts( "\nInput:" );
    for( int i = 0; i < 3; i++ ) {
        std::printf( "%d %d %d\n", input_square.getIndex(i,0), input_square.getIndex(i,1), input_square.getIndex(i,2) );
    } /**/    
}


Square::Square() {
    
    square.resize( 3, std::vector<int>(3) );
    std::vector< std::vector<int> > square( 3, std::vector<int>(3,0) );
    row_sum[0] = row_sum[1] = row_sum[2] = 0;
    col_sum[0] = col_sum[2] = col_sum[2] = 0;;
    dia_sum[0] = dia_sum[2] = 0;
    
    magic_number = 0;
    bool is_magic = false;
}

void Square::setIndex( int i, int j, int value ) {

    square[i][j] = value;
}

void Square::setMagicNumber( int n ) {

    magic_number = n;
}

void Square::findSums() {

    for( int i = 0; i < 3; i++ ) {
        for( int j = 0; j < 3; j++ ) {
            row_sum[i] += square[i][j];
            col_sum[i] += square[j][i];
        }
    }
    dia_sum[0] = square[0][0] + square[1][1] + square[2][2];
    dia_sum[1] = square[2][0] + square[1][1] + square[0][2];
}

bool Square::testMagic() {

    if( magic_number == 0 ) {
        is_magic = false;
        return false;
    }
    
    this->findSums();
    for( int i = 0; i < 3; i++ ) {
        
        if( row_sum[i] != magic_number || col_sum[i] != magic_number ) { 
            is_magic = false;
            return false;
        }

        if( i == 2 ) { break; }

        if( dia_sum[i] != magic_number ) {
            is_magic = false;
            return false;
        }
    }

    is_magic = true;
    return true;
}

int Square::getIndex( int i, int j ) {

    return square[i][j];
}
    
int Square::getMagicNumber() {
    
    return magic_number;
}

bool Square::isMagic() {

    return is_magic;
}

