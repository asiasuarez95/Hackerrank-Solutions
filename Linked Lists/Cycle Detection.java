// A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
// Complete the function provided for you in your editor. 
// It has one parameter: a pointer to a Node object named that points to the head of a linked list. 
// Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, 
// return true; otherwise, return false.

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    if(head == null){
        return false;
    }
    else{
        Node node = head;
        Node compNode = head; 
        
        while(node != null && compNode.next !=null){
            node = node.next;
            compNode = compNode.next.next; 
            
            if(node == null || compNode == null ){
                return false;
            }
            if(node == compNode){
                return true;
            }
        }
    }
 return false;
}
