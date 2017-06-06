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
    short a_max=1;
    short a_min=100;

    std::vector<int> x_vector;

    // All elements in A are factors of x
    // x is a factor of all elements in B
    // find the number of possible x's
    for(int i=0; i<n; i++){
        std::cin >> a[i];
        if(a[i]>a_max) a_max=a[i];
        if(a[i]<a_min) a_min=a[i];
    }
    for(int i=0; i<m; i++){
        std::cin >> b[i];
    }  
    
    // Elements in A that are factors of x
    for(int x=a_min; x<=a_max; x++){
        for(int i=0; i<n; i++){
            if(x%a[i] == 0) x_vector.push_back(x);
        }
    }
    for(int i=0; i<m; i++){
        for(int x=0; x<x_vector.size(); x++){
            if(b[i] % x_vector[x] != 0) x_vector.erase(x_vector.begin() + x);
        }
    }
    
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
*/