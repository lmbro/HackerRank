/*
Task
Given an array of integers, calculate which fraction of its elements are positive, which fraction are negative, and which fraction are zeros. Print the decimal value of each fraction on a new line.

Input Format
The first line contains an integer N, denoting the size of the array.
The second line contains N space-separated integers describing an array of numbers.

Note
This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute errors up to 10^/4 are acceptable.
*/

#include <iostream>
#include <iomanip>

int main(){
    int n,temp;
    int pos=0;
    int neg=0;
    int zed=0;

    std::cin >> n;
    for(int i=0; i<n; i++){
        std::cin >> temp;
        if(temp>0) pos++;
        else if(temp<0) neg++;
        else zed++;
    }

    std::cout << std::fixed << std::setprecision(6)
        << static_cast<double>(pos)/n << '\n' 
        << static_cast<double>(neg)/n << '\n' 
        << static_cast<double>(zed)/n << std::endl;
    return 0;
}

