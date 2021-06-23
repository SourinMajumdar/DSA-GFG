/*
Given a singly linked list, find if the linked list is circular or not. 
A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. 
An empty linked list is considered as circular.
*/

class GfG
{
    boolean isCircular(Node head)
    {
        
        if(head==null) {return true;}    // Empty list is circular
		
		    Node curr = head.next;
		    while(curr!=null && curr!=head){  // traverses till it reaches head or null
		        curr=curr.next;
		    }
      
		    if(curr==null){
		        return false;   // Prints 0
		    }else{
		        return true;    // Prints 1
		    }
    }
}



/*

For Input:
5 1      
1 2 3 4 5

Your output is: 
1

*/
