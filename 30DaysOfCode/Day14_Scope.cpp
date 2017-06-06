/*
The difference class is started for you in the editory. It has a private integer array (elements) for sorting N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.

Task
Complete the Difference class by writing the following:
- A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable
- A computerDifference method that finds the maxium absolute difference between any 2 numbers in N and stores it in the maxium Difference instance variable.

Input Format
You are not responsible for reading any input for stdin. The locked Solution class in your editor reads in 2 lines of input; the first line contains N and the second lnine describes the elements array.

Constraints
1 <= N <= 10
1 <= elements[i] <= 100
*/



// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;
// END CODE SEGMENT
// **********************************************

    Difference(vector<int> elements){ this->elements=elements; }

    void computeDifference(){
        int max=elements[0];
        int min=elements[0];
        for(vector<int>::iterator it=elements.begin(); it < elements.end(); it++){
            if (*it > max) max=*it;
            if (*it < min) min=*it;
        }
        maximumDifference=max-min;
    }

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}
// END CODE SEGMENT
// **********************************************