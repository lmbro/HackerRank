/*

File:     class.cpp
Purpose:  HackerRank Challenge, Class
Author:   Lucas Brown
Date:     November 23, 2017

Compiler: GCC 6.3.0 20170406 (Ubuntu 6.3.0-12ubuntu2)


Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
Classes in C++ are user defined types declared with keyword class that has data and functions. Although classes and structures have the same type of functionality, there are some basic differences. 

The data members of a class are private by dfeault and the members of a structure are public by default. Along with storing multiple data in a common block, it also assigns some functions (known as methods) to manipulate/access them. It serves as the building block of Object Oriented Programming.

It also has access specifiers, which restrict the access of member elements. The primarily used ones are the following:

- public: Public members (variables, methods) can accessed from anywhere the code is visible.
- private: Private members can be accessed only by other member functions, and it can not be accessed outside of class.

It's common practice to make all variables private, and set/get them using public methods.


Task
-----
We can store details related to a student in a class consisting of hsi age (int), first_name (string), last_name (string), and standard (int).

Create a class, named Student, representing the student's details, as mentioned above, and store the data of a student. Create setter and getter functions for each element; that is, the class should at least have the following functions:
- get_age, set_age
- get_first_name, set_first_name
- get_last_name, set_last_name
- get_standard, set_standard

Also, you have to create another method to_string() which returns the string consisting of the above elements, separated by a comma(,). You can refer to stringstream for this.


Input Format
-------------
Input will consist of four lines.
The first line will contain an integer, representing the age. 
The second line will contain a string, consisting of lower-case Latin characters ('a'-'z'), representing the first_name of a student.
The third line will contain another string, consisting of lower-case Latin characters ('a'-'z'), representing the last name of a student.
The fourth line will contain an integer, representing the standard of a student.

Note: The number of characters in first_name an last_name will not exceed 50.


Output Format
--------------
The code provided by HackerRank will use your class members to set and then get the elements of the Student class.


Sample Input
-------------
15
john
carmack
10


Sample Output
--------------
15
carmack, john
10

15,john,carmack,10

*/

#include <iostream>
#include <string>
#include <sstream>

class Student {

    private:
        int age;
        std::string first_name;
        std::string last_name;
        int standard;

    public:
        
        int get_age() {
            return age;
        }

        std::string get_first_name() {
            return first_name;
        }

        std::string get_last_name() {
            return last_name;
        }

        int get_standard() {
            return standard;
        }

        void set_age( int age ) {
            this->age = age;
            return;
        }

        void set_first_name( std::string first_name ) {
            this->first_name = first_name;
            return;
        }

        void set_last_name( std::string last_name ) {
            this->last_name = last_name;
            return;
        }

        void set_standard( int standard ) {
            this->standard = standard;
            return;
        }

        std::string to_string() {
            std::ostringstream out_stream;
            out_stream << age << ',' << first_name << ',' << last_name << ',' << standard << std::endl;
            return out_stream.str();
        }

};

/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
int main() {
    int age, standard;
    std::string first_name, last_name;
    
    std::cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    std::cout << st.get_age() << "\n";
    std::cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    std::cout << st.get_standard() << "\n";
    std::cout << "\n";
    std::cout << st.to_string();
    
    return 0;
}
/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
