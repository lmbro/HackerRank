/*
***** Background *****
Two cats named A and B are standing at integral points on the x-axis. Cat A is standing a point x and cat B is standing at point y. Both cats run at the same speed, and they want to catch a mouse named C that's hiding at integral point z on the axis. Can you determine who will catch the mouse?

***** Task *****
You are given q queries in the form of x, y, and z. For each query, print the appropriate answer on a new line:
- If cat A catches the mouse first, print "Cat A"
- If cat B catches the mouse first, print "Cat B"
- If both cats reach the mouse at the same time, print "Mouse C" as the two cats fight and the mouse escapes.

***** Input Format *****
The first line contains a single integer, q, denoting the number of queries.
Each of the q subsequent lines contains three space-separated integers describing the respective values of x (cat A's location), y (Cat B's location), and z (mouse C's location).

***** Constraints *****
1 <= q <= 100
1 <= x,y,z, <= 100

***** Output Format *****
On a new line for each query, print "Cat A" if cat A catches the mouse first, "Cat B" if cat B catches the mouse first, or "Mouse C" if the mouse escapes.

*/

#include <cstdio>
#include <cmath>

int main(){

    short q;
    std::scanf("%hd", &q);

    for(int i=0; i<q; i++){
        short cat_a, cat_b, mouse_c;
        short dis_a, dis_b;
        std::scanf("%hd %hd %hd", &cat_a, &cat_b, &mouse_c);
        dis_a = std::abs(cat_a - mouse_c);
        dis_b = std::abs(cat_b - mouse_c);

        if( dis_a < dis_b ){
            std::puts("Cat A");
        } else if( dis_b < dis_a ){
            std::puts("Cat B");
        } else {
            std::puts("Mouse C");
        }
    }
    return 0;
}
/*
SAMPLE INPUT 0
3
1 2 3
1 3 2
2 1 3

EXPECTED OUTPUT 0
Cat B
Mouse C
Cat A

*/
