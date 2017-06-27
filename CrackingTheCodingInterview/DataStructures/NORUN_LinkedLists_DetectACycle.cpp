/*

---------------
IMPORTANT NOTE
---------------
This code will NOT compile. This is a code segment - the main function for which this function is written was hidden by HackerRank. I'm including this file for completeness. 

-----------
Background 
-----------
A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

-----
Task
-----
Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named head that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
NOTE: If the list is empty, head will be null

-------------
Input Format
-------------
Our hidden code checker passes the appropriate argument to your function. You are not responsible for readying any input from stdin.

------------
Constraints
------------
0 <= List size <= 100

--------------
Output Format
--------------
If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. The binary integer corresponding to the boolean value returned by your function is printed by stdout by our hidden code checker.

*/

#include <cstdio>

/*
Detect a cycle in a linked list. Note that the head pointer may be 'NULL' if the list is empty.

A Node is defined as: 
    struct Node {
        int data;
        struct Node* next;
    }
*/

bool has_cycle(Node* head) {
    
    if( head == NULL ) { return false; }

    // Implementation of Floyd's cycle-finding algorithm
    Node* tortoise = head;
    Node* hare = head->next;

    if( tortoise == NULL || hare == NULL ) { return false; }

    while( tortoise != hare ) {

        if( tortoise->next == NULL ) { return false; }
        if( hare->next == NULL || hare->next->next == NULL ){ return false; }

        tortoise = tortoise->next;
        hare = hare->next->next;

    }

    return true;
}

int main() {

    std::puts( "This is not meant to be compiled and run. This is a code segment - the main function for which this function is written was hidden by HackerRank and not included in this file. I'm including it any for completeness." );
    return 0;
}