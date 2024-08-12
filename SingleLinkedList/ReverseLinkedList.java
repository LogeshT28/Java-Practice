package SingleLinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    static Node head;
    
    ReverseLinkedList(){
        this.head = null;
    }
    
    void insertData(int data){
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
    
    void display(){
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    // Recursive reverse function
    void reverse() {
        head = reverseRecursively(head);
    }
    
    private Node reverseRecursively(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    void Reverse_Print( Node curr)
        {
                if (curr == null)
                        return;
                Reverse_Print(curr.next);//RC
                System.out.print(curr.data + "  ");
        }
    
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertData(10);
        list.insertData(20);
        list.insertData(30);
        list.insertData(40);
        list.insertData(50);
        list.display();
        
        //list.reverse();
        list.display();
        list.Reverse_Print(head);
    }
}
