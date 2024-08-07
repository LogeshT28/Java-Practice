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

public class AdddataToASC {
    Node head;

    AdddataToASC() {
        this.head = null;
    }
     
    void Insert_Sorted(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            Node pre = null;
            while (temp != null && newnode.data > temp.data) {
                pre = temp;
                temp = temp.next;
            }
            if (pre == null) {
                newnode.next = head;
                head = newnode;
            } else {
                newnode.next = temp;//Insert Begining
                pre.next = newnode;
            }
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AdddataToASC list = new AdddataToASC();
        while (true) {
            System.out.println("1: Insert data");
            System.out.println("2: Display list");
            System.out.println("3: Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert:");
                    int data = s.nextInt();
                    list.Insert_Sorted(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
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
