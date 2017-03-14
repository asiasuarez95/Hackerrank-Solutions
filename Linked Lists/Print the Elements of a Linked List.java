// Given a pointer to the head node of a linked list, print its elements in order, 
// one element per line. If the head pointer is null (indicating the list is empty), don’t print anything.

/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node head) {
    Node current = head;
    while( current!= null){
        System.out.println(current.data);
        current= current.next;
    }
  
}