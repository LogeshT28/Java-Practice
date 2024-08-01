package LinkedListLearning;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
class MiddleLinkedList{
    Node head;
    MiddleLinkedList(){
        this.head = null;
    }

    void insertData(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=newnode;
        }
    }

    void display(){
        if(head==null){
            System.out.println("The list is empty.");

        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void FindMiddleNode(){
        if (head == null) {
            System.out.println("The list is empty.");
            return; 
        }
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            System.out.println("The middle node is: " + slow.data);
            slow=slow.next;
        }
        //System.out.println("The middle node is: " + slow.data);
    }

    void middleNode(){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        int count=0;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        temp=head;
        int res= count/2;
        while(res > 0){
            temp = temp.next;
            res--;
        }
        while(temp!=null){
            System.out.println("The middle node is: " + temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        MiddleLinkedList list = new MiddleLinkedList();
        while (true) {
            System.out.println("1: Insert Data");
            System.out.println("2: Display List");
            System.out.println("3:To show Middile Node ");
            System.out.println("4 :to Achieve Another Aproch");
            System.out.println("5: Exit");
            int choice = s.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = s.nextInt();
                    list.insertData(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.FindMiddleNode();
                    break;
                case 4:
                    list.middleNode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}