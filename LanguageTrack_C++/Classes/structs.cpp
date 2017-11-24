/*

File:     structs.cpp
Purpose:  HackerRank Challenge, Structs
Author:   Lucas Brown
Date:     November 23, 2017

Compiler: GNU Compiler Collection (GCC) 
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406


Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
struct is a way to combine multiple fields to represent a composite data structure, which further lays the foundation for Object Oriented Programming. For example, we can store details related to a student in a struct consisting fo hsi age (int), first_name (string), last_name (string), and standard (int).

struct can be represented as:

struct NewType {
    type1 value1;
    type2 value2;
    ...
    typeN valueN;    
};


Task
-----
You have to create a struct, named Student, representing the student's details, as mentioned above, and store the data of a student.


Input Format
-------------
Input will consist of four lines.
The first line will contain an integer, representing age.
The second line will contain a string, consisting of lower-case Latin characters ('a'-'z'), represeting the first_name of the student.
The third line will contain another string, consisting of lower-case Latin character ('a'-'z'), representing the last_name of a student.
The fourth line will contain an integer, representing the stnadard of student.

NOTE: The number of characters in first_name and last_name will not exceed 50.


Output Format
--------------
Output will be a single line, consisting of age, first_name, last_name, and standard, each separated by one white space.


Sample Input
-------------
15
john
carmack
10


Sample Output
--------------
15 john carmack 10

*/

#include <iostream>
#include <string>

struct Student {
    int age;
    std::string first_name;
    std::string last_name;
    int standard;
};

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
int main() {
    Student st;
    
    std::cin >> st.age >> st.first_name >> st.last_name >> st.standard;
    std::cout << st.age << " " << st.first_name << " " << st.last_name << " " << st.standard;
    
    return 0;
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
