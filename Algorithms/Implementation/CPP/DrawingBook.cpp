/*
***** Background *****
Brie's Drawing teacher asks her class to open their n-page book to page number p. Brie can either start turning pages from the front of the book (i.e., page number 1) or from the back of the book (i.e., page number n), and she always turns pages one-by-one (as opposed to skipping through multiple pages at once). When she opens the book, page 1 is always on the right side. Each page in the book has two sides, front and back, except for the last page which may only have a front side depending on the total number of pages of the book.

***** Task *****
Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.

***** Input Format *****
The first line contains an integer, n, denoting the number of pages in the book.
The second line contains an integer, p, denoting the page that Brie's teacher wants her to turn to.

***** Constraints *****
1 <= n <= 10^5
1 <= p <= n

***** Output Format *****
Print an integer denoting the minimum number of pages Brie must turn to get to page p.
*/

#include <cstdio>

int pagesToTurn(int p);
int pagesToTurn(int p, int n);

int main(){
    
    int num_pages, page_number;
    std::scanf("%d\n%d", &num_pages, &page_number);
    
    int front = pagesToTurn(page_number);
    int back = pagesToTurn(page_number, num_pages);
    
    ( front < back ) ? std::printf("%d\n",front) : std::printf("%d\n",back);
    //std::printf("%d %d\n", front, back);
    return 0;
}
/* 
turn[i=0] = _ 1 = 2i 2i+1
turn[i=1] = 2 3 = 2i 2i+1
turn[i=2] = 4 5 = 2i 2i+1
turn[i=3] = 6 7 = 2i 2i+1
turn[i=4] = 8 9 = 2i 2i+1
*/
int pagesToTurn(int p){
    int turn = 0;
    while( (2*turn+1) < p ){
        turn++;
    }
    return turn;
}
/*
turn[i=0] = 8 9 = n  (n+1)? = n - (2i)
turn[i=1] = 6 7 = n-2 n-1 = n-(2i) n-(2i-1)
turn[i=2] = 4 5 = n-4 n-3 = n-(2i) n-(2i-1)
turn[i=3] = 2 3 = n-6 n-5 = n-(2i) n-(2i-1)
turn[i=4] = _ 1 = n-n n-7 = n-(21) n-(2i-1)
*/
int pagesToTurn(int p, int n){
    int turn = 0; 
    if( (n % 2) != 0 ) n--;  
    while( n-(2*turn) > p ){
        turn++;
    }
    return turn;
}
/*
SAMPLE INPUT 0
6
2

EXPECTED OUTPUT 0
1


SAMPLE INPUT 1
5
4

EXPECTED OUTPUT 1
0

*/

