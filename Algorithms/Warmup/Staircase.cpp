/*
Background
A staircase of size in is right-alined, composed of # symbols and spaces, and has a height and width of n.
Ex. Staircase of size 4
   #
  ##
 ###
####

Task
Write a program that prints a staircase of size n.

Input
A single integer, n, denoting th size of the staircase.
*/

#include <iostream>

int main(){
    int n;
    std::cin >> n;
    for(int i=0; i<n; i++){
        for(int j=1; j<n-i; j++) std::cout << " ";
        for(int k=0; k<=i; k++) std::cout << "#";
        std::cout << std::endl;
    }
    return 0;
}

