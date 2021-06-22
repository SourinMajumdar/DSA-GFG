// Given a linked list of strings having n nodes check to see whether the combined string formed is palindrome or not. 


class GfG
{
    public static boolean compute(Node node)
    {
        String s ="";
        Node curr = node;
        while(curr!=null){
            s+=curr.data;
            curr=curr.next;
        }
        
        int i = 0, j = s.length() - 1;
 
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)){
                return false;}
 
            i++;j--;
        }
 
        return true;
    }
}


/*

For Input:
2

4
b eeee b b 

3
fffff eeee b

your output is: 
False
False

*/
