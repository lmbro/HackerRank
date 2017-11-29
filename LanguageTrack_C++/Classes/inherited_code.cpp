/*

File:     inherited_code.cpp
Purpose:  HackerRank Challenge, Inherited Code
Author:   Lucas Brown
Date:     November 25, 2017

Compiler: GNU Compiler Collection (GCC)
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
You inherited a piece of code that performs username validation for your company's website. The existing function works reasonably well, but it throws an exception when the usernme is too short. Upon review, you realize that nobody ever defined he exception.

The inherited code is provided for you in the locked section of your editor. Complete the code so that, when an exception is thrown, it prints "Too short: n" (where n is the length of the given username).


Input Format
-------------
The first line contains an integer, t, the number of test cases.
Each of the t subsequent lines describes a test case as a single username string, u.


Output Format
--------------
You are not responsible for directly printing anything to stdout. If you code is correct, the locked stub code in your editor will print either "Valid" (if the username is valid), "Invalid" (if the username is invalid), or "Too short: n" (where n is the length of the too-short username) on a new line for each test case.


Constraints
------------
1 <= t <= 1000
1 <= length(u) <= 100
The username


Sample Input
-------------
3
Peter
Me
Arxwwz


Sample Output
--------------
Valid
Too short: 2
Invalid

*/

#include <exception>
#include <iostream>
#include <string>

class BadLengthException: public std::exception {

	private:
		std::string str_length;

	public:

		BadLengthException( int length ) {
			str_length = std::to_string(length);
		}

		const char * what() const throw(){
			return str_length.c_str();
		}
};

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */

bool checkUsername(std::string username) {
	bool isValid = true;
	int n = username.length();
	if(n < 5) {
		throw BadLengthException(n);
	}
	for(int i = 0; i < n-1; i++) {
		if(username[i] == 'w' && username[i+1] == 'w') {
			isValid = false;
		}
	}
	return isValid;
}

int main() {
	int T; std::cin >> T;
	while(T--) {
		std::string username;
		std::cin >> username;
		try {
			bool isValid = checkUsername(username);
			if(isValid) {
				std::cout << "Valid" << '\n';
			} else {
				std::cout << "Invalid" << '\n';
			}
		} catch (BadLengthException e) {
			std::cout << "Too short: " << e.what() << '\n';
		}
	}
	return 0;
}

/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
