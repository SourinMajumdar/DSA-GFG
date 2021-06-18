// You can rework on it and make a menu of operations.

import static java.lang.System.out;

public class DoublyLinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }


    public void insertBeg(int data) {
        Node x = new Node(data);
        if(head==null){
            head=x; x.prev=null;}
        else{
            x.next = head;
            head.prev = x;
            head = x;
            x.prev = null;
        }
    }

    public void insertEnd(int data){
        Node x = new Node(data);
        Node curr = head;
        if(head==null){insertBeg(data);}
        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = x;
            x.prev = curr;
            x.next = null;
        }
    }



    public void insertAt(int data, int pos){
        Node x = new Node(data);
        Node curr = head;
        int count=1;
        if(head==null){insertBeg(data);}
        else {
            while (count != pos - 1) {
                curr = curr.next;
                count++;
            }
            x.next = curr.next;
            curr.next.prev = x;
            curr.next = x;
            x.prev = curr;
        }
    }

    public void deleteFirst(){
        if(head == null) {out.println("List empty !");}
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteEnd(){
        if(head == null) {out.println("List empty !");}
        else{
            Node secondLast = head;
            while(secondLast.next.next!=null){
                secondLast=secondLast.next;
            }
            secondLast.next = null;
        }
    }

    public void deleteAt(int pos){
        Node curr = head;
        int count = 1;
        if(head == null) {out.println("List empty !");}
        else{
            while(count!=pos-1){
                curr = curr.next;
                count++;
            }
            curr.next = curr.next.next;
            curr.next.prev = curr;
        }
    }

    public void display(){
        if(head == null) {out.println("List empty !");}
        else{
            Node n = head;
            while(n.next!=null){
                out.print(n.data + " <-> ");
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
        DoublyLinkedList list = new DoublyLinkedList();

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

5 <-> 2 <-> 3
8 <-> 8 <-> 1 <-> 5 <-> 2 <-> 3
8 <-> 9000 <-> 8 <-> 100 <-> 1 <-> 5 <-> 69 <-> 2 <-> 3
9000 <-> 8 <-> 100 <-> 1 <-> 5 <-> 69 <-> 2 <-> 3
9000 <-> 8 <-> 100 <-> 5 <-> 69 <-> 2
Size : 6

*/
