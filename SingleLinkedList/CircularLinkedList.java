package SingleLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){

    }
}
public class CircularLinkedList {
    Node head;
    Node tail;
    CircularLinkedList(){
        this.head = null;
    }
    void insertdata(int data){
        Node newnode = new Node(data);
        if(head == null){
            head  = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
            tail.next = head;
        }
    }
    void display(){

    }
    void inserttosortCLL(int data){
        Node newnode = new Node(data);
        if (head == null)
        {
                head = newnode;
                tail = newnode;
        }
        else
        {
                        Node tptr;
                        Node prev;
                        tptr = head;
                        prev= null;
                        while (( tptr != tail)&&( newnode.data > tptr.data))
                        {      
                                prev = tptr;
                                tptr = tptr.next;
                        }
                        // begin, middle, last
                        if (( prev == null) && ( newnode.data < tptr.data))
                        {
                                newnode.next = head;
                                head = newnode;
                                tail.next = head;
                        }
                        else if (newnode.data > tail.data )
                        {
                                tail.next = newnode;
                                tail = newnode;
                                tail.next = head;
                        }
                        else
                        {
                                newnode.next = tptr;
                                prev.next =  newnode;
                        }
    }
    
}

void Display(){
    Node tptr;
    tptr = head;
    System.out.println();
    do
     {
            System.out.print(tptr.data + "  ");
            tptr = tptr.next;
     }while (tptr!= tail);
     System.out.print(tptr.data + "  ");
}
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int num;
            CircularLinkedList l1 = new CircularLinkedList();
            while ( true)
            {
                    num = inp.nextInt();
                    if ( num == -1)
                            break;
                    l1.inserttosortCLL(num);
            }
            l1.Display();            

    }


}
