// Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. 
// When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.


// 1st method - two lopps (Time Complexity: O(n^2))
class Solution
{
    public Node removeDuplicates(Node head) 
    {
        Node p1 = head, p2 =null;
        
        while(p1!=null && p1.next!=null){
            p2 = p1;
            while(p2.next!=null){
                if(p1.data==p2.next.data){
                    p2.next = p2.next.next;
                }else{
                    p2 = p2.next;
                }
            }
            p1 = p1.next;
        }
        return head;
        
    }
}

// There are more metthods with lesser time complexities



/*

For Input:
7
5 2 2 4 4 7 2

your output is: 
5 2 4 7 

*/
