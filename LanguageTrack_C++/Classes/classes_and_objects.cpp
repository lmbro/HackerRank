/*

File:     classes_and_objects.cpp
Purpose:  HackerRank Challenge, Classes and Objects
Author:   Lucas Brown
Date:     November 23, 2017

Compiler: GNU Compiler Collection (GCC)
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
A class defines a blueprint for an object. We use the same syntax to declare objects of a class as we use to declare variables of other basic types.

Box box1;   // Declares variable box1 of type Box
Box box2;   // Declares variable box2 of type Box


Task
-----
Kristen is a contender for valedictorian of her high school. She wants to know how many students (if any) have scored higher than her in the 5 exams given during this semester.

Create a class named Student with the following specifications:
- An instance variable named scores to hold a student's 5 exam scores.
- A void input() function that reads 5 integers and saves them to scores.
- An int calculateTotalScore() function that returns the sum of the student's scores.


Input Format
-------------
Most of the input is handled for you by the locked code in the editor.

In the void Student::input() function, you must read 5 scores from stdin and save them to your scores instance variable.


Output Format
--------------
In the int Student::calculateTotalScore() function, you must return the student's total grade (the sum of the values in scores).

The locked code in the editor will determine how many scores are larger than Kristen's and print that number to the console.


Constraints
------------
1 <= n <= 100
0 <= examscore <= 50


Sample Input
-------------
The first line contains n, the number of students in Kristen's class. The n subsequent lines contain each student's 5 exame grades for this semester.

3
30 40 45 10 10
40 40 40 10 10
50 20 30 10 10


Sample Output
--------------
1

*/

#include <iostream>
#include <string>

class Student {

    private:
        int scores[5];

    public:

        void input() {
            for( int i = 0; i < 5; i++ ) {
                std::cin >> scores[i];
            }
            return;
        }

        int calculateTotalScore() {
            int sum = 0;
            for( int i = 0; i < 5; i++ ) {
                sum += scores[i];
            }
            return sum;
        }
};


/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
int main() {
    int n; // number of students
    std::cin >> n;
    Student *s = new Student[n]; // an array of n students
    
    for(int i = 0; i < n; i++){
        s[i].input();
    }

    // calculate kristen's score
    int kristen_score = s[0].calculateTotalScore();

    // determine how many students scored higher than kristen
    int count = 0; 
    for(int i = 1; i < n; i++){
        int total = s[i].calculateTotalScore();
        if(total > kristen_score){
            count++;
        }
    }

    // print result
    std::cout << count;
    
    return 0;
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
