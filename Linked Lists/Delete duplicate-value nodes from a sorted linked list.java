// You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. 
// Delete as few nodes as possible so that the list does not contain any value more than once. 
// The given head pointer may be null indicating that the list is empty.


/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {

    Node rNode = head;
    if(head == null){
        return head;
    }
    else{
            while(head.next != null){
                if(head.data == head.next.data){
                    head.next = head.next.next;
                }
                else{
                    head = head.next;
                }
            }
        }
    return rNode;
}
