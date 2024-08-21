import java.util.*;
class SLLNode{
    int data;
    SLLNode next;
    SLLNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class RotateLinkedList {
    SLLNode head;
        RotateLinkedList() {
            this.head=null;
        }

     void insertData(int data){
        SLLNode newnode = new SLLNode(data);
        if(head == null){
            head = newnode;
        }
        else{
            SLLNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void display(){

        SLLNode temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void rotate(int k){
        if(head == null){
            return;
        }
        SLLNode temp = head;
        int count=1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp.next = head;
        k = k%count;
        k = count - k;
        SLLNode newtemp = head;
        for(int i=0;i<k;i++){
            newtemp = newtemp.next;
        }
        SLLNode newhead = newtemp.next;
        newtemp.next = null;
        head = newhead;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RotateLinkedList list =new RotateLinkedList();
        while(true){
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int data = s.nextInt();
                    list.insertData(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                int k = s.nextInt();
                    list.rotate(k);
                    break;
                    
                case 4:
                System.exit(0);
                break;
                default:
                    break;
            }
        }
    }
}
