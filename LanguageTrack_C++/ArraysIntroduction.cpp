/*
Task
You'll be given an array of N integers and you have to print the integers in the reverse order.

Input Format
The first line of the input contains N, where N is the number of integers.
The next line containsN integers, separated by a space.

Constraints
1 <= N <= 1000
1 <= Ai <= 10000
*/

#include <iostream>

int main(){
    short n;
    scanf("%hd",&n);
    short array[n];
    for(int i=0; i<n; i++) scanf("%hd",&array[i]);
    for(int i=n-1; i>-1; i--) printf("%hd ",array[i]);
    printf("\n");
    return 0;
}
