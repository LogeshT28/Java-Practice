//package LinkedListLearning;

import java.util.Scanner;

class TreeNode {
    int data;
    Node next;

    TreeNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LLImplementation {
    Node head;

    LLImplementation() {
        this.head = null;
    }

    void insertdata(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }

    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
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

    void reverse() {
        Node pre = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LLImplementation list = new LLImplementation();
        while (true) {
            System.out.println(
                    "Enter 1 to insert data,2 to  Delete a data ,3 to display data,4 to reverse a linked List ,5 to exit:");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert:");
                    int data = s.nextInt();
                    list.insertdata(data);
                    break;
                case 2:
                    System.out.println("Enter data to delet:");
                    int d = s.nextInt();
                    list.delete(d);
                    break;
                case 3:
                    System.out.println("Linked List:");
                    list.display();
                    break;
                case 4:
                    list.reverse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
