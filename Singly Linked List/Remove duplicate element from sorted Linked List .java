/*
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.
*/


class GfG
{
    
    Node removeDuplicates(Node head)
    {
	    Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;        
    }
}




/*

For Input:
4
2 2 4 5

your output is: 
2 4 5 


For Input:
5
2 2 2 2 2

your output is: 
2 

*/
