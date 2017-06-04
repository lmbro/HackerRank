/* Problem description in VirtualFunctions.txt

NOTE: This challenge has uneditable code at the beginning and end of the submission box. Namely, the main function and preprocessor directives. The code is presented here in it's entirety for reerence - the uneditable lines are commented out to prevent duplication this file is uploaded.

Remove comment blocks to compile on personal machine.
*/

/* 
REMOVED FOR UPLOAD TO HACKERRANK

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
*/
#include <string>

class Person{
    public:
        std::string name;
        int age;
        int cur_id;
        virtual void getdata();
        virtual void putdata();
};
class Professor: public Person{
    public: 
        static int cur_id_static;
        int publications;
        void getdata();
        void putdata();
};
class Student: public Person{
    public:
        static int cur_id_static;
        int marks[6];
        void getdata();
        void putdata();
};

void Person::getdata(){
    std::cin >> name >> age;
}
void Professor::getdata(){
    std::cin >> name >> age >> publications;
    cur_id=cur_id_static++;
}
void Student::getdata(){
    std::cin >> name >> age;  
    for(int i=0; i<6; i++) std::cin >> (marks[i]);
    cur_id=cur_id_static++;
}
void Person::putdata(){
    std::cout << name <<" "<< age << std::endl;
}
void Professor::putdata(){
    std::cout << name <<" "<< age <<" "<< publications <<" "<< cur_id <<  std::endl;
}
void Student::putdata(){
    int mark_sum=0;
    for(int i=0; i<6; i++) mark_sum+=marks[i];
    std::cout << name <<" "<< age <<" "<< mark_sum <<" "<< cur_id << std::endl;
}

int Professor::cur_id_static=1;
int Student::cur_id_static=1;


/*
REMOVED FOR SUBMISSION TO HACKERRANK

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;
}
*/