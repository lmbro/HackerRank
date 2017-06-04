/*
Task
You have to write a function in max_of_four(int a, int b, int c, int d) when reads four arguements and returns the greatest of them.

Input Format
Input will contain four integers - a, b, c, and d, one on each line.
*/
#include <iostream>

int max_of_four(int a, int b, int c, int d){
    int four[]={a,b,c,d,0};
    for(int i=0; i<4; i++) if(four[i]>four[4]) four[4]=four[i];
    return four[4];
}

// Main provided as part of problem statement
int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}