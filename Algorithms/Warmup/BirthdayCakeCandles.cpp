/*
Background
Colleen is turning n years old. She has n candles of various heights on her cake, and candle i has height height_i. Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Task
Given the height_i for each indvidual candle, find and print the number of candles she can successfully blow out.

Input Format
The first line contains a single integer, n, denoting the number of candles on the cake.
The second line contains n space-separated integers, where each integer i describes the height of candle i.

Constraints
1 <= n <= 10^5
1 <= height_i <= 10^7
*/

#include <iostream>

int main(){
    int n,h;
    int h_max=0;
    int h_max_count=0;

    std::cin >> n;
    for(int i=0; i<n; i++){
        std::cin >> h;
        if(h > h_max){
            h_max = h;
            h_max_count = 1;
        }else if(h == h_max){
            h_max_count += 1;
        }
    }
    std::cout << h_max_count << std::endl;
    return 0;
}

