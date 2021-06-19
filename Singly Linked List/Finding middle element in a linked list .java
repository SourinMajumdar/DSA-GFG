/*
Given a singly linked list of N nodes. 
The task is to find the middle of the linked list. For example, if given linked list is 1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
*/


class Solution
{
    int getMiddle(Node head)
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        int x=0;
        
        if(head!=null){
            while(fast_ptr!=null && fast_ptr.next!=null){
                slow_ptr = slow_ptr.next;
                fast_ptr = fast_ptr.next.next;
                
            }
            x = slow_ptr.data;
        }
        return x;
    }
}



/*
  
For Input:
5
1 2 3 4 5

your output is: 
3
  
*/
