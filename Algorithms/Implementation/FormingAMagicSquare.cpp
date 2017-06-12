/*
***** Background *****
We define a magic square to be an NxN matrix of distinct positive integers from 1 to N^2 where the sum of any row, column, or diagonal (of length N) is always equal to the same number (i.e., the magic constant)
Consider a 3x3 matrix, s, of integers in the inclusive range [1, 9]. We can convert any digit, a, to any other digit, b, in the range [1, 9] at a cost |a-b|

***** Task *****
Given, s, convert it into a magic square at minimal cost by changing zero or more of it's digits. Then print this cost on a new line.
NOTE: The resulting magic square must contain distinct integers in the inclusive range [1, 9]

***** Input Format *****
There are 3 lines of input. Each line describes a row of the matrix in the form of 3 space-separated integers denoting the respective first, second, and third elements of that row.

***** Constraints *****
All integers, s, are in the inclusive range [1, 9]

***** Output Format *****
Print an integer denoting the minimum cost of turning matrix s into a magic square
*/

#include <cstdio>
#include <vector>
#include <map> 

int main() {
    
    // User-entered 3x3 matrix
    std::vector< std::vector<int> > square(3, std::vector<int>(3));
    for(int i=0; i<3; i++){
       std::scanf("&hd %hd %hd", square[i][0], square[i][1], square[i][2]);
    }

    // Find sums of rows, columns, and diagonals
    int row_sum[] = { 0, 0, 0 };    // Row 0 = top row
    int col_sum[] = { 0, 0, 0 };    // Column 0 = left column
    int dia_sum[] = { 0, 0 };       // Diagonal 0 = top left to bottom right ( (0,0) -> (2,2) )
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            row_sum[i] += square[i][j];
            col_sum[i] += square[j][i];
        }
    }
    dia_sum[0] = square[0][0] + square[1][1] + square[2][2];
    dia_sum[1] = square[2][0] + square[1][1] + square[0][2];

    // Find Magic Number
    std::map<int, int> magic_nums;

    //  Print the minimum cost of converting 's' into a magic square
    return 0;
}

//short findMagicNum(short rsum[], short csum[], short dsum[]);
//short makeSquareMagic(short sq[], short mnum);


/*
SAMPLE INPUT 0
4 9 2
3 5 7
8 1 5

EXPECTED OUTPUT 0
1


SAMPLE INPUT 1
4 5 8
2 4 1
1 9 7

EXPECTED OUTPUT 1
14

*/
