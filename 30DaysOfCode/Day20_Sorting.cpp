/*
***** Task *****

Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm below:

for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}

Once sorted, print the following three lines:
1. "Array is sorted in <numSwaps>" swaps, where <numSwaps> is the number of swaps that took place
2. "First Element: <firstElement>" where <firstElement> is the first element in the sorted array
3. "Last Element: <lastElement>" where <lastElement> is the last element in the sorted array


***** Input Format *****

The first line contains an integer, n, denoting the number of elements in array a.
The second line contains n space-separated integers describing the respective values of a[0], a[1], ... , a[n-1]


**** Constraints *****

2 <= n <= 600
1 <= a[i] <= 2x10^6, where 0 <= i < n


***** Output *****

Print the following three lines
1. "Array is sorted in <numSwaps>" swaps, where <numSwaps> is the number of swaps that took place
2. "First Element: <firstElement>" where <firstElement> is the first element in the sorted array
3. "Last Element: <lastElement>" where <lastElement> is the last element in the sorted array

*/

#include <cstdio>
#include <vector>

// Using a swap function to keep algorithm unchanged
void swap( int &a, int &b ){
    a = a + b;
    b = a - b;
    a = a - b;
}

int main(){

    int n;
    std::scanf( "%d", &n );

    std::vector<int> a(n);
    for( int i = 0; i < n; i++ ){
        std::scanf( "%d", &a[i] );
    }

    int totalSwaps = 0;
    // BUBBLE SORT ALGORITHM PROVIDED BY HACKERANK
    for (int i = 0; i < n; i++) {
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        
        for (int j = 0; j < n - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swap( a[j], a[j + 1]);
                numberOfSwaps++;
            }
        }
        totalSwaps += numberOfSwaps;
        // If no elements were swapped during a traversal, array is sorted
        if (numberOfSwaps == 0) {
            break;
        }
    }

    std::printf( "Array is sorted in %d swaps.\n", totalSwaps );
    std::printf( "First Element: %d\nLast Element: %d\n", a[0], a[n-1] );
    return 0;
}


/*
***** Sample Input 0 *****
3
1 2 3

***** Output
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3


***** Sample Input 1 ****
3
3 2 1

***** Output 
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

*/
