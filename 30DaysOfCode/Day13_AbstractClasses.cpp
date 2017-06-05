/*
Task

Given a Book class and a Solution class, write a MyBook class taht does the following:
- inherits from Book
- has a parameterized constructor taking these 3 parameters:
    - string title
    - string author
    - int price
- implements the Book class' abstract display() method so it prints these 3 lines:
    - "Title: ", then the current instance's title
    - "Author: ",
    - "Price: "


Input Format

You are not responsible for reading any input from stdin. The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments). It then calls the display method on the Book object.
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
class Book{
    protected:
        string title;
        string author;
    public:
        Book(string t,string a){
            title=t;
            author=a;
        }
        virtual void display()=0;

};
// END CODE SEGMENT
// **********************************************

class MyBook : public Book{
    private:
        int price;
    public:
        MyBook(string title, string author, int price)
        : Book(title, author){
            this->price = price;
        }
        void display(){
            cout << "Title: " << title << endl;
            cout << "Author: " << author << endl;
            cout << "Price: " << price << endl;
        }

};

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
int main() {
    string title,author;
    int price;
    getline(cin,title);
    getline(cin,author);
    cin>>price;
    MyBook novel(title,author,price);
    novel.display();
    return 0;
}
// END CODE SEGMENT
// **********************************************