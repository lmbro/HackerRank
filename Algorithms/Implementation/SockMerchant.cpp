/*
***** Background *****
John's clothing store has a pile of n loose socks where each sock i is labeled with an integer, c[i], denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, i and j, are a single matching pair if c[i] = c[j].

***** Task *****
Given n and the color of each sock, how many pairs of socks can John sell?

***** Input Fomrat *****
The first line contains an integer, n, denoting the number of socks.
The second line contains n space-separated integers describing the respective values of c[0], c[1], c[2], ... , c[n-1]

***** Constraints *****
1 <= n <= 100
1 <= c[i] <= 100

***** Output Formt *****
Print the total number of matching pairs of socks that John can sell

*/

#include <cstdio>
#include <map>

#include <iostream>

int main(){

    short n, c, pairs = 0;
    std::scanf("%hd", &n);
    std::map<short, short> sock_count;

    for(int i=0; i<n; i++){
        std::scanf("%hd", &c);
        sock_count[c]++;
    }

    for(std::map<short,short>::iterator it=sock_count.begin(); it != sock_count.end(); it++){
        pairs += (it->second)/2;
        //std::printf("Key: %hd, Value: %hd, Pairs: %hd\n", it->first, it->second, pairs);       
    }
    std::printf("%hd\n",pairs);
    return 0;
}
        

/*
SAMPLE INPUT
9
10 20 20 10 10 30 50 10 20

SAMPLE OUTPUT
3
*/
