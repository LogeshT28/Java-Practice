class Queue {
    Node[] queue;
    int front;
    int rear;
    Queue(){
        queue = new Node[20];
        front = -1;
        rear =-1;
    }
    void Enqueue(Node curr){
        if(rear == -1){
            front++;
            queue[++rear] = curr;
            rear++;           
        }
    }


    void Breath_first_Traversal(Node curr){
        Node temp;
        Queue qt = new Queue(0);
        qt.Enqueue(curr);
        temp = qt.Dequeue();
        while(temp !=null){
            System.out.println(temp.data+" ");
            if(temp.left !=null)
{
    qt.Enqueue(temp.left);
} 
        if(temp.right !=null){
            qt.Enqueue(temp.right);
        }
        temp = qt.Dequeue()x;
}

    }
}
