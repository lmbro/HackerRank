#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    double mealCost,tip,tax,totalCost;
    int tipPercent;
    int taxPercent;
    
    cin >> mealCost; cin.ignore();
    cin >> tipPercent; cin.ignore();
    cin >> taxPercent; cin.ignore();
    
    tip = mealCost*tipPercent/100;
    tax = mealCost*taxPercent/100;
    totalCost = mealCost + tip + tax;
    
    cout << "The total meal cost is " << round(totalCost) << " dollars." << endl;
    return 0;
}
