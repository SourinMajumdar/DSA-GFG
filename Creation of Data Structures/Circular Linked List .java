import static java.lang.System.out;
public class CircularLL {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertPos(int data, int pos){
        Node x = new Node(data);
        Node curr = head;
        int count = 0;
        do{
            count++;
            curr=curr.next;
        }while(curr!=head);

        if(pos==1 || pos==count+1){
            x.next=head;
            head=x;
            tail.next = x;
        }else{
            Node temp = head;
            int i = 1;
            while(i==pos-1){
                temp=temp.next; i++;
            }
            x.next=temp.next;
            temp.next=x;
        }
    }

    public void display(){
        Node curr =head;
        if(head==null){out.println("List Empty !");}
        else{
            do{
                out.print(curr.data + "  ");
                curr = curr.next;
            }while(curr!=head);
        }out.println();
    }



    public static void main(String[] args){
        CircularLL list = new CircularLL();

        list.insert(1);
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(25);
        list.insert(30);
        list.display();
        list.insertPos(69,2);
        list.insertPos(700,5);
        list.insertPos(900,6);
        list.display();
    }
}
