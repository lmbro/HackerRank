/*
Background
We consider two strings to be anagrams of each other if the
first string's letters can be rearranged to form the second
string. In other words, the two strings contain the same
letters in the same frequency.

Task
Given two strings, a and b, that may or may not be the same 
length, determine the minimum number of character deletions
required to make the two strings anagrams.

Input Format
The first line contains a single string, a
The second line contains a single string, b

Constraints
1 <= abs(a),abs(b) <= 10^4
It is guaranteed that a and b consist of lowercase English
alphabetic characters.
*/

#include <iostream>
#include <string>

using namespace std;

int num_diff_letters(string a, string b);

int main(){
    string a,b;
    cin >> a >> b;
    cout << num_diff_letters(a, b) << endl;
    return 0;
}
int num_diff_letters(string a, string b){
    int count=0;
    for(int i=0; i<a.length(); i++){
        if(b.find(a[i],0)==string::npos){
            count++;
        }else{
            b.erase(b.find(a[i],0),1);
        }
    }
    return count+b.length();
}