/*
Task
Write a facotrial function that takes a positive integer N as
a parameter and prints the result of N! (N factorial)

Input Format
A single integer, N

Constraints
2 <= N <= 12
Your submission must contain a recursive function named factorial
*/

#include <iostream>

using namespace std;

int factorial(int n){
    if(n==1){
        return 1;
    }else{
        return n*factorial(n-1);
    }
}
int main(){
    int n;
    cin >> n;
    cout << factorial(n) << endl;
}