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

int findMagicNumber(const int r_sum[], const int c_sum[], const int d_sum[], int ignore=0);
int fixMagicSquare(const std::vector< std::vector<int> > sq, const int r_sum[], const int c_sum[], const int d_sum[], int magic_num);

int main() {
    
    // User-entered 3x3 matrix
    std::vector< std::vector<int> > square(3, std::vector<int>(3));
    for(int i=0; i<3; i++){
       std::scanf("%d %d %d", &square[i][0], &square[i][1], &square[i][2]);
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
    int magic_number = findMagicNumber(row_sum, col_sum, dia_sum);
    std::printf("Magic Number: %d\n", magic_number); // DEV PRINT

    // Fix Magic Square
    int cost = fixMagicSquare(square, row_sum, col_sum, dia_sum, magic_number); 

    return 0;
}

int findMagicNumber(const int r_sum[], const int c_sum[], const int d_sum[], int ignore){
    
    int magic_num = 0, magic_count = 0;
    static std::map<int, int> magic_nums;
    
    for(int i=0; i<3; i++){
        magic_nums[r_sum[i]]++;
        magic_nums[c_sum[i]]++;
        if(i==2) break;
        magic_nums[d_sum[i]]++;
    }
    for(std::map<int,int>::iterator it=magic_nums.begin(); it != magic_nums.end(); it++){
        std::printf("%d: %d\n", it->first, it->second);
        if( it->second > magic_count  &&  it->first != ignore ){
            magic_num = it->first;
            magic_count = it->second;
        }
    }
    return magic_num;
}

int fixMagicSquare(const std::vector< std::vector<int> > sq, const int r_sum[], const int c_sum[], const int d_sum[], int magic_num){
    std::puts("The Eagle has Landed"); // DEV PRINT
    
    // Find incorrect rows/columns
    bool wrong_row[] = { false, false, false };
    bool wrong_col[] = { false, false, false };
    bool wrong_dia[] = { false, false };

    for(int i=0; i<3; i++){
        std::printf("%d %d %d\n", sq[i][0], sq[i][1], sq[i][2]); // DEV PRINT 
        if( r_sum[i] != magic_num ) wrong_row[i]=true;
        if( c_sum[i] != magic_num ) wrong_col[i]=true;
        if( i == 2 ) break;
        if( d_sum[i] != magic_num ) wrong_dia[i]=true;
    }
    // DEV PRINT LOOP
    for(int i=0; i<3; i++){
        if( wrong_row[i] ) std::printf("Wrong row: %d\n", i); 
        if( wrong_col[i] ) std::printf("Wrong col: %d\n", i); 
        if( i == 2 ) break;
        if( wrong_dia[i] ) std::printf("Wrong dia: %d\n", i);
    }

    return 0;
}

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
