/*
Task
Consider an n-element array, a, where each index in the array contains a reference to an array of ki integers (where the value of ki varies from array to array).

Given a, you must answer q queries. Each query is in the format i j, where i denotes an index in array a and j denotes an index in the array located at a[i]. For each query, find and print the value of element j in the array at location a[i] on a new line.

Input Format
The first line contains two space-separated integers donting the respective values of n (the number of variable-length arrays) and q (the number of queries)
Each line i of the n subsequent lines contains a space-separated sequence describing the k-element array located at a[i] (k a[0] a[1] a[2] ... a[k-1]).
Each of the q subsequent lines contains two space-separated integers describing the respective values of i (an index in array) and j (an index in the array reference by a[i]) for a query
*/

#include <iostream>
#include <vector>

int main(){
    std::ios::sync_with_stdio(false);

    int n,q,k;
    std::vector< std::vector<int> > vect;
    
    std::cin >> n >> q;
    int q_i[q];
    int q_j[q];
    
    // Loop over the n arrays
    for(int i=0; i<n; i++){
        // Loop over the ith array (size k)
        std::cin >> k;
        for(int k_i=0; k_i<k; k_i++){
            std::cin >> vect[i][k_i];
        }
    }
    // Loop over q queries
    for(int i=0; i<q; i++){
        std::cin >> q_i[i] >> q_j[i];
    }
    // Separate Input/Output
    for(int i=0; i<q; i++){
        std::cout << vect[q_i[i]][q_j[i]] << "\n";
    }
    std::cout << std::endl;
    return 0;
}