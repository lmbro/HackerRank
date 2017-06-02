 /*
 Background
 Alice and Bob each created one problem for HackerRank. A reviewer rates the two challengs, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficult.

 Task
 We define the ratting for Alice's challenge to be the triplet A and the rating for Bob's challenge to be the triplet B.

 Find their comparison points by comparing a0 with b0, a1 with b1, and a2 with b2. 
 If a>b, Alice is awarded a point
 If b>a, Bob is awarded a point
 if a=b, neither are awarded a point

 Input Format
 The first line contains 3 space-separated integers describin A
 The second line contains 3 space-separated integers describing B

 Constraints
 1 <= a <= 100
 1 <= b <= 100
 */

#include <iostream>

int main(){
    int alice[3];
    int bob[3];
    int alice_score=0;
    int bob_score=0;
    std::cin >> alice[0]>> alice[1] >> alice[2];
    std::cin >> bob[0] >> bob[1] >> bob[2];
    for(int i=0; i<3; i++){
        if(alice[i]>bob[i]) alice_score++;
        if(bob[i]>alice[i]) bob_score++;
    }
    std::cout << alice_score << " " << bob_score << std::endl;
    return 0;
}