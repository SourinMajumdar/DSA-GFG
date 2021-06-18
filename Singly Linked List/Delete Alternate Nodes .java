// Given a Singly Linked List of size N, delete all alternate nodes of the list.

class Solution {
    
    public void deleteAlternate (Node head){
        
        Node curr = head;
        
        while(curr!=null && curr.next!=null){
            curr.next = curr.next.next;
            curr = curr.next;
        }
    }
}

/*

For Input:
6
1 2 3 4 5 6

your output is: 
1 3 5 

*/
