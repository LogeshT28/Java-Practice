package SingleLinkedList;


import java.util.*;
class Node
{
        int data;
        Node next;
        Node( int num )
        {
                this.data = num;
                this.next = null;
        }
}
class list
{
        Node Head = null;
        void Insert_end( int data)
        {
                Node newnode = new Node(data);
                if(this.Head == null)
                {
                        Head = newnode;
                }
                else
                {
                        Node tptr;
                        tptr = Head;
                        while ( tptr.next != null)
                                tptr = tptr.next;
                        tptr.next = newnode;
                }
        }
        void Display()
        {
                Node tptr;
                System.out.println();
                for ( tptr = Head; tptr!= null; tptr= tptr.next)
                        System.out.print(tptr.data+" ");
        }
        void Reverse()
        {
                Node prev,curr, safe;
                prev = null;
                curr = Head;
                while ( curr!= null)
                {
                        safe = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = safe;
                }
                this.Head = prev;
        }
        void Is_loop_remove()
        {
                Node slow;
                Node fast;
                Node prev;
                prev = null;
                slow = Head;
                fast = slow;
                do
                {
                        slow = slow.next;
                        prev = fast;
                        fast = fast.next.next;
                }while ((fast != null) && ( slow != fast));
               if ( slow == fast)// remove loop
               {
                        slow = Head;
                        do
                        {
                                slow = slow.next;
                                prev = fast;
                                fast = fast.next;
                        }while ( slow!= fast);
                        prev.next = null;

               }
        }
        void Reverse_Print( Node curr)
        {
                if (curr == null)
                        return;
                Reverse_Print(curr.next);//RC
                System.out.print(curr.data + "  ");
        }
        boolean Is_palindrome()
        {
                Node slow, fast;
                slow = Head;
                fast = Head;
                int top =0;
                Node[] stk = new Node[10];//STACK
                while ( ( fast.next != null) && (fast.next.next != null))
                {
                        stk[top++] = slow;
                        slow = slow.next;
                        fast = fast.next.next;
                }
                Node check;
                check = slow.next;
                if (fast.next == null)
                {
                        top--;
                        check = slow.next;
                } 
                else//even
                {
                        stk[top++] = slow;
                        check = slow.next;
                        top--;
                }//System.out.println(stk[top].data);
                while ((check!= null))
                {
                        System.out.println(stk[top].data +" " +check.data);
                        if (check.data != stk[top--].data)
                                return false;
                        check = check.next;
                }
                return true;
        }
}
class LinkedListCycle
{
        public static void main(String[] args)
        {
                Scanner inp = new Scanner(System.in);
                int num;
                list l1 = new list();
                while ( true)
                {
                        num = inp.nextInt();
                        if ( num == -1)
                                break;
                        l1.Insert_end(num);
                }
                l1.Reverse_Print(l1.Head);
                l1.Display();
               
                
                
        }
}
/*if (l1.Is_palindrome())
                        System.out.println("Palindrome");
                else
                        System.out.println("Not"); */
/*
 * loop creation 
 *              Node tptr;
                Node curr;
                tptr = l1.Head;
                curr = tptr;
                while ( tptr.next != null)
                        tptr= tptr.next;
                curr = curr.next.next;
                tptr.next = curr;
                
                //l1.Is_loop_remove();
 */