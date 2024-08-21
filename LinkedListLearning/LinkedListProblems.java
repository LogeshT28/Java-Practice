import java.util.HashSet;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListProblems {
    Node head;
    LinkedListProblems(){
        this.head = null;
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
        System.out.println();

    }
    void count(){
        Node temp = head;
        int count=1;
        while(temp !=null){
            temp = temp.next;
            count++;
        }

        System.out.println("Nodes in LinkedList "+count);
    }
    void SumOfNodes(){
        Node temp = head;
        int sum=0;
        while(temp !=null){
            sum +=temp.data;
            temp = temp.next;
        }
        System.out.println("Sum Of All Elements in LinkedList :"+sum);
    }

    void FindMaximumInNodes(){
        Node temp = head;
        int max=0;
        while(temp !=null){
            max = Math.max(temp.data,max);
            temp = temp.next;
        }
        System.out.println("Maximum Element in LinkedList :"+max);
    }
    void Search(int target){
        Node temp =head;
        int pos=1;
        while(temp !=null){
            if(temp.data == target){
                System.out.println("The Target was Occured "+pos);
                return;
            }
            pos++;
            temp = temp.next;
        }
        System.out.println("The Target Not Found");
    }
    void insertSorted(int data){
        Node newnode = new Node(data);
        if( head== null || head.data >= newnode.data){
            newnode.next = head;
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next !=null && temp.next.data < newnode.data){
                    temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public boolean isSorted(){
        Node temp = head;
        while(temp.next !=null){
            if(temp.data > temp.next.data){
                return false;
            }
            temp  = temp.next;
        }
        return true;
    }
    
    void removeDuplicate(){
        if(head == null){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node pre = null;
        while(temp !=null){
            if(set.contains(temp.data)){
                pre.next = temp.next;
            }
            else{
                set.add(temp.data);
                pre = temp;
            }
            temp = temp.next;
        }
    }
    void removeduplicateSortedLL() {
        if (head == null) {
            return; // Empty list, nothing to remove
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Duplicate found, remove it
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedListProblems list = new LinkedListProblems();
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Enter your choice:");
            System.out.println("1 - Add a number to the linked list");
            System.out.println("2 - Display the linked list");
            System.out.println("3 - Count the number of elements in the linked list");
            System.out.println("4 - Sum Of all Elements in LinkedList");
            System.out.println("5 - Find Maximum Element in LinkedList");
            System.out.println("6 - Search Elements in LinkedList");
            System.out.println("7 - Insert data Sorted in LinkedList");
            System.out.println("8 - Chech the LinkedList is Sorted Or Not");
            System.out.println("9 - Remove duplicates from Linked List");
            System.out.println("10 - Remove duplicates from Linked List if Sorted Array");
            System.out.println("11: Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add to the linked list: ");
                    int data = s.nextInt();
                    list.insertData(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                     list.count();
                    break;
                    
                case 4:
                    list.SumOfNodes();
                    break;
                case 5:
                    list.FindMaximumInNodes();
                    break;
                case 6:
                    int target = s.nextInt();
                    list.Search(target);
                    break;
                case 7:
                      System.out.print("Enter a number to add to the linked list: ");
                      int d = s.nextInt();
                      list.insertSorted(d);
                      break;
                case 8:
                    if(list.isSorted()){
                        System.out.println("The LinkedList is Sorted");
                    }
                    else{
                        System.out.println("The LinkedList is Not Sorted");
                    }
                case 9:
                    list.removeDuplicate();
                    break;
                case 10:
                System.exit(0);
                break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
    }
}
