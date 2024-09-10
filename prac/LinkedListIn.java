package prac;

import java.util.*;

class SNode{
    int data;
    SNode next;
    SNode(int data){
        this.data= data;
        this.next= null;
    }
}
public class LinkedListIn {
    SNode head;
    LinkedListIn(){
        head=null;
    }
    void add(int data){
        SNode newnode = new SNode(data);
        if(head==null){
            head=newnode;
        }
        else{
            SNode temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next=newnode;
        }
    }
    void display(){
        SNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedListIn list = new LinkedListIn();
        while(true){
            int n= s.nextInt();
            switch (n) {
                case 1:
                    int data = s.nextInt();
                    list.add(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                System.exit(0);
                break;
                default:
                    break;
            }
        }
    }
    // public void insertData(int data) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'insertData'");
    // }
   

}
