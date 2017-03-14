// You’re given the pointer to the head node of a linked list and an integer to add to the list. 
// Create a new node with the given integer, insert this node at the head of the linked list and return the new head node. 
// The head pointer given may be null meaning that the initial list is empty.

/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node current = new Node();
    current.data = x;
    current.next = head;
    return current;
    
}