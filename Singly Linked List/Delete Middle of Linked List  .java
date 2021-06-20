/*
Given a singly linked list, delete middle of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
If the input linked list is NULL or has 1 node, then it should return NULL.
*/



class Solution {
    Node deleteMid(Node head) {
        Node fast_ptr = head, slow_ptr = head;
        if(head==null || head.next==null){return null;}
        else{
            while(fast_ptr!=null && fast_ptr.next!=null){
                slow_ptr = slow_ptr.next;
                fast_ptr = fast_ptr.next.next;
            }
            
        }
        
        Node curr = head;
        while(curr.next!=slow_ptr){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}


/*

For Input:
6
1 2 3 4 5 6

your output is: 
1 2 3 5 6


For Input:
5
1 2 3 4 5

your output is: 
1 2 4 5 

/*
