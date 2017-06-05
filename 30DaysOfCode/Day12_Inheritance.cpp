/*
Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you. Observe that Student inherits all the properties of Person.

Complete the student class by writing the following:
- A Student class constructor, which has 4 parameters.
    - A string, firstName
    - A string, lastName
    - An integer, id
    - An integer array (or vector) of test scores, scores
- A char calculate() method that calculates a Student object's average and returns the grade character representation of their calculated average a:
    O: 90 <= a <= 100
    E: 80 <= a < 90
    A: 70 <= a < 80
    P: 55 <= a < 70
    D: 40 <= a < 55
    T: a < 40


Input Format
The loced stub code in your editor calls your Student class constructor and passes it the necessary arguemetns. It also calls the calculate method (which takes no arguements)
*/

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
#include <iostream>
#include <vector>

using namespace std;


class Person{
	protected:
		string firstName;
		string lastName;
		int id;
	public:
		Person(string firstName, string lastName, int identification){
			this->firstName = firstName;
			this->lastName = lastName;
			this->id = identification;
		}
		void printPerson(){
			cout<< "Name: "<< lastName << ", "<< firstName <<"\nID: "<< id << "\n"; 
		}
	
};


class Student : public Person{
    private:
        vector<int> testScores;
// END CODE SEGMENT
// **********************************************

    public:
        Student(string firstName, string lastName, int id, vector<int> testScores)
            : Person(firstName, lastName, id){
            this->testScores = testScores;
        }
        char calculate(){
            int sum=0;
            double average=0.0;

            for(int i=0; i<testScores.size(); i++) 
                sum+=testScores[i];

            average=sum/testScores.size();
            if(average>=90) return 'O';
            else if(average>=80) return 'E';
            else if(average>=70) return 'A';
            else if(average>=55) return 'P';
            else if(average>=40) return 'D';
            return 'T';
        }
};

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
int main() {
	string firstName;
  	string lastName;
	int id;
  	int numScores;
	cin >> firstName >> lastName >> id >> numScores;
  	vector<int> scores;
  	for(int i = 0; i < numScores; i++){
	  	int tmpScore;
	  	cin >> tmpScore;
		scores.push_back(tmpScore);
	}
	Student* s = new Student(firstName, lastName, id, scores);
	s->printPerson();
	cout << "Grade: " << s->calculate() << "\n";
	return 0;
}
// END CODE SEGMENT
// **********************************************
