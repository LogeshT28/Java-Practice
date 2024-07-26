package LinkedListLearning;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedList {
    Node head;
    MergeTwoSortedList() {
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

    static MergeTwoSortedList mergeList(MergeTwoSortedList l1, MergeTwoSortedList l2) {
        MergeTwoSortedList mergedList = new MergeTwoSortedList();
        Node p1 = l1.head;
        Node p2 = l2.head;
        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                mergedList.insertdata(p1.data);
                p1 = p1.next;
            } else {
                mergedList.insertdata(p2.data);
                p2 = p2.next;
            }
        }
        while (p1 != null) {
            mergedList.insertdata(p1.data);
            p1 = p1.next;
        }
        while (p2 != null) {
            mergedList.insertdata(p2.data);
            p2 = p2.next;
        }
        return mergedList;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MergeTwoSortedList list1 = new MergeTwoSortedList();
        MergeTwoSortedList list2 = new MergeTwoSortedList();
        MergeTwoSortedList mergedList = null;

        while (true) {
            System.out.println("Enter 1 to insert data into list1, 2 to insert data into list2, 3 to display list1, 4 to display list2, 5 to merge the lists, 6 to display merged list, 7 to exit:");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert into list1:");
                    int data1 = s.nextInt();
                    list1.insertdata(data1);
                    break;
                case 2:
                    System.out.println("Enter data to insert into list2:");
                    int data2 = s.nextInt();
                    list2.insertdata(data2);
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
                    mergedList = mergeList(list1, list2);
                    System.out.println("Lists merged successfully.");
                    break;
                case 6:
                    if (mergedList != null) {
                        System.out.println("Merged List:");
                        mergedList.display();
                    } else {
                        System.out.println("No merged list to display. Please merge the lists first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
