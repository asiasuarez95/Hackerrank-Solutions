// You’re given the pointer to the head nodes of two linked lists. 
// Compare the data in the nodes of the linked lists to check if they are equal. 
// The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. 
// Either head pointer given may be null meaning that the corresponding list is empty.

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {


    if(headA == null && headB == null){
        return 1;
    }
    while(headA.data == headB.data){
        if(headA.next == null){
            if(headB.next == null){
                return 1;
            }
            else{
                return 0;
            }
        }
        headA = headA.next;
        headB = headB.next;
    }
  return 0;
}
