/*
Background
Given a square matrix of size NxN, calculate the absolute difference between the sums of its diagonals.

Task
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Input Format
The first line contains a single integer N.
The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Constraints
-100 <= Elements in the matrix <= 100
*/

#include <iostream>
#include <cmath>

int main(){
    short n;
    std::cin >> n;
    
    int primary=0;
    int secondary=0;
    int temp;

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            std::cin >> temp;
            if(i==j) primary+=temp;
            if(i+j==n-1) secondary+=temp;
        }
    }
    std::cout << std::abs(primary-secondary) << std::endl;
    return 0;
}

