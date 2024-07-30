package LinkedListLearning;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeDuplicate {
    Node head;

    removeDuplicate() {
        this.head = null;
    }

    void insertData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void removeDup() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    void removeNotConsicuitiveElement(){
        Node temp = head;
        Node pre = null;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        while(temp !=null){
            if(set.contains(temp.data)){
                pre.next = temp.next;
            }
            else{
                set.add(temp.data);
                pre =temp;
            }
            temp = temp.next;
        }
    }
    void removeAllDuplicates() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        // First pass: count occurrences of each value
        Map<Integer, Integer> countMap = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            countMap.put(temp.data, countMap.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }

        // Second pass: create new list with only unique elements
        Node dummy = new Node(0); // dummy node to simplify handling of the head
        Node newList = dummy;
        temp = head;
        while (temp != null) {
            if (countMap.get(temp.data) == 1) {
                newList.next = new Node(temp.data);
                newList = newList.next;
            }
            temp = temp.next;
        }
        head = dummy.next; // update head to the new list
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        removeDuplicate list = new removeDuplicate();
        
        while (true) {
            System.out.println("1: Insert Data");
            System.out.println("2: Display List");
            System.out.println("3: Remove Duplicates");
            System.out.println("4:Remove not Consicutive Elements");
            System.out.println("5:To Remove Duplicate ");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
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
                    list.removeDup();
                    break;
                case 4:
                    list.removeNotConsicuitiveElement();
                    break;
                case 5:
                    list.removeAllDuplicates();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
