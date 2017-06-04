/*
stringstream is a stream class to operate on strings. It basically implements input/output operations on memory (string) based streams. stringstream can be helpful in different types of parsing. 

Operator >> extracted formatted data
Operator << inserts formatted data
Method str() gets teh contents of underlying string device object
Method str(string) sets the content of underlying string device object

One common use of this class is to parse comma-separated integers from a string.
*/

// All code provided except the body of parseInts function

#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
   int num;
   char ch;
   std::stringstream ss(str);
   std::vector<int> vec;

   while(ss >> num){
       vec.push_back(num);
       ss >> ch;
   }
   return vec;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
