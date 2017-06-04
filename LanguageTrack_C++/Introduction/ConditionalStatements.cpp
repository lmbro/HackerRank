/*
Task
Given a positive integer, n, do the following:
- if 1 <= n <= 9, then print the lowercase English word corresponding to the number.
- if n > 9, printer "Greater than 9"

Input Format
A single integer denoting n

Constraints
1 <= n <= 10^9
*/

#include <iostream>

int main(){
    int n;
    scanf("%d",&n);
    // Due to problem constraints, we do not need to handle n<1
    switch(n){
        case 1: printf("%s\n","one"); break;
        case 2: printf("%s\n","two"); break;
        case 3: printf("%s\n","three"); break;
        case 4: printf("%s\n","four"); break;
        case 5: printf("%s\n","five"); break;
        case 6: printf("%s\n","six"); break;
        case 7: printf("%s\n","seven"); break;
        case 8: printf("%s\n","eight"); break;
        case 9: printf("%s\n","nine"); break;
        default: printf("%s\n","Greater than 9");
    return 0;
    }
}