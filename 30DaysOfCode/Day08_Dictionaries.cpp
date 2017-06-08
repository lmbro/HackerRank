/*
Task
Given n names and phone numbers, assemble a phone book that
maps friends' names to their respective phone numbers. You 
will then be given an unknown number of names to query your
phone book for. For each name queried, print the associated 
entry from your phone book on a new line in the form 
name=phoneNumber; if an entry for name is not found, print
'Not found' instead.

Input Format
The first line contains an integer n denoting the number of
entries in the phone book. Each of the n subsequent lines 
describes an entry in the form of 2 space-separated values on
a single line. The first value is a friend's name, and the
second value is an 8-digit phone number

Constraints
1 <= n <= 10^5
1 <= queries <= 10^5
*/

#include <iostream>
#include <map>

using namespace std;

void build_phonebook(map<string,int>& pb);
void query_phonebook(map<string,int>& pb);

int main(){
    int n;
    map<string,int> phonebook;
    
    build_phonebook(phonebook);
    query_phonebook(phonebook);

    return 0;
}
void build_phonebook(map<string,int>& pb){
    int n, number;
    string name;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> name >> number;
        pb[name]=number;
    } 
}
void query_phonebook(map<string,int>& pb){
    string name;
    cin.ignore();        
    while(cin.peek()!='\n' && !cin.eof()){
        cin >> name; cin.ignore();
        (pb.count(name)!=0) ? cout << name << "=" << pb[name] << endl : cout << "Not found" << endl;
    }
}