/*
Background - A bit about pointers
A pointer in C is a way to share a memory address among different contexts (primarily functions). They are primarily used whenever a function needs to modify the content of a variable, of which it doesn't have ownership. This memory address can be assigned to a point and can be shared among various functions. To access the content of the memory to which the pointer pointers, prepend it with a *

&val returns the memory address of val

int *p = &val;
    *p will return val
    p will return &val


Task
You have to complete to function void update(int *a, int *b), which reads two integers as argument, and sets a with the sum of them, and b with the absolute difference of them.

Input Format
Input will contain two integers, a and b, separated by a new line.
*/

#include <stdio.h>
#include <cmath>

void update(int *a,int *b) {
    // Complete this function
    int sum = *a+*b;
    int abs_diff = std::abs(*a-*b);
    *a=sum;
    *b=abs_diff;   
}

// Main provided as part of problem statement
int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}