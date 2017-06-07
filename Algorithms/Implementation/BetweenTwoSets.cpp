/*
***** Background *****
Consider two sets of positive integers, A and B. We say that a positive integer x is between sets A and B if the following conditions are satisfied:
- All elements in A are factors of x
- x is a factor of all elements in B

***** Task *****
Givent A and B, find and print the number of integers (possibe x's) that are between the two sets

***** Input Format *****
The first line contains two space-separated integers describing the respective values of n (number of elements in set A) and m (number of elements in set B).
The second line contains n distinct space-separated integers describing A
The third line contains m distinct space-separated integesr describing B

***** Constraints *****
1 <= n,m <= 10
1 <= a <= 100
1 <= b <= 100
*/

#include <iostream>
#include <vector>

int main(){
    short n,m;
    std::cin >> n >> m;

    short a[n],b[m];
    short b_max=0;
    std::vector<short> x_vector;

    // Build sets A and B
    for(int i=0; i<n; i++){
        std::cin >> a[i];
    }
    for(int i=0; i<m; i++){
        std::cin >> b[i];
        if( b[i] > b_max ) b_max=b[i];
    }  
    // Find factors of the largest value is set B
    for(int x=1; x<=b_max; x++){
        if( b_max % x == 0 ) x_vector.push_back(x);
    }
    // Remove values of x that are not factors of all other elements in B
    for(int i=0; i<m; i++){
        std::vector<int>::size_type x=0;
        while( x < x_vector.size() ){
            if( b[i] % x_vector[x] != 0 ){
                x_vector.erase( x_vector.begin() + x );
            } else {
                x++;
            }
        }
    }
    // Remove values of x that are not multiples of all elements in A
    for(int i=0; i<n; i++){
        std::vector<int>::size_type x=0;
        while (x < x_vector.size() ){
            if ( x_vector[x] % a[i] != 0 ){
                x_vector.erase( x_vector.begin() + x);
            } else {
                x++;
            }
        }
    }
    // Print the number of integers between sets A and B
    std::cout << x_vector.size() << std::endl;
  
    return 0;
}
/*
INPUT SAMPLE
2 3
2 4
16 32 96

EXPECTED OUTPUT
3


INPUT SAMPLE
3 2
3 9 6
36 72

EXPECTED OUTPUT
2
*/