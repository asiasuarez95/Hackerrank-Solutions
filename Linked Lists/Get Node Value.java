// You’re given the pointer to the head node of a linked list and a specific position. 
// Counting backwards from the tail node of the linked list, get the value of the node at the given position. 
// A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int count =0;
    Node temp = head;
    while (temp.next != null){
        count ++; 
        temp = temp.next;
    }
    int pos = count - n;
    
    while(pos -- >0){
        head = head.next;
    }
    
    return head.data;
}