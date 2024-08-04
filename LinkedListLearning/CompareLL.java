import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CompareLL {
    Node head;

    CompareLL() {
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean compare(CompareLL list1, CompareLL list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }
    void removeFirstElement(){
        if(head == null){
            System.out.println("LinkedList is Empty!!");
        }
        else{
            head = head.next;
        }
    }
    public static void main(String[] args) {
        CompareLL list1 = new CompareLL();
        CompareLL list2 = new CompareLL();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to insert data into list1, 2 to insert data into list2, 3 to display list1, 4 to display list2, 5 to compare the lists, 6 to Remove First Element ,7 to exit:");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert into list1:");
                    int data1 = s.nextInt();
                    list1.insertData(data1);
                    break;
                case 2:
                    System.out.println("Enter data to insert into list2:");
                    int data2 = s.nextInt();
                    list2.insertData(data2);
                    break;
                case 3:
                    System.out.println("List1:");
                    list1.display();
                    break;
                case 4:
                    System.out.println("List2:");
                    list2.display();
                    break;
                case 5:
                    boolean result = CompareLL.compare(list1, list2);
                    System.out.println("Are both lists equal? " + result);
                    break;
                case 6:
                    list1.removeFirstElement();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
