class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SwapPairNode {
    Node head;
    SwapPairNode(){
        this.head=null;
    }

    void insertdata(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void display(){

        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    void swapAdjacentNodes(){
        if(head ==null || head.next == null){
            return;
        }
        Node pre = null;
        Node temp = head;
        Node newhead = head.next;
        while(temp !=null && temp.next !=null){
            Node n = temp.next;
            temp.next = n.next;
            n.next = temp;
            if(pre !=null){
                pre.next = n;
            }
            pre = temp;
            temp = temp.next;
        }

        head = newhead ;
    }

    public static void main(String[] args) {
        
        SwapPairNode list = new SwapPairNode();
        list.insertdata(10);
        list.insertdata(20);
        list.insertdata(30);
        list.insertdata(40);
        list.insertdata(50);
        list.insertdata(60);
        list.insertdata(70);
        list.display();
        list.swapAdjacentNodes();
        System.out.println();
        list.display();
    }
}
