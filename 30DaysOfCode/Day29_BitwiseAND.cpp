/*
***** Task *****
Given set S = { 1, 2, 3, ..., N }, find two integers, A and B (where A < B), from set S such that the value of A&B is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator. 

***** Input Format *****
The first line contains an integer, T, the number of test cases.
Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.

***** Constraints *****
1 <= T <= 10^3
2 <= N <= 10^3
2 <= K <= N

***** Output Format *****
For each test case, print the maximum possible values of A&B on a new line.

*/

#include <cstdio>

int main() {

    int t;
    std::scanf( "%d", &t );

    int n, k, max, bit_and;
    for( int i = 0; i < t; i++ ) {

        max = 0;
        std::scanf( "%d %d", &n, &k );

        for( int a = 1; a < n; a++ ) {
            for( int b = n; b > a; b-- ) {
                bit_and = a & b;
                if( bit_and < k && bit_and > max ){
                    max = bit_and;
                }
            }
        }

        std::printf( "%d\n", max );
    }

    return 0;
}
/*
***** Sample Input *****
3
5 2
8 5
2 2

***** Output
1
4
0

*/
