/*
***** Background *****

This challenge is very different from the others we've completed because it requires you to generate a valid test case for a problem instead of solving a problem. There is no input to read, you simply have to generate and print the test values for the problem that satisfy both the problem's Input Format and the criteria laid out in the Task section.

Consider the following problem but do not solve it:

	*** Task ***
	A Discrete Mathematics professor has a class of n students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than k students are present when class starts. Given the arrival time of each student, determine if the class is canceled.

	*** Input Format ***
	The first line of input contains t, the number of lectures
	The information for each lecture spans two lines. The first line has two space-separated integers, n (the number of students in the class) and k (the cancellation threshold). The second line contains n space-separated integers describing the students' arrival times (a[0], a[1], ... , a[n-1])
	NOTE: Non-positive arrival times (a[i] <= 0) indicate the student arrived early or on time; positive arrival times (a[i] > 0) indicate the student arrived a[i] minutes late. If a student arrives exactly on time (a[i] = 0), the student is considered to have entered before the class started.

	*** Output Format ***
	For each test case, print the word YES if the class is canceled or NO if it is not.

	*** Sample Input ***
	2
	4 3
	-1 -3 4 2
	4 2
	0 -1 2 1

	*** Output
	YES
	NO

***** Task *****
Create and print a test case for the problem abave that meet the following criteria:
t <= 5
3 <= n <= 200
1 <= k <= n
-10^3 <= a[i] <= 10^3
The value of n must be distince across all the test cases
Array A must have a least 1 zero, 1 positive integer, and 1 negative integer

***** Input Format *****
You are not responsible for reading anything from stdin

***** Output Format *****
Print 11 lines of output that can be read by the professor challenge as valid input. Your test case must result in the following output when fed as input to the Professor challenge's solution:

YES
NO
YES
NO
YES
*/

#include <cstdio>

using namespace std;

int main() {
	
	// t, number of lectures
	puts("5");

	// Test case 1, result = YES
	puts("3 2");
	puts("0 0 0")

	// Test case 2, result = NO
	puts("4 3");
	puts("-1 -4 1 2");

	// Test case 3, result = YES
	puts("5 2");
	puts("-1 -8 1 2 3");

	// Test case 4, result = NO
	puts("6 5");
	puts("1 2 3 4 -1 -4");

	// Test case 5, result = YES
	puts("7 1");
	puts("1 2 3 4 5 6 7");

	return 0;
}