package SingleLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class Palindrome {
    Node head;
    Palindrome(){
        this.head = null;
    }
    
    void insertData(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=newnode;
        }
    }

    void display(){
        if(head==null){
            System.out.println("The list is empty.");

        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    boolean isPlaindrome(){
        if (head == null) {
            System.out.println("The list is empty.");
            return true; 
        }
        Node slow = head;
        Node fast = head;
        int top=0;
        Node[] res = new Node[10];
        while((fast.next !=null) && (fast.next.next!=null)){
            res[top++] = slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        Node check;
        check = slow.next;
        if(fast.next == null){
            top--;
            check = slow.next;
        }
        else{
            res[top++] = slow;
            check = slow.next;
            top--;
        }
        while(check !=null){
            System.out.println(res[top].data +" "+check.data);
            if(check.data != res[top--].data){
                return false;
            }
            check = check.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.insertData(20);
        list.insertData(30);
        list.insertData(40);
        list.insertData(50);
        list.insertData(60);
        list.insertData(70);
        list.insertData(70);
        list.insertData(60);
        list.insertData(50);
        list.insertData(40);
        list.insertData(30);
        list.insertData(20);
        list.display();
        if(list.isPlaindrome()){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
