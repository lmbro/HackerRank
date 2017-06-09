/*
***** Background *****
Ann and Brian order n items at a restaurant, but Anna declines to eat any of the kth item (where 0 <= k < n) due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have fogotten that they didn't split the kth item and accidentally charged Anna for it.

***** Task *****
You are given n, k, the cost of each of the n items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print "Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.

***** Input Format *****
The first line contains two space-separated integers denoting the respective values of n (the number of items ordered) and k (the 0-based index of the item that Anna did not eat).
The second line contains n space-separated integers where each integer i denots the cost, c[i], for item i (where 0 <= i < n)
The third line contains an integer, b_charged, denoting that amount of money that Brian charged Anny for her share of the bill.

***** Constraints *****
2 <= n <= 10^5
0 <= k < n
0 <= c[i] <= 10^4
0 <= b <= sum(c[i])

***** Output Format
If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e. b_charged - b_actual) that Brian must refund to Anna (it is guaranteed that this will always be an integer).
*/

#include <cstdio>

int main(){

    int n, k, c, b_charged, b_actual = 0; // Guaranteed to be integers by problem statement
    std::scanf("%d %d", &n, &k);

    for(int i=0; i<n; i++){
        std::scanf("%d", &c);
        if( i == k ) continue;
        b_actual += c;
    }
    b_actual /= 2;
    
    std::scanf("%d", &b_charged);
    if ( b_charged == b_actual ){
        std::printf("Bon Appetit");
    } else {
        std::printf("%d\n", b_charged-b_actual);
    }

    return 0;
}

/*
SAMPLE INPUT
4 1 
3 10 2 9
12

EXPECTED OUTPUT
5


SAMPLE INPUT
4 1
3 10 2 9
7

EXPECTED OUTPUT
Bon Appetit
*/
