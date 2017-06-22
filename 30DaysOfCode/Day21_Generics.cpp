/*
***** Task *****
Write a single generic function named printArray; this function must taken an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.
NOTE: You must use generics to solve this challenge. Do not write overloaded functions. 

***** Input Format *****
The locted Solution class in your editor will pass idfferent types of arrays to your printArray function.

***** Constraints *****
You must have exactly one function named printArray.

***** Output Format *****
Your printArray function should print each element of it's generic array parameter on a new line.

*/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

template <typename T>
void printArray(vector<T>& vec){
    for(typename vector<T>::iterator it = vec.begin(); it != vec.end(); it++){
        cout << (*it) << endl;
    }
}

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
int main() {
	int n;
	
	cin >> n;
	vector<int> int_vector(n);
	for (int i = 0; i < n; i++) {
		int value;
		cin >> value;
		int_vector[i] = value;
	}
	
	cin >> n;
	vector<string> string_vector(n);
	for (int i = 0; i < n; i++) {
		string value;
		cin >> value;
		string_vector[i] = value;
	}

	printArray<int>(int_vector);
	printArray<string>(string_vector);

	return 0;
}