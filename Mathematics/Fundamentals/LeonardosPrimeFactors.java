
/*

File:    LeonardosPrimeFactors.java
Purpose: HackerRank Challenge, Leonardo's Prime Factors
Author:  Lucas Brown
Version: 1.0
Date:    July 28, 2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by$


Task
-----
Leonardo loves primes and created q queries where each query takes the form of an integer, n. For ea$


Input Format
-------------
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains a single integer, n.


Constraints
------------
1 <= q <= 10^5
1 <= n <= 10^18


Output Format
--------------
For each query, print the maximum number of unique prime factors for any number in the inclusive ran$


Sample Input
-------------
6
1
2
3
500
5000
10000000000

Sample Output
--------------
0
1
1
4
5
10

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 * HackerRank Challenge, Leondardo's Prime Factors
 * See source for details.
 * 
 * @author Lucas Brown
 */
public class LeonardosPrimeFactors {

    public static void main( String[] args ) {

        // Build a list of the products of consecutive primes 
        ArrayList<Long> prime_products = new ArrayList<Long>();
        buildPrimeProducts( prime_products , (long)1e18 );

        Scanner scan = new Scanner( System.in);
        int n_queries = scan.nextInt();

        for( int i = 0; i < n_queries; i++ ) {

            long n = scan.nextLong();
            int count = 0;
            for( int j = 0; j < prime_products.size(); j++ ) {

                // prime_products(j) has j+1 factors - we're looking for the largest prime product with the range [1,n]
                if( prime_products.get(j) > n ) {
                    count = j;
                    break;
                } else if( prime_products.get(j) == n ) {
                    count = j+1;
                    break;
                }
            }

            // Handle the case that n > prime_products( prime_products.size - 1 )
            if( count == 0 && n != 1 ) {
                count = prime_products.size();
            }

            System.out.println( count );
        }
    }

    /**
     * Build a list of "Prime Products", defined as the product of the first (i-1) consecutive primes.
     * 
     * For example: prime_products(2) = prime_products(3-1) = 2 * 3 * 5 = 30
     *              prime_products(4) = prime_products(5-1) = 2 * 3 * 5 * 7 * 11 = 2310
     * 
     * @param prime_products ArrayList<Long> to contain the result
     * @param max_num Upper limit (long) of the value of prime_product
     * 
     * @author Lucas Brown
     */
    public static void buildPrimeProducts( ArrayList<Long> prime_products, long max_num ) {

        long num = 2;  // 1 is not prime

        // Use BigInteger because product may exceed long range in the loop below, causing errors with the condition.
        // Note that our limit is 1e18 is in range of long, so our ArrayList is valud as Long.
        BigInteger product = BigInteger.valueOf(1);

        // while( product <= max_num )
        while( product.compareTo( BigInteger.valueOf(max_num) ) != 1 ) {
            if( isPrime(num) ) {
                product = product.multiply( BigInteger.valueOf(num) );
                prime_products.add( product.longValue() );
            }
            num++;
        }

        // The last product is going to be greater than our limit, so we remove it.
        prime_products.remove( prime_products.size() - 1 );
    }
    /**
     * Checks if a number is prime
     * 
     * @param n Number to be checked for primality
     * @return true if the number is prime, false if the number is not prime
     *      
     */
    public static boolean isPrime( long n ) {

        // 2 is prime
        if( n == 2 ) { return true; }

        // Even numbers, other than 2, are not prime. By definition, neither is 1.
        if( n % 2 == 0 || n == 1 ) { return false; }

        // Only need to check odd numbers from 3 to sqrt(n) (numbers greater than sqrt(n) have corresponding factors below it)
        long sqrt_n = (long)Math.ceil( Math.sqrt(n) );
        for( int i = 3; i <= sqrt_n; i += 2 ) {
            if( n % i == 0 ) { return false; }
        }
        return true;
    }
}
