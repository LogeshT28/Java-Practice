//package LinkedListLearning;

class Node {
    int data;
    TreeNode next;

    Node() {
        data = 0;
    }

    Node(int d) {
        data = d;
    } // Constructor to create a new node
}

class ArrayToLinkedList {
    static TreeNode head = null;
    static TreeNode tail = null;

    static TreeNode constructLL(int arr[]) {
        // Reset head and tail for each new linked list construction
        head = null;
        tail = null;
        for (int i = 0; i < arr.length; i++) {
            insertdata(arr[i]);
        }
        return head;
    }

    public static void insertdata(int data) {
        // Node newnode = new Node(data);
        // if (head == null) {
        // head = newnode;
        // } else {
        // Node temp = head;
        // while (temp.next != null) {
        // temp = temp.next;
        // }
        // temp.next = newnode;
        // }

        TreeNode newnode = new TreeNode(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 53, 28, 92, 43, 93, 3, 45, 75, 94, 34, 100, 51, 22, 85, 74, 12, 48, 40 }; // Example array
        TreeNode head = constructLL(arr);
        printList(head); // Print the constructed linked list
    }

    // Utility method to print the linked list
    public static void printList(TreeNode head) {
        TreeNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
