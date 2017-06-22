/*
***** Task *****
The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method are provided for you in the editor. Write the Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divsorSum method must be public and taken an integer parameter, n, and return the sum of all it's divisors.

***** Input Format *****
A single line containing an integer, n.

***** Constraints *****
1 <= n <= 1000

***** Output Format *****
You are not responsible for printing anything to sdout. The locked Solution class in the editor below ill call your code and print the necessary output.

*/

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
class AdvancedArithmetic{
    public:
        virtual int divisorSum(int n)=0;
};
// END CODE SEGMENT
// **********************************************

// Write solution here
class Calculator : public AdvancedArithmetic {
    public:
        Calculator(){};
        ~Calculator(){};
        int divisorSum( int n ){
            int sum = 0;
            for( int i = 1; i <= n; i++ ){
                if( n % i == 0 ){
                    sum += i;
                }
            }
            return sum;
        }
};

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
int main(){
    int n;
    cin >> n;
    AdvancedArithmetic *myCalculator = new Calculator(); 
    int sum = myCalculator->divisorSum(n);
    cout << "I implemented: AdvancedArithmetic\n" << sum;
    return 0;
}
// END CODE SEGMENT
// **********************************************


/*
***** Sample Input *****
6
***** Output
I implemented: AdvancedArithmetic
12

*/