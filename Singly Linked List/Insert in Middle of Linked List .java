// Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.

class Solution {
    
    public Node insertInMid(Node head, int data){
        
        Node slow = head, fast = head.next;
        Node x = new Node(data);
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        x.next = slow.next;
        slow.next = x;
        
        return head;
    }
}


/*

For Input:
3
1 2 4
3

your output is: 
1 2 3 4 

*/
