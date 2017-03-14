// You’re given the pointer to the head nodes of two sorted linked lists. 
// The data in both lists will be sorted in ascending order. 
// Change the next pointers to obtain a single, merged linked list which also has data in ascending order. 
// Either head pointer given may be null meaning that the corresponding list is empty.

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    
    if(headA == null){
        return headB;
    }
    if(headB == null){
        return headA;
    }
    
    if(headA.data < headB.data){
        headA.next = MergeLists(headA.next, headB);
        return headA;
    }
    else{
        headB.next = MergeLists(headA, headB.next);
        return headB;
    }
    

}