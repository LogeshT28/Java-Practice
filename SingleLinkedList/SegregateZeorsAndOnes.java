package SingleLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SegregateZeorsAndOnes {
    Node head;
    SegregateZeorsAndOnes(){
        this.head = null;
    }

    void insertdata(int data){
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
        }
    }

    void display(){

        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
     void ZerosandOnes() {
        int zero=0,one=0,two=0;

        if(head == null){
            System.out.println("The LinkedList is Empty ");
            return;
        }
        Node temp = head;
        while(temp !=null){
            if(temp.data == 0){
                zero++;
            }
            else if(temp.data == 1){
                one++;
            }
            else{
                two++;
            }
            temp = temp.next;
        }
        temp = head;
        while(zero >0){
            temp.data =0;
            temp=temp.next;
            zero--;
        }
        while(one >0){
            temp.data =1;
            temp=temp.next;
            one--;
        }
        while(two >0){
            temp.data =2;
            temp=temp.next;
            two--;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SegregateZeorsAndOnes list =  new SegregateZeorsAndOnes();
        while (true) {
            System.out.println("1: Insert data");
            System.out.println("2: Display list");
            System.out.println("3.Segregate Zeros And Ones");
            System.out.println("4: Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert:");
                    int data = s.nextInt();
                    list.insertdata(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.ZerosandOnes();
                    break;
                case 4:
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    
}
