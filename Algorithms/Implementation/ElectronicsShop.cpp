/*
***** Background *****
Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store. The store sells n different brands of keyboards and m different kinds of USB drives. Monica has exactly s dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).

***** Task *****
Given the price lists for the store's keyboards and USB drives, find and print the total amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.
NOTE: She will never buy more than one keyboard and one USB drive even if she has the leftover money to do so.

***** Input Format *****
The first line contains three space-separated integers describing the respective values of s (the amount of money Monica has), n (the number of keyboard brands), and m (the number of USB drive brands).
The second line contains n space-separated integers denoting the prices of each keyboard brand.
The third line contains m space-separated integers denoting the prices of each USB drive brand.

***** Constraints *****
1 <= n, m <= 1000
1  <= s <= 10^6
The price of each item is in the inclusive range [1, 10^6]

***** Output Format *****
Print a single integer denoting the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

*/

#include <cstdio>

int main(){

    int money, key_brands, usb_brands, spend = -1;
    std::scanf("%d %d %d", &money, &key_brands, &usb_brands);

    int key_prices[key_brands];
    int usb_prices[usb_brands];
    for(int i=0; i<key_brands; i++){
        std::scanf(" %d", &key_prices[i]);
    }
    for(int i=0; i<usb_brands; i++){
        std::scanf(" %d", &usb_prices[i]);
    }

    for(int key : key_prices){
        for(int usb : usb_prices){
            if( key + usb > money) continue;
            else if ( key + usb > spend ) spend = key + usb;
        }
    }
    std::printf("%d\n",spend);
    return 0;
}

/*
SAMPLE INPUT 0
10 2 3
3 1
5 2 8

EXPECTED OUTPUT 0
9


SAMPLE INPUT 1
5 1 1
4
5

SAMPLE OUTPUT 1
-1

*/
