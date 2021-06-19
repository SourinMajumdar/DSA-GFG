// Given a singly linked list with N nodes and a number X. The task is to find the node at the given index (X)(1 based index) of linked list. 

class GfG
{
    public static int getNth(Node node, int ind)
    {
        int ele = 0;
        int count = 1;
        while(node!=null){
            if(count == ind){
                ele = node.data;
            }
            count++;
            node = node.next;
            
        }
        return ele;
    }
    
}



/*

For Input:
2

6 5
1 2 3 4 657 76

10 2
8 7 10 8 6 1 20 91 21 2

your output is: 
657
7

*/
