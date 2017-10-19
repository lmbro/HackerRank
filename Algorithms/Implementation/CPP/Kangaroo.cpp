/*
***** Background *****
There are two kangaroos on an x-axis ready to jump in the positive direction (i.e., towards positive ifinity). The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump. The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.

***** Task *****
Given the starting locations and movement rates for each kangaroo, determine if they'll ever land at the same location at the same time. Print YES or NO.

***** Input Format *****
A single line contain four space-separated integers denoting the respective values of x1, v1, x2, and v2.

***** Constraints *****
0 <= x1 < x2 <= 10,000
1 <= v1 <= 10,000
1 <= v2 <= 10,000
*/

#include <iostream>

int main(){

    short x1, v1, x2, v2;
    std::cin >> x1 >> v1 >> x2 >> v2;

    // Prevent division by zero and handle simple cases (v1==v2 only works if x1==x2, so check it first)
    if(x2==x1) {std::cout << "YES" << std::endl; return 0;}
    if(v2==v1) {std::cout << "NO" << std::endl; return 0;}
    
    // x1 + v1(j) ?= x2 + v2(j) for some x1, x2, v1, and v2, where j is # of jumps.
    // j = (x1 - x2) / (v2 - v1), j must be a positive integer
    ((x1-x2)%(v2-v1)==0 && (x1-x2)/(v2-v1)>0) ? std::cout << "YES" : std::cout << "NO";
    std::cout << std::endl;

    return 0;
}

/*
SAMPLE INPUT
0 3 4 2

EXPECTED OUTPUT
YES
*/