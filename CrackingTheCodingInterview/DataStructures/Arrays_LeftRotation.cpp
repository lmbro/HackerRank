/*
Background
A left rotation operation on an array of size n shifts each of 
the array's elements one unit to the left.
[1,2,3,4,5] -> 2 left rotations -> [3,4,5,1,2]

Task
Given an array of n integers and a number d, perform d left
rotations on the array. Then print the updated array as a 
single line of space-separated integers.

Input Format
The first line contains two space-separated integers denoting
n and d, respectively.
The second line contains n space-separated integers describing
the respective elements of the array's initial state.

Constraints
1 <= n <= 10^5
1 <= d <= n
1 <= array[i] <= 10^6
*/

#include <iostream>

using namespace std;

int main(){
    // Gather setup information (n and d as described above)
    int n,d;
    cin >> n >> d;
    
    // Set up initial array from input
    int arr[n],arr_rot[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    
    // Rotate array d times and output
    for(int i=0; i<n; i++){;
        (i+d<n) ? arr_rot[i]=arr[i+d] : arr_rot[i]=arr[i-(n-d)];
        cout << arr_rot[i] << " ";
    }
    cout << endl;
}
