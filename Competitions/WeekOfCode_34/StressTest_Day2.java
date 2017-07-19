import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * STRESS TEST
 * HackerRank Competition, Week of Code 34, Day 2
 * Challenge: Maximum GCD and Sum 
 * Read comments at beginnig of this source file for details
 * 
 * @author Lucas Brown
 */
public class StressTest_Day2 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        Random rand = new Random();
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        

        int v522;
        int v587;
        int brute_force;
        int[] pair_v522 = new int[2];
        int[] pair_v587 = new int[2];
        int[] pair_brute = new int[2];

        for( int count = 0; count < 100; count++ ) {
            
            System.out.println( "\n\nLoop " + count );

            for( int i = 0; i < n; i++ ) {
                a[i] = rand.nextInt(c) + 1;
            }
            for( int i = 0; i < n; i++ ) {
                b[i] = rand.nextInt(c) + 1;
            }

            brute_force = getMaxGcdSum( a, b, pair_brute );
            v587 = getMaxGcdSum_587( a, b, pair_v522 );

            Arrays.sort( a );
            Arrays.sort( b );
            v522 = getMaxGcdSum_522( a, b, pair_v587 );
            
            if( v522 != v587 ) {
                System.out.println( "\n\nv522: " + v522 );
                System.out.println( "v522[0] = " + pair_v522[0] );
                System.out.println( "v522[1] = " + pair_v522[1] );
                System.out.println( modifiedEuclid( pair_v522[0], pair_v522[1], 0 ) );
                System.out.println( "v587: " + v587 );
                System.out.println( "v587[0] = " + pair_v587[0] );
                System.out.println( "v587[1] = " + pair_v587[1] );
                System.out.println( modifiedEuclid( pair_v587[0], pair_v587[1], 0 ) );

                System.out.println( "\n\nA: " );
                for( int i = 0; i < n; i++ ) {
                    System.out.print( a[i] + "  " );
                    
                }
                System.out.println( "\n\nB: " );
                for( int i = 0; i < n; i++ ) {
                    System.out.print( b[i] + "  " );
                }
            }

        }
        System.out.println( "FINISHED" );

        return;        
    }
    
    public static int getMaxGcdSum_522( int[] a, int[] b, int[] pair_v522 ) {

        if( a[a.length-1] == b[b.length-1] ) {
            return a[a.length-1] + b[b.length-1];
        }

        int i = a.length - 1;
        int j = b.length - 1;
        int max_gcd = modifiedEuclid( a[i], b[j], 0 );
        int max_sum = a[i] + b[j];
        pair_v522[0] = a[i];
        pair_v522[1] = b[j];

        while( i >= 0 && j >= 0 ) {

            if( a[i] < max_gcd || b[j] < max_gcd ) {
                return max_sum;
            } else if( a[i] == b[j] ) {
                pair_v522[0] = a[i];
                pair_v522[1] = b[j];
                return a[i]+b[j];
            }


            int gcd = modifiedEuclid( a[i], b[j], max_gcd );

            if( gcd > max_gcd ) {
                max_gcd = gcd;
                max_sum = a[i] + b[j];
                pair_v522[0] = a[i];
                pair_v522[1] = b[i];
            }

            if( a[i] < b[j] ) {
                if( j > 0 ) {
                    j--;
                } else {
                    i--;
                }
            } else if( a[i] > b[j] ) {
                if( i > 0 ) {
                    i--;
                } else {
                    j--;
                }
            } 
        }
        return max_sum;
    }

    public static int getMaxGcdSum_587( int[] a, int[] b, int[] pair_v587 ) {

        int gcd = 0;
        int max_gcd = 0;
        int max_sum = 0;

        for( int i = 0; i < a.length; i++ ) {

            if( max_gcd > a[i] ) {
                continue;
            }

            for( int j = 0; j < b.length; j++ ) {

                if( max_gcd > b[j] ) {
                    continue;
                }

                if( a[i] > b[j] ) {
                    gcd = modifiedEuclid( a[i], b[j], max_gcd );
                } else if( a[i] < b[j] ) {
                    gcd = modifiedEuclid( b[j], a[i], max_gcd );
                } else {
                    gcd = a[i];
                }

                if( gcd > max_gcd ) {
                    max_gcd = gcd;
                    max_sum = a[i] + b[j];
                    pair_v587[0] = a[i];
                    pair_v587[1] = b[j];
                } else if( gcd == max_gcd && a[i] + b[j] > max_sum ) {
                    max_sum = a[i] + b[j];
                }
            }
        }
        
        return max_sum;
    }

    public static int getMaxGcdSum( int[] a, int[] b, int[] pair_brute ) {

        for( int i = 0; i < a.length; i++ ) {
            for( int j = 0; j < b.length; j++ ) {
                
    }

    /**
     * Non-recursive implementation of Euclid's algorithm for find GCD of two numbers.
     * If x drops below some number, we stop looking.
     * 
     * @param x - first integer to compare
     * @param y - second integer to compare
     * @param min - lowest common denominator before giving up our search and returning 0
     * @return greatest common denominator of x and y if it is > min, 0 if the GCD < min
     * @see <a href="http://www.java67.com/2012/08/java-program-to-find-gcd-of-two-numbers.html">Java67, Euclid's Algorithm</a>
     */
    public static int modifiedEuclid( int x, int y, int min ) {

        if( x < min ) {
            return 0;
        } else if( y == 0 ) {
            return x;
        } else {
            return modifiedEuclid( y, x%y, min );
        }
    }

    public static int gcdEuclid( int x, int y ) {

        if( y == 0 ) {
            return x;
        } else {
            return gcdEuclid( y, x % y );
        }
    }
}