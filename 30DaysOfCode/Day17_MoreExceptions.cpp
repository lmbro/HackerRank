/*
***** Task *****
Write a Calculator class with a single method: int power(int,int). The power method takes two integers, n and p, as parameers and returns the integer result of n^p. If either n or p is negative, then the method must throw an exception with the message "n and p should be non-negative"

***** Input Format *****
Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, T, then number of test cases. Each of the T subsequent lines describes a test case in 2 space-separated integers denoting n and p, respectively.

***** Constraints *****
No Test Case will result in overflow of correctly written code.

***** Output Format *****
Output to stdout is handled for you by the locked stub code in your editor. There are T lines of output, where each line contains teh result of n^p as caluclated by your Calculator class' power method.
*/

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
#include <cmath>
#include <iostream>
#include <exception>
#include <stdexcept>
using namespace std;
// END CODE SEGMENT
// **********************************************

struct NegativeException : public exception{
    const char * what() const throw(){
        return "n and p should be non-negative";
    }
};

class Calculator{
    public:
        int power(int n, int p){
            if ( n < 0 || p < 0){
                    throw NegativeException();
            }
            return pow(n,p);
        }
};
                
// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
int main()
{
    Calculator myCalculator=Calculator();
    int T,n,p;
    cin>>T;
    while(T-->0){
      if(scanf("%d %d",&n,&p)==2){
         try{
               int ans=myCalculator.power(n,p);
               cout<<ans<<endl; 
         }
         catch(exception& e){
             cout<<e.what()<<endl;
         }
      }
    }
    
}
// END CODE SEGMENT
// **********************************************

/*
SAMPLE INPUT
4
3 5
2 4
-1 -2
-1 3

EXPECTED OUTPUT
243
16
n and p should be non-negative
n and p should be non-negative

*/