import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListProblems2 {
    Node head;

    LinkedListProblems2() {
        this.head = null;
    }

    void insertData(int data) {
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverseLinkedList() {
        Node pre = null;
        Node temp = head;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
    }

    // Merge two sorted linked lists
    void mergeTwoLinkedList(LinkedListProblems2 list2) {
        Node dummy = new Node(0); // Temporary dummy node to form the new list
        Node tail = dummy;
        Node l1 = this.head;
        Node l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // If there are remaining nodes in either list, append them
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        // Update the head of the merged list
        this.head = dummy.next;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedListProblems2 list1 = new LinkedListProblems2();
        LinkedListProblems2 list2 = new LinkedListProblems2();

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Enter your choice:");
            System.out.println("1 - Add a number to the first linked list");
            System.out.println("2 - Add a number to the second linked list");
            System.out.println("3 - Display the first linked list");
            System.out.println("4 - Display the second linked list");
            System.out.println("5 - Reverse the first linked list");
            System.out.println("6 - Merge the two linked lists");
            System.out.println("7 - Exit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add to the first linked list: ");
                    int data1 = s.nextInt();
                    list1.insertData(data1);
                    break;
                case 2:
                    System.out.print("Enter a number to add to the second linked list: ");
                    int data2 = s.nextInt();
                    list2.insertData(data2);
                    break;
                case 3:
                    System.out.println("First linked list:");
                    list1.display();
                    break;
                case 4:
                    System.out.println("Second linked list:");
                    list2.display();
                    break;
                case 5:
                    list1.reverseLinkedList();
                    System.out.println("First linked list reversed:");
                    list1.display();
                    break;
                case 6:
                    list1.mergeTwoLinkedList(list2);
                    System.out.println("Merged linked list:");
                    list1.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
