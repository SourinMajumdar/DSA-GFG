// You can rework on it and make a menu of operations.


import static java.lang.System.out;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertBeg(int data){
        Node x = new Node(data);

        if(head==null){head= x;}
        else{
            x.next = head;
            head= x;
        }
    }

    public void insertEnd(int data){
        Node x = new Node(data);

        if(head == null) {insertBeg(data);}
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = x;
        }
    }

    public void insertAt(int data, int pos){
        Node x = new Node(data);

        if(head == null) {insertBeg(data);}
        else{
            Node temp = head;
            for(int count=1; count<pos; count++){
                temp = temp.next;
            }
            x.next = temp.next;
            temp.next = x;
        }
    }

    public void deleteFirst(){
        if(head == null) {out.println("List empty !");}
        else{
            head = head.next;
        }
    }

    public void deleteEnd(){
        if(head == null) {out.println("List empty !");}
        else{
            Node secondLast = head;
            while(secondLast.next.next!=null){
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }

    public void deleteAt(int pos){
        if(head == null) {out.println("List empty !");}
        else{
            Node temp = head;
            for(int i=1; i<pos; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display(){
        if(head == null) {out.println("List empty !");}
        else{
            Node n = head;
            while(n.next!=null){
                out.print(n.data + " -> ");
                n = n.next;
            }
            out.print(n.data + "\n");
        }
    }

    public void getSize(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        out.print(count);
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertEnd(5);
        list.insertEnd(2);
        list.insertEnd(3);
        list.display();

        list.insertBeg(1);
        list.insertBeg(8);
        list.insertBeg(8);
        list.display();

        list.insertAt(100,3);
        list.insertAt(69,6);
        list.insertAt(9000,2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteAt(4);
        list.deleteEnd();

        list.display();
        out.print("Size : "); list.getSize();
    }
}


/*

OUTPUT:

5 -> 2 -> 3
8 -> 8 -> 1 -> 5 -> 2 -> 3
8 -> 8 -> 9000 -> 1 -> 100 -> 5 -> 2 -> 69 -> 3
8 -> 9000 -> 1 -> 100 -> 5 -> 2 -> 69 -> 3
8 -> 9000 -> 1 -> 100 -> 2 -> 69
Size : 6

*/
