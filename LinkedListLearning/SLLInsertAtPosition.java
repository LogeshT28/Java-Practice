//package LinkedListLearning;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLLInsertAtPosition {
    Node head;

    SLLInsertAtPosition() {
        head = null;
    }

    void insertAtEnd(int data) {
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

    void insertAtPosition(int data, int position) {
        Node newnode = new Node(data);

        if (position == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void main(String[] args) {
        SLLInsertAtPosition list = new SLLInsertAtPosition();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.display();

        list.insertAtPosition(25, 1); // Insert 25 at position 1
        list.display();

        list.insertAtPosition(10, 0); // Insert 10 at position 0 (head)
        list.display();

        list.insertAtPosition(70, 7); // Insert 70 at position 7 (end of the list)
        list.display();

        list.insertAtPosition(100, 10); // Try to insert at an out-of-bounds position
        list.display();
    }
}
