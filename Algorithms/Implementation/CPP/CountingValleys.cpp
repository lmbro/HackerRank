/*
***** Background *****
Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike, he took exactly n steps. For every step he took, he noted if it was an uphill or a downhill step. Gary's hikes start and end at sea level. We define the following terms:
- Mountain: non-empty sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level
- Valley: non-empty sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.

***** Task *****
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

***** Input Format *****
The first line contains an integer, n, denoting the number of steps in Gary's hike
The second line contains a single string of n characters. Each character is either U or D, where U indicates a step up and D indicates a step down, and the ith character in the string describes Gary's ith step during the hike.

***** Constraints *****
2 <= n <= 10^6

***** Output Format *****
Print a single integer denoting the number of valleys Gary walked through during his hike.

*/

#include <cstdio>

int main(){

    int num_steps, height = 0, num_valley = 0;
    char step;
    bool valley = false;

    std::scanf("%d", &num_steps);
    for(int i=0; i<num_steps; i++){
        std::scanf(" %c", &step);
        if( step == 'U' ){
            height++;
            if ( height == 0 && valley){
                valley = false;
            }
        } else if( step == 'D' ){
            height--;
            if( height < 0 && !valley){ 
                num_valley++;
                valley = true;
            }
        } else {
            std::puts("Error reading input");
        }
    }

    std::printf("%d\n", num_valley);
    return 0;
}
/*
SAMPLE INPUT
8
UDDDUDUU

EXPECTED OUTPUT
1

*/
