/*

File:     box_it.cpp
Purpose:  HackerRank Challenge, Box It!
Author:   Lucas Brown
Date:     November 24, 2017

Compiler: GNU Compiler Collection (GCC)
          g++ (Ubuntu 6.3.0-12ubuntu2) 6.3.0 20170406

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Task
-----
Design a class named Box whose dimensions are integers and private to the class. The dimensions are labelled: length l, breadth b, and height h.

The default constructor of the class should initialize l, b, and h to 0.

The parameterized constructor Box( int length, int breadth, int height ) should initialize Box's l, b, and h to length, breadth, and height.

The copy constructor Box( Box B ) should set l, b, and h to B's l, b, and h, respectively.

Apart from the above, the class should have 4 functions:
- int getLength() - Return box's length
- int getBreadth() - Return box's breadth
- int getHeight() - Return box's height
- long long CalculateVolume() - Return the volume of the box.

Overload the operator < for the class Box. Box A < Box B if:
- A.l < B.l
- A.b < B.b and A.l == B.l
- A.h < B.h and A.b == B.b and A.l == B.l

Overload operator << for the class Box(). If B is an object of class Box:
- cout << B should pirnt B.l, B.b, and B.h on a single line separated bys paces.


Constraints
------------
0 <= l, b, h <= 10^5
Two boxes being compared using the < operator will not have all three dimensions equal.

*/

#include <iostream>

class Box {

    private:
        int length;
        int width;
        int height;

    public:
        
        Box() {
			length = 0;
			width = 0;
			height = 0;
		}
        Box( int length, int width, int height ) {
			this->length = length;
			this->width = width;
			this->height = height;
		}
        Box( const Box& b ) {
			length = b.length;
			width = b.width;
			height = b.height;
		}

        int getLength() {
			return length;
		}
        int getBreadth() {
			return width;
		}
        int getHeight() {
			return height;
		}
        long long CalculateVolume() {
			return (long long)length * width * height;
		}

		bool operator<( Box &other ) {
		
			if( length < other.length ) {
				return true;
			} else if( width < other.width && length == other.length ) {
				return true;
			} else if( height < other.height && height == other.height && length == other.length ) {
				return true;
			}

			return false;
		}
			
		friend std::ostream &operator<<( std::ostream &out, const Box &box ) {
			out << box.length << " " << box.width << " " << box.height;
			return out;
		}
};
        
/* --------------------------------------------------------------
            BEGIN (1/1): Code provided by HackerRank
-------------------------------------------------------------- */

void check2()
{
	int n;
	std::cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		std::cin>>type;
		if(type ==1)
		{
			std::cout<<temp<<std::endl;
		}
		if(type == 2)
		{
			int l,b,h;
			std::cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			std::cout<<temp<<std::endl;
		}
		if(type==3)
		{
			int l,b,h;
			std::cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				std::cout<<"Lesser\n";
			}
			else
			{
				std::cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			std::cout<<temp.CalculateVolume()<<std::endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			std::cout<<NewBox<<std::endl;
		}

	}
}

int main()
{
	check2();
}

/* --------------------------------------------------------------
            End (1/1): Code provided by HackerRank
-------------------------------------------------------------- */
