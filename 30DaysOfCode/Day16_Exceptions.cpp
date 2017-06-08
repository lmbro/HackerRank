/*
***** Task *****
Read a string, S, and print it's integer value. If S cannot be converted to an integer, print 'Bad String'.
NOTE: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a 0 score.

***** Input Format *****
A single string, S

***** Constraints *****
1 <= S.length() <= 6
S is composed of either lowercase letters (a - z) or decimal digits (0 - 9)
*/

#include <iostream>
#include <string>

int main(){

    std::string str;
    int i;

    std::cin >> str;
    try{
        i = std::stoi(str);
        std::cout << i << std::endl;
    } catch(...) {
        std::cout << "Bad String" << std::endl;
    }

    return 0;
}
        




/*
SAMPLE INPUT
3

EXPECTED OUTPUT
3


SAMPLE INPUT
za

EXPECTED OUTPUT
Bad String
*/