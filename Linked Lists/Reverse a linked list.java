// You’re given the pointer to the head node of a linked list. 
// Change the next pointers of the nodes so that their order is reversed. 
// The head pointer given may be null meaning that the initial list is empty.

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    
    //if the linked list is null there is no need to reverse
    if(head == null){
        return head;
    }
    
//    create a null node to end the list
    Node node = null;
    while(head!= null){
        Node end = node;
        node = new Node();
        node.data = head.data;
        node.next = end;
        head = head.next;
    }
    return node;

}