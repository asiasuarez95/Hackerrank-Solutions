// You are given the pointer to the head node of a linked list and you need to print all its elements in reverse order
// from tail to head, one element per line. The head pointer may be null meaning that the list is empty - 
// in that case, do not print anything!

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {

    Node node = head;
    //StringBuilder reverse = new StringBuilder();
    String reverse = "";
    while (node != null){
        reverse = node.data + "\n" + reverse;
        // reverse.insert(0,Integer.toString(node.data) +"\n");
        node = node.next;
    }
    System.out.print(reverse);
}