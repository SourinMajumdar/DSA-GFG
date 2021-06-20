// Given a singly linked list and a key, count the number of occurrences of given key in the linked list.


class Solution
{
    public static int count(Node head, int search_for)
    {
        int count = 0;
        
        while(head!=null){
            if(head.data==search_for){
                count++;
            }
            head=head.next;
        }
        return count;
    
    }
}


/*

For Input:
7
1 2 1 2 1 3 1
1

your output is: 
4

*/
