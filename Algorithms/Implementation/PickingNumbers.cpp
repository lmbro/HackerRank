/*
***** Task *****
Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is <= 1

***** Input Format *****
The first line contains a single integer, n, denoting the size of the array
The second line contains n space-separated integers describing the respective values of a[i]

***** Constraints *****
2 <= n <= 100
0 <= a[i] <= 100
The answer will be >= 2

***** Output Format *****
A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is <= 1
*/

#include <cstdio>
#include <vector>

int main(){

    int n;
    std::scanf( "%d", &n );

    int a[n];
    for( int i=0; i<n; i++ ){
        std::scanf( "%d", &a[i] );
    }

    int max_count = 0;
    for( int i=0; i<n; i++ ){
        int count = 0;
        for( int j=0; j<n; j++ ){
            if( ( a[i]==a[j]+1 || a[i]==a[j] ) && ++count > max_count ) max_count = count;
        }
    }

    std::printf("%d\n", max_count);
    return 0;
}

/*
SAMPLE INPUT 0
6
4 6 5 3 3 1
EXPECTED OUTPUT 0
3

SAMPLE INPUT 1
6
1 2 2 3 1 2
EXPECTED OUTPUT 1
5

*/