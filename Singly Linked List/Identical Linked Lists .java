// Given two Singly Linked List of N and M nodes respectively. The task is to check whether two linked lists are identical or not. 
// Two Linked Lists are identical when they have same data and with same arrangement too.

class Solution {
    
    public boolean isIdentical (Node head1, Node head2){
        
        if(head1==null && head2==null) {return true;}
        
        else if(head1.data==head2.data) {return isIdentical(head1.next,head2.next);}  // Recursive function
        
        else {return false;}
    }
}


/*

For Input:
6
1 2 3 4 5 6

4
99 59 42 20

your output is: 
Not identical

*/
