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
#include <algorithm>

struct coord{
    int row, col;
};
class MagicSquare{
    private:
        std::vector< std::vector<int> > square;
        int row_sum[3];
        int col_sum[3];
        int dia_sum[2];
        int magic_num;
        bool is_magic;
    public:
        MagicSquare();
        
        void setIndex(int i, int j, int val);
        void setMagicNumber(int m);
        void findSums();    
        bool testMagic();
        std::vector<int> buildSumVector();
        int getIndex(int i, int j);
        int getMagicNumber();
        int getSum(char rcd, int i);
        bool isMagic();

        void printSquare();
};

MagicSquare::MagicSquare(){
    for(int i=0; i<3; i++){
        square.push_back(std::vector<int>(3));
        row_sum[i] = 0;
        col_sum[i] = 0;
        if( i == 2 ) break;
        dia_sum[i] = 0;
    }
    is_magic = false;
}
void MagicSquare::setIndex(int i, int j, int val){
    square[i][j] = val;
}
void MagicSquare::setMagicNumber(int m){
    magic_num = m;
}
void MagicSquare::findSums(){
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            row_sum[i] += square[i][j];
            col_sum[i] += square[j][i];
        }
    }
    dia_sum[0] = square[0][0] + square[1][1] + square[2][2];
    dia_sum[1] = square[2][0] + square[1][1] + square[0][2];
}
bool MagicSquare::testMagic(){
    this->findSums();
    if( magic_num == 0 ){
        is_magic = false;
        return is_magic;
    }
    for(int i=0; i<3; i++){
        if( row_sum[i] != magic_num || col_sum[i] != magic_num){
            is_magic = false;
            return is_magic;
        }
        if ( i == 2 ) break;
        if (dia_sum[i] != magic_num){
            is_magic = false;
            return is_magic;
        }
    }
    is_magic = true;
    return is_magic;
}
std::vector<int> MagicSquare::buildSumVector(){
    std::vector<int> sum_vector;
    for(int i=0; i<3; i++){
        for(char c : {'r','c','d'} ){
            // Break out of invalid getSum parameters
            if( c == '0' ){
                break;
            } else if( c == 'd' && i == 2 ){
                break;
            }
            if( sum_vector.empty() ) {
                sum_vector.push_back( this->getSum(c,i) );
            } else if( std::find( sum_vector.begin(), sum_vector.end(), this->getSum(c,i) ) == sum_vector.end() ){
                sum_vector.push_back( this->getSum(c,i) );
            }
        }
    }
    return sum_vector;
}
int MagicSquare::getIndex(int i, int j){
    return square[i][j];
}
int MagicSquare::getMagicNumber(){
    return magic_num;
}
int MagicSquare::getSum(char rcd, int i){
    switch(rcd) {
        case 'r':
            return row_sum[i];
            break;
        case 'c':
            return col_sum[i];
            break;
        case 'd':
            return dia_sum[i];
            break;
        default:
            return -1;
            break;
    }
}
bool MagicSquare::isMagic(){
    return is_magic;
}
void MagicSquare::printSquare(){
    for(int i=0; i<3; i++){
        std::printf("%d %d %d\n", square[i][0], square[i][1], square[i][2]);
    }
}
int old_fixMagicSquare(MagicSquare &target, MagicSquare &fixed, int magic_num){
    std::puts("The Eagle has Landed");

    int cost = 0;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if( target.getSum('r',i) == magic_num || target.getSum('c',j) == magic_num ){
                // Don't change number, already in a correct row or number
                fixed.setIndex( i, j, target.getIndex( i, j ) );
            } else if( target.getSum('r',i) != magic_num ){
                // Fix based on column
                int temp = target.getIndex(i,j) + ( magic_num - target.getSum('c', j) );
                if( temp > 9 ){
                    temp = 9;
                } else if( temp < 1 ){
                    temp = 1;
                }
                fixed.setIndex( i, j, temp );
                cost += std::abs( temp - target.getIndex(i,j) );
            } else if( target.getSum('c',j) != magic_num ){
                // Fix based on row
                int temp = target.getIndex(i,j) + (magic_num - target.getSum('r', i));
                if( temp > 9 ){
                    temp = 9;
                } else if( temp < 1 ){
                    temp = 1;
                }
                fixed.setIndex( i, j, temp );
                cost += std::abs( temp - target.getIndex( i, j) );
            }
        }
    }
    fixed.setMagicNumber(magic_num);
    fixed.findSums();
    if(fixed.testMagic()){
        std::printf("Magic Number: %d\n",magic_num);
        fixed.printSquare();
        return cost;
    } else {
        std::printf("Failed Magic Number: %d\n", magic_num);
        fixed.printSquare();
        return 10000;
    }
}

int fixMagicSquare(MagicSquare &target, MagicSquare &fixed, int magic_num){
    std::vector<coord> points;
    std::puts("Problem Points:");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if( target.getSum('r',i) != magic_num && target.getSum('c',j) != magic_num ){
                coord temp;
                temp.row=i;
                temp.col=j;
                points.push_back(temp);
                std::printf("(%d,%d)\n",temp.row,temp.col);
            }
        }
    }
}


int main(){

    // Build input square
    MagicSquare target;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            int temp;
            std::scanf("%d",&temp);
            target.setIndex(i,j,temp);
        }
    }        
        // dev print
        std::puts("\nInput Square:");
        target.printSquare();
    
    // Build sum vector (contains likely magic numbers)
    target.findSums();
    std::vector<int> sum_vector = target.buildSumVector();
    
        // dev print
        std::puts("\nPossible magic numbers:");
        for(int i=0; i < sum_vector.size(); i++){
            std::printf("%d\n", sum_vector[i]);
        }

    // Find min cost
    int cost = 0, min_cost = 99999;
    for(int i=0; i < sum_vector.size(); i++){
        MagicSquare temp;
        cost = fixMagicSquare(target, temp, sum_vector[i]);
        if( cost < min_cost ) min_cost = cost;
    }
    std::printf("Min Cost: %d\n", min_cost);
    
    

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
