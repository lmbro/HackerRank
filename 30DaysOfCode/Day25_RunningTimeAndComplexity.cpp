/*

***** Task *****

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, determine and print whether it's prime or not prime
NOTE: If possible, try to come up with a O(n^(1/2)) primality algorithm, or see what sort of optimizations you come up with for an O(n) algorithm. 


***** Imput Formt *****

The first line contains an integer, T, the number of test cases.
Each of the T subsequent lines contains an integer, n, to be tested for primality.


***** Constraints *****

1 <= T <= 30
1 <= n <= 2x10^9


***** Output Format *****

For each test case, print whether n is "Prime" or "Not prime" on a new line.

*/


#include <cstdio>
#include <cmath>

bool is_num_prime( int n ){

    if( n == 1 ) return false;

    double sqrt_n = std::sqrt(n);

    for( int i = 2; i <= sqrt_n; i++ ){
        if( n % i == 0 ){
            return false;
        }
    }

    return true;
}

int main(){

    int t;
    std::scanf( "%d", &t );

    for( int i = 0; i < t; i++ ){

        int n;
        std::scanf( "%d", &n );

        if( is_num_prime( n ) ){
            std::puts( "Prime" );
        } else {
            std::puts( "Not prime" );
        }
    }

    return 0;
}

/*
***** Sample Input *****
3
12
5
7

***** Output
Not prime
Prime
Prime

*/
