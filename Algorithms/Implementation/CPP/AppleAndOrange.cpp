/*
***** Background *****

Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Sam's house starts at point s and ends at point t along the x-axis. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point a and the orange tree is at point b.

When a fruit falls from it's tree, it lands d units of distance from its tree of origin along the x-axis. A negative value of d means the fruit fell d units to the tree's left, and a positive value of d means it fell d units to the tree's right.


***** Task *****

Given the value of d for m apples and n oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., inclusive range [s,t]. Print the number of pples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of input.


***** Input Format *****

The first line contains two space-separated integers denoting the respect values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
THe third line contains two space-separated integers dentoning the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distance that each apple falls from point a.
The fifth line contains n space-separated integers denoting the respective distanes that each orange falls from point b.


***** Constraints *****

1 <= s,t,a,b,m,n <= 10^5
-10^5 <= d <= 10^5
a < s < t < b
*/

#include <iostream>


int main(){
    std::ios_base::sync_with_stdio(false);
    
    int house_start,house_end;
    int apple_tree,orange_tree;
    int num_apples,num_oranges;
    int distance,position;
    int apple_count = 0;
    int orange_count = 0;

    std::cin >> house_start;
    std::cin >> house_end;
    std::cin >> apple_tree;
    std::cin >> orange_tree;
    std::cin >> num_apples;
    std::cin >> num_oranges;
    
    for(int i=0; i<num_apples; i++){
        std::cin >> distance;
        position=apple_tree+distance;
        if(position>=house_start && position<=house_end) apple_count++;
    }
    for(int i=0; i<num_oranges; i++){
        std::cin >> distance;
        position=orange_tree+distance;
        if(position>=house_start && position<=house_end) orange_count++;
    }
    
    std::cout << apple_count << "\n" << orange_count << std::endl;
    return 0;
}

/*
SAMPLE INPUT
7 11
5 15
3 2
-2 2 1
5 -6

EXPECTED OUTPUT
1
1

*/