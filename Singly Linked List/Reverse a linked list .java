// Given a linked list of N nodes. The task is to reverse this list.

class Solution
{
    Node reverseList(Node head){
        
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
      
    }
}


/*

For Input:
6
1 2 3 4 5 6

your output is: 
6 5 4 3 2 1 

*/
