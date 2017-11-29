/*

File:     vector_sort.cpp
Purpose:  HackerRank Challenge, Vector-Sort
Author:   Lucas Brown
Date:     November 28, 2017

Compiler: GNU Compiler Collection (GCC)
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Vectors are sequence containers representing arrays that can change in size.

Declaration:
vector<int> v; // Creates an empty vector of integers.

Size:
int size = v.size();

Pushing an integer into a vector:
v.push_back(x);  // Where x is an integer. The size increases by 1 after this.

Popping the last element from the vector:
v.pop_back();  // After this the size decreases by one.

Sorting a vector:
sort( v.begin(), v.end() );  // Will sort all the elements in the vector.


Task
-----
You are given N integers. Sort the N integers and print the sorted order. Store the N integers in a vector.


Input Format
-------------
The first line of input contains N where N is the number of integers. The next line contains N integers.


Output Format
--------------
Print the integers in the sorted order one by one in a single line followed by a space.


Constraints
------------
1 <= N <= 10^5
1 <= V[i] <= 10^9, where V[i] is the ith integer in the vector


Sample Input
-------------
5
1 6 10 8 4


Sample Output
--------------
1 4 6 8 10

*/

#include <algorithm>  // std::sort
#include <iostream>
#include <vector>


int main() {

    int n_ints;
    std::vector<int> vec;

    std::cin >> n_ints;
    vec.reserve( n_ints );

    for( int i = 0; i < n_ints; i++ ) {
        int next;
        std::cin >> next;
        vec.push_back( next );
    }

    std::sort( vec.begin(), vec.end() );
    for( int i = 0; i < n_ints; i++ ) {
        std::cout << vec[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}