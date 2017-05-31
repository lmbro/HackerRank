/*
Lucas Brown
May 31, 2017

Task
Given a string S of length N that is indexed from 0 to N-1,
print it's even-indexed and odd-indexed characters as two
space-separated strings on a single line.

Input Format
The first line contains an integer T (the number of test cases)
Each line i of the T subsequent lines contain a string S.

Constraints
1 <= T <= 10
2 <= length of S <= 10000
*/

#include <iostream>
#include <string>

using namespace std;

int main(){
    int t;
    string s;

    cin >> t; cin.ignore();
    for(int i=0; i < t; i++){
        getline(cin,s);
        for(int j=0; j < s.length(); j+=2){
            cout << s[j];
        }
        cout << " ";
        for(int j=1; j < s.length(); j+=2){
            cout << s[j];
        }
        cout << endl;
    }
    return 0;
}