class SCLLNode {
    int data;
    SCLLNode next;

    public SCLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class convert_given_SCLL_to_SLL {
    static SCLLNode head;
    convert_given_SCLL_to_SLL(){
        this.head = null;
    }

    public void insert(int data) {
        SCLLNode newNode = new SCLLNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Make it circular
        } else {
            SCLLNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Maintain the circular nature
        }
    }

    public void convert_given_SCLL_to_SLL() {
        if (head == null) {
            return;  // The list is empty
        }

        SCLLNode current = head;

        // Traverse the list to find the last node
        while (current.next != head) {
            current = current.next;
        }

        // Break the circular link
        current.next = null;
    }

    static void display() {
        SCLLNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

        convert_given_SCLL_to_SLL cll = new convert_given_SCLL_to_SLL();
        // Insert data into the circular linked list
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);

        // Display the circular linked list
        System.out.println("Circular Linked List:");
        cll.display();

        // Convert the circular linked list to a singly linked list
        cll.convert_given_SCLL_to_SLL();

        // Display the singly linked list
        System.out.println("Singly Linked List after conversion:");
        //cll.display();
    }
}
