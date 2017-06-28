/*

Trees_IsThisABinarySearchTree.cpp
Purpose: HackerRank Challenge, Trees: Is this a Binary Search Tree?

Author: Lucas Brown
Version: 1.0 6/27/2017

Some challenges have code provided that is necessary to complete the challenge. Any code provided by HackerRank and not written by Lucas Brown will be identified.

---------------
IMPORTANT NOTE
---------------
This code will NOT compile. This is a code segment - the main function for which this function is written was hidden by HackerRank. I'm including this file for completeness. 


Background
-----------
For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
- The data value of every node in a node's left subtree is less than the data value of that node
- The data value of every node in a node's right subtree is greater than the data value of that node


Task
-----
Given the root node of a binary tree, can you determine if it's also a binary search tree?


Input Format
-------------
You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.


Constraints
------------
0 <= data <= 10^4


Output Format
--------------
You are not responsible for printing any output to stdout. Your function must return true if the tree is a binary search tree; otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.

*/

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node struct is defined as follows:
   struct Node {
      int data;
      Node* left;
      Node* right;
   }
*/
    bool checkBST( Node* root ) {

        bool right, left; 

        if( root == NULL ) { return true; }

        if( root->right == NULL ) { 
            right = true; 
        } else {
            right = root->data < root->right->data;
        }

        if( root->left == NULL ) { 
            left = true; 
        } else {
            left = root->data > root->left->data;
        }

        if( !right || !left ) {
            return false;
        } else {
            return ( checkBST(root->left) && checkBST(root->right) );
        }

    }