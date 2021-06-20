// Given a doubly linked list of n elements. The task is to reverse the doubly linked list.


public static Node reverseDLL(Node head)
{
    Node temp1,temp2;
    int count = 0, i=0, t;
    temp2 = head;
    
    while(temp2.next!=null){
        temp2=temp2.next;
        count++;
    }
    temp1 = head;
    while(i<=count/2){
        t = temp1.data;
        temp1.data = temp2.data;
        temp2.data = t;
        temp1 = temp1.next;
        temp2 = temp2.prev;
        i++;
    }
    return head;
}


/*

For Input:
5
10 20 30 40 50

your output is: 
50 40 30 20 10

*/
