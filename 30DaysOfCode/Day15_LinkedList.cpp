/*
***** Background *****
A Node class is provided for you in the editor. A Node object has an integer dta field, data, and a Node instance pointer, next, point to another node (i.e. the next node in a list)
A Node insert function is also declared in your editor. It has two parametesr: a pointer, head, pointing to the first node of a linked list, and an integer data varlue that must be added to the end of the list as a new Node object.

***** Task *****
Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head parameter. Once the new node is added, return the reference to the head node.
NOTE: If the head argument passed to the insert function is null, then the initial list is empty.

***** Input Format *****
The insert function has 2 parameters: a pointer to Node named head, and an integer value, data.
The constructor for Node has 1 parameter: an integer value for the data field.
You do NOT need to read anything from stdin.
*/

// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
#include <iostream>
#include <cstddef>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:
// END CODE SEGMENT
// **********************************************
      Node* insert(Node *head,int data)
      {
          if (head==NULL){
              head = new Node(data);
          } else {
              Node *temp = head;
              while ( temp->next ){
                  temp = temp->next;
              }
              Node *newNode = new Node(data);
              temp->next = newNode;
          }
          return head;
      }
// **********************************************
// START CODE SEGMENT PROVIDED BY HACKERRANK
      void display(Node *head)
      {
          Node *start=head;
          while(start)
          {
              cout<<start->data<<" ";
              start=start->next;
          }
      }
};
int main()
{
	Node* head=NULL;
  	Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }	
	mylist.display(head);
		
}
// END CODE SEGMENT
// **********************************************

/*
SAMPLE INPUT

4
2
3
4
1


SAMPLE OUTPUT

2 3 4 1
*/
