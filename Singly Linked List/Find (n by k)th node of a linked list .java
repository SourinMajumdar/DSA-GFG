/*
Given a singly linked list and a number k. Write a function to find the (N/k)th element, where N is the number of elements in the list. 
We need to consider ceil value in case of decimals.
*/

class GfG
{
  
    public static int nknode(Node head, int k){
      
       Node slow = head, fast = head;
       int c = 0;
       while(fast.next!=null){
           fast = fast.next; 
           c++;
         
           if(c%k==0){
               slow = slow.next; 
           }
       }
       return slow.data;
    }
}


/*

For Input:
2

4
52 55 100 33 
1

15
88 57 44 92 28 66 60 37 33 52 38 29 76 8 75 
2

your output is: 
33
37

*/
