// Given a sorted singly linked list and a data, your task is to insert the data in the linked list in a sorted way i.e. order of the list doesn't change.


class Solution {
    Node sortedInsert(Node head1, int key) {
        if(head1==null){
            head1 = new Node(key);           // Adds the new node as head if list is empty
        }
      
        if(key<=head1.data){        
            Node temp = new Node(key);
            temp.next = head1;              // Adds the new node at the beginning if its smaller than all node values
            head1 = temp;
            return head1;
        }
        
        Node curr = head1.next; 
        Node prev = head1;
      
        while(curr!=null){           
            if(curr.data > key){
                Node temp = new Node(key);
                temp.next = curr;           // Adds the new node in between of the list
                prev.next = temp;
                return head1;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = new Node(key);          // Adds new node at the end if its bigger than all node values
        return head1;
        
    }
}



/*

For Input:
6
10 20 30 40 50 60
5

your output is: 
5 10 20 30 40 50 60 

-------------------

For Input:
6
10 20 30 40 50 60
35

your output is: 
10 20 30 35 40 50 60 

--------------------

For Input:
6
10 20 30 40 50 60
70

your output is: 
10 20 30 40 50 60 70

*/
