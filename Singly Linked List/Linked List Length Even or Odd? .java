/*
Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd() 
which contains head of the linked list and check whether the length of linked list is even or odd.
*/

class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    while (head1 != null && head1.next != null)
    {
        head1 = head1.next.next;
    }
    if (head1 == null)
        return 0;
    else
        return 1;
	    
	}
}


/*

For Input:
2

6
991 20 1000 19 1001 1

5
36 10 40 5 50

your output is: 
Even
Odd

*/
