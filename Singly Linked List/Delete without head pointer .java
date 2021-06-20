/*
You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. 
The task is to delete the node. Pointer/ reference to head node is not given. 
Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail node in the linked list.
*/


class Solution
{
    void deleteNode(Node del)
    {
        
        del.data = del.next.data;
        del.next = del.next.next;
        
    }
}



/*
  
For Input:
6
1 2 3 4 5 6
5

your output is: 
1 2 3 4 6 
  
*/
