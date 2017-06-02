/*
Task
Given five positive integers, find the minimum and maxium values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Constraints
Integer inclusive rnge [1,10^9]
*/

#include <iostream>
#include <algorithm>

int main(){
    long array[5];
    long min=0;
    long max=0;
    for(int i=0; i<5; i++) std::cin >> array[i];
    std::sort(array,array+5);
    for(int i=0; i<4; i++) min+=array[i];
    for(int i=1; i<5; i++) max+=array[i];
    std::cout << min << " " << max << std::endl;
    return 0;
}