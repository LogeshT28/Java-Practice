package prac;
import java.util.*;
class Root{
    int data;
    Root next;
    Root(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Root head;
    SLL()
    {
        head=null;
    }

    void insert(int data)
    {
        Root newnode=new Root(data);
        if(head==null)
        {
            head=newnode;
        }else
        {
           Root temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
           // newnode=temp.next;
           temp.next=newnode;
        }
    }
    void display()
        {
            Root temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            SLL linked=new SLL();
            while(true){
            int c=sc.nextInt();
            switch(c){
                
                case 1:
                int data=sc.nextInt();
                    linked.insert(data);
                    break;
                case 2:
                    linked.display();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
    
}
