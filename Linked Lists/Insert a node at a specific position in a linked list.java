// You’re given the pointer to the head node of a linked list, an integer to add to the list 
// and the position at which the integer must be inserted. Create a new node with the given integer, 
// insert this node at the desired position and return the head node. A position of 0 indicates head, 
// a position of 1 indicates one node away from the head and so on. The head pointer given may be null 
// meaning that the initial list is empty.


/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    if (position ==0){
        Node current = new Node();
        current.data = data;
        current.next = head;
        return current;
    }
    else{
        Node current = head;
        while(--position > 0){
            current = current.next;
     }
        Node x = current.next;
        current.next = new Node();
        current. next.data = data;
        current.next.next = x; 
        return head;
    }
    
    
    
}