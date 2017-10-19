/*
***** Background *****
Lily has a chocolate bar consisting of a row of n squares where each square has an integer written on it. She wants to share it with Ron for his birthday, which falls on month m and day d. Lilly only wants to give Ron a piece of chocolate if it contains m consecutive squres whose integers sum to d.

***** Task *****
Given m, d, and the sequences of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocoloate to give to Ron?

***** Input Format *****
The first line contains an integer dentoing n (the number of squares in the chocolate bar).
The second line contains n space-separated integers describing the respective values of s0, s1, ... , sn-1 (the numbers written on each consecutive square of chocolate
The third line contains two space-separated integers desccibing the respective values of d (Ront's birth day) and m (Ron's birth month).

***** Constraints *****
1 <= n <= 100
1 <= si <= 5
1 <= d < = 31
1 <= m <= 12

*/

#include <iostream>

int main(){
    
    short n, m, d;
    std::cin >> n;

    short s[n];
    for(int i=0; i<n; i++){
        std::cin >> s[i];
    }
    std::cin >> d >> m;

    short sum=0;
    short pieces=0;
    for(int i=0; i < n; i++){
        sum += s[i];
        if( i < m-1 ) continue;
        if( sum == d) pieces++;
        //std::cout << i << " " << sum << std::endl;
        sum -= s[i-m+1];
    }

    std::cout << pieces << std::endl;
    return 0;
}
/*
SAMPLE INPUT
5
1 2 1 3 2
3 2

EXPECTED OUTPUT
2

*/
