/*

Stacks_BalancedBrackets.cpp
Purpose: HackerRank Challenge, Stacks: Balanced Brackets

Author: Lucas Brown
Version: 1.0 6/27/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
A bracket is considered to be any one of the following characters: ( ) { } [ ]

Two brackets are considered to be a matched pair if an opening bracket occurs to the left of a closing bracket of the exact same type. There are tree types of matched brackets (shown above).

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced.

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
- It contains no unmatched brackets
- The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.


Task
-----
Given n strings of brackets, determine whether each sequence of brackets is balanced. IF a string is balanced, print YES on a new line; otherwise, print NO on a new line.


Input Format
-------------
The first line contains a single integer, n, denoting the number of strings
Each line i of the n subsequent lines consists of a single string, s, denoting a sequence of brackets.


Constraints
------------
1 <= n <= 10^3
1 <= length(s) <= 10^3, where length(s) is the length of the sequence
Each character in the sequence will be a bracket - i.e., {, }, (, ), [, and ] 


Output Format
--------------
For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.


Sample Input
-------------
3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output
-------------
YES
NO
YES

*/

#include <iostream>
#include <string>
#include <stack>

using namespace std;

bool is_balanced(std::string expression) {

    std::stack<char> bracket_stack;

    for( char ch : expression ){

        // Due to problem constraints, we can assume the string expression contains only the 6 brackets listed
        if( ch == '{' || ch == '[' || ch == '(' ) {

            bracket_stack.push(ch);

        } else {

            // If the stack is empty and we see a closing bracket, we know it doesn't belong to a matching pair
            if( bracket_stack.empty() ) { return false; }

            // Remove open bracket if matching, return false if not
            switch( ch ){
                case '}':
                    if( bracket_stack.top() != '{' ) { return false; }
                    break;
                case ']':
                    if( bracket_stack.top() != '[' ) { return false; }
                    break;
                case ')':
                    if( bracket_stack.top() != '(' ) { return false; }
                    break;
            }
            bracket_stack.pop();
        }
    }

    // Matching pairs of brackets are removed from the stack. If any remain, they are not matching.
    if( bracket_stack.empty() ) {
        return true;
    } else {
        return false;
    } 
}

/* --------------------------------------------------------------
        BEGIN (1/1): Code provided by HackerRank               */
int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        string expression;
        cin >> expression;
        bool answer = is_balanced(expression);
        if(answer)
            cout << "YES\n";
        else cout << "NO\n";
    }
    return 0;
}
/*      END (1/1): Code provided by HackerRank
-------------------------------------------------------------- */