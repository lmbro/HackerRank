/*
Background
Given a 6x6 2D Array,A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indicies falling in this pattern in A's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass's values


Task
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Input Format
There are 6 lines of input, where each line contains 6 space-separated integers describing 2dArray A; every value in A will be in the inclusive range of -9 to 9.

Constraints
-9 <= A[i][j] <= 9
0 <= i,j <= 5
*/

#include <iostream>
#include <vector>

int hourglassSum(int loc_i, int loc_j, std::vector< std::vector<int> > *array);

int main(){
    int sum;
    int max_sum=0;
    std::vector< std::vector<int> > array(6,std::vector<int>(6));
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
            std::cin >> array[i][j];
        }
    }
    
    std::cout << "\n\nInput Received" << std::endl;
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
            std::cout << array[i][j] << " ";
        }
        std::cout << std::endl;
    }

    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            sum = hourglassSum(i,j,&array);
            if(sum>max_sum) max_sum=sum;
        }
    }
    std::cout << "\n\nMax Sum: " << max_sum << std::endl;
    return 0;
}

int hourglassSum(int loc_i, int loc_j, std::vector< std::vector<int> > *array){
    int hg_sum=0;
    for (int j=loc_j; j<loc_j+3; j++) hg_sum += (*array)[loc_i][j] + (*array)[loc_i+2][j];
    hg_sum += ((*array)[loc_i+1][loc_j+1]);
    std::cout << "Hourglass " << loc_i << " " << loc_j << " sum: " << hg_sum << std::endl;
    return hg_sum;
}


