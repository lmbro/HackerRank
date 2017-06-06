/*
***** Task *****

HackerLand University has teh following grading policy
- every student recieves a grade in the inclusive range from 0 to 100
- any grade less than 40 is a fialing grade

Sam is a professor at the university and likes to round each studen'ts grade according to these rules
- if the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5
- if the value of grade is less than 38, no rounding occurs as the result will still be a failing grade

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. For each grade, round it according to the rules above and print the result on a new line.


***** Input Format *****

The first line contains a single integer denoting n, the number of students
Each line i of the n subsequent lines contains a single integer, grade, dentoting student i's grade


***** Constraints *****

1 <= n <= 60
0 <= grade <= 100
*/

#include <iostream>

int main(){
    
    short n;
    std::cin >> n;
    
    short grade[n];
    for(int i=0; i<n; i++) std::cin >> grade[i];

    // Separate I/O
    for(int i=0; i<n; i++){
        short mod_five = grade[i]%5;
        if(grade[i]>=38 && mod_five>2){
            grade[i] += (5-mod_five);
        }
        std::cout << grade[i] << std::endl;
    }
    return 0;
}

/* 
INPUT SAMPLE

4
73
67
38
33

EXPECTED OUTPUT

75
67
40
33
*/