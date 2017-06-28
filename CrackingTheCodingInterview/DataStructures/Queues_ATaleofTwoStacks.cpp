/*

Queues_ATaleofTwoStacks.cpp
Purpose: HackerRank Challenge, Queues: A Tale of Two Stacks

Author: Lucas Brown
Version: 1.0 6/27/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.


Background
-----------
A basic queue has the following operations:
Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.


Task
-----
In this challenge, you must first implement a queue using two stacks. Then process q queries, where each query is one of the following 3 types:

1. "1 x" - Enqueue element x into the end of the queue.
2. "2" - Dequeue the element at the front of the queue.
3. "3" - Print the element at the front of the queue.


Input Format
-------------
The first line contains a single integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains a single query in the form described in the problem statement above. 
    All three queries start with an integer denoting the query type, but only query 1 is followed by an additional space-separated value, x, denoting the value to be enqueued.


Constraints
------------
1 <= q <= 10^5
1 <= type <= 3
1 <= abs(x) <= 10^9
It is guaranteed that a valid answer always exists for each query of type 3


Output Format
--------------
For each query of type 3, print the value of the element at the front of the queue on a new line.


Sample Input
-------------
10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2


Sample Output
-------------
14
14

*/

#include <vector>
#include <iostream>
#include <stack>

using namespace std;

/* --------------------------------------------------------------
        BEGIN (1/2): Code provided by HackerRank               */
class MyQueue {
  
    public:
        stack<int> stack_newest_on_top, stack_oldest_on_top;   
        void push(int x);
        void pop();
        int front();
};
/*      END (1/2): Code provided by HackerRank
-------------------------------------------------------------- */

void MyQueue::push( int x ) {

    stack_newest_on_top.push( x );
}

void MyQueue::pop() {

    this->front();
    stack_oldest_on_top.pop();
}

int MyQueue::front() {

    if( stack_oldest_on_top.empty() ){
        while( !stack_newest_on_top.empty() ) {
            stack_oldest_on_top.push( stack_newest_on_top.top() );
            stack_newest_on_top.pop();
        }
    }
    return stack_oldest_on_top.top();
}

/* --------------------------------------------------------------
        BEGIN (2/2): Code provided by HackerRank               */
int main() {
    MyQueue q1;
    int q, type, x;
    cin >> q;
    
    for(int i = 0; i < q; i++) {
        cin >> type;
        if(type == 1) {
            cin >> x;
            q1.push(x);
        }
        else if(type == 2) {
            q1.pop();
        }
        else cout << q1.front() << endl;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
/*      END (2/2): Code provided by HackerRank
-------------------------------------------------------------- */

