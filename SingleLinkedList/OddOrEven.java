package SingleLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class OddOrEven {
    Node head;
    OddOrEven(){
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
    void GroupOddOrEven(){
        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;
        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {  // Even
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {  // Odd
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }

        if (oddHead == null || evenHead == null) {
            return;
        }

        evenTail.next = null; // End of the even list
        oddTail.next = evenHead; // Merge the even list to the end of the odd list

        head = oddHead; 
    }
    public static void main(String[] args) {
         
        OddOrEven list =  new OddOrEven();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1: Insert data");
            System.out.println("2: Display list");
            System.out.println("3. Merge Odd Follows Even ");
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
                    list.GroupOddOrEven();
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
