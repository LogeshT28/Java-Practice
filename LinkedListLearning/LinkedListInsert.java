//package LinkedListLearning;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListInsert {
        Node head;
        LinkedListInsert() {
            this.head=null;
        }

     void insertData(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            // newnode.next = head;
            // head = newnode;
        }
    }

    void display(){

        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    void reverse(){
        Node pre=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head = pre;
    }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    LinkedListInsert list =new LinkedListInsert();
        while(true){
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int data = s.nextInt();
                    list.insertData(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    list.reverse();
                    break;
                default:
                    break;
            }
        }

    }


}
