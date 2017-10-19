/*
***** Background *****
You are given an array of n integers, a[0], a[1], ... , a[n-1], and a positive integer, k. Find and print the number of (i,j) pairs where i < j and a[i]+a[j] is divisible by k

***** Task *****
The first line contains 2 space-separated integers, n and k, respectively
The second line contains n space-separated integesr describing the respective values of a[0], a[1], ... , a[n-1]

***** Constraints *****
2 <= n <= 100
1 <= k <= 100
1 <= a[i] <= 100

***** Ouptut Format *****
Print the number of (i,j) pairs where i < j and a[i]+a[j] is evenly divisible by k
*/

#include <iostream>

int main(){
    
    short n, k;
    std::cin >> n >> k;
    
    short a[n];
    for(int i=0; i<n; i++){
        std::cin >> a[i];
    }

    short pairs = 0;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if( (a[i]+a[j]) % k == 0 ) pairs++; // k > 0, no special cases needed
        }
    }

    std::cout << pairs << std::endl;
    return 0;
}

/*
SAMPLE INPUT
6 3
1 3 2 6 1 2

EXPECTED OUTPUT
5
*/