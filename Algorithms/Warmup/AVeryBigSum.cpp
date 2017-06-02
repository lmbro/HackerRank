/*
Task
You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format
The first line of the input consists of an integer N.
The next line contains N space-separated integers contained in the array.

Constraints
1 <= N <= 10
0 <= A[i] <= 10^10
*/

#include <iostream>

int main(){
    short n;
    long long a;
    long long a_sum=0;
    std::cin >> n;
    for (int i=0; i<n; i++){
        std::cin >> a;
        a_sum+=a;
    }
    std::cout << a_sum << std::endl;
    return 0;
}