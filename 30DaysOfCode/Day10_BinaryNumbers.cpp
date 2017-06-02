/*
Task
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of
consecutive 1's in n's binary representation.

Input Format
A single integer n

Constraints
1 <= n <= 10^6
*/

#include <iostream>
#include <cstdlib>

using namespace std;

void printBinary(int n, int &count, int &max_count){
    div_t divresult;
    divresult = div(n,2);
    if(divresult.quot!=0){
        printBinary(divresult.quot,count,max_count);
    }
    // Count number of consecutive 1's for challenge
    if(divresult.rem==1){
        count++;
    }else{
        if(count>max_count) max_count=count;
        count =0;
    }
    // Debug only, challenege requires that the binary is not displayed  
    //cout << divresult.rem;
}

int main(){
    int n;
    int count=0;
    int max_count=0;
    cin >> n;
    printBinary(n,count,max_count);
    if(count>max_count) max_count=count; // Handle the case that last run of 1's is the longest (i.e. n=439)
    cout << max_count << endl;
    return 0;
}
