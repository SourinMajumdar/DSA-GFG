// Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.



class Solution
{
    Node deleteNode(Node head,int x)
    {
        Node temp=head;
        int i=0;
        while(temp!=null){
            i++; temp=temp.next; 
        }
        
	    if(x==1){
	        head=head.next;
	        head.prev = null;
	        return head;
	    }
	    
	    else if(x>1 && x<i){
	        Node curr = head;
	        int count = 1;
	        while(count!=x-1){
	            curr = curr.next;
	            count++;
	        }
	    
	        curr.next = curr.next.next;
	        curr.next.prev = curr;
	        return head;
	    }
	    
	    else{     // x == i (last element)
	        Node secondLast = head;
            while(secondLast.next.next!=null){
                secondLast=secondLast.next;
            }
            secondLast.next = null;
            return head;
	    }
   }
}




/*

For Input:
5 
1 2 3 4 5
1

your output is: 
2 3 4 5 



For Input:
5 
1 2 3 4 5
3

your output is: 
1 2 4 5 



For Input:
5 
1 2 3 4 5
5

your output is: 
1 2 3 4 

*/
