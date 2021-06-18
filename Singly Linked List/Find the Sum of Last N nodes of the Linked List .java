// Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(), which should return the sum of last N nodes of the linked list.


class Solution {
    
    public int sum(Node head, int k){
        Node temp = head;
        int len = 0, sum = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        for(int i=0; i<len-k; i++){
            head = head.next;
        }
        
        while(head!=null){
            sum+=head.data;
            head=head.next;
        }
        
        return sum;
    }
}


/* 

For Input:
2
10 5
1 23 45 67 89 10 11 12 13 14
6 3
5 9 6 3 4 10

your output is: 
60
17 

*/
