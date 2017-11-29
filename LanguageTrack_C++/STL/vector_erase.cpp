/*

File:     vector_erase.cpp
Purpose:  HackerRank Challenge, Vector-Erase
Author:   Lucas Brown
Date:     November 28, 2017

Compiler: GNU Compiler Collection (GCC)
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
erase( int position ):
    Removes the element present at position
    v.erase( v.begin() + 4 );  // Erases the fifth element of the vector v.

erase( int start, int end ):
    Removes the elements in the range from start to end, inclusive of the start and exclusive of the end.
    v.erase( v.begin() + 2, v.begin() + 5 );  // Erases all the elements from the third element to the fifth element.


Task
-----
You are provided a vector of N integers. Then, you are given 2 queries. For the first query, you are provided with 1 integer, which denotes a position in the vector. The value at this position in the vector needs to be erased. The next query consists of 2 integers denoting a range of the positions in the vector. The elements which fall under that range should be removed. The second query is performed on the updated vector which we get after performing the first query.


Input Format
-------------
The first line of the input contains an integer N. The next line contains N space separated integers (1-based index). The third line contains a single integer x, denoting the position of an element that should be removed from the vector. The fourth line contains two integers a and b denoting the range that should be erased from the vector inclusive of a and exclusive of b.


Output Format
--------------
Print the size of the vector in the first line and the elements of the vector after the two erase operations in the second line separated by space.


Constraints
------------
1 <= N <= 10^5
1 <= x <= N
1 <= a < b <= N


Sample Input
-------------
6
1 4 6 2 8 9
2
2 4


Sample Output
--------------
3
1 8 9

*/

#include <iostream>
#include <vector>

int main() {

    int vec_size;
    std::cin >> vec_size;

    std::vector<int> vec;
    vec.reserve( vec_size );
    for( int i = 0; i < vec_size; i++ ) {
        int next;
        std::cin >> next;
        vec.push_back( next );
    }

    int query_pos, query_start, query_end;
    std::cin >> query_pos >> query_start >> query_end;
    
    vec.erase( vec.begin() + --query_pos );
    vec.erase( vec.begin() + --query_start, vec.begin() + --query_end );

    std::cout << vec.size() << std::endl;
    for( int i = 0; i < vec.size(); i++ ) {
        std::cout << vec[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}