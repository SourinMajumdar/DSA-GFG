// Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

class Solution{
 
    public static int getCount(Node head)
    {
        int count=0;
        if(head==null){count=0;}
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;        
    }
}


/*

For Input:
5
1 2 3 4 5

your output is: 
5

*/
