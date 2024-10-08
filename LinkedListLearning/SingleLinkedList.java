//package LinkedListLearning;



class SLLNODE
{
    int data;
    SLLNODE next;
}
public class SingleLinkedList {
     static  SLLNODE insert_node(SLLNODE start,int insert_val)
    {
      SLLNODE newnode =new SLLNODE();
      newnode.data=insert_val;
      newnode.next=null;
      if(start==null)
        start=newnode;
      else
      {
        newnode.next=start;
        start=newnode;
      }
      return start;
    }
static  SLLNODE insert_node_at_end(SLLNODE start,int insert_val)
    {
      SLLNODE newnode =new SLLNODE();
      SLLNODE tptr;
      newnode.data=insert_val;
      newnode.next=null;
      if(start==null)
        start=newnode;
      else
      {
        for(tptr=start;tptr.next!=null;tptr=tptr.next);
        tptr.next=newnode;
      }
      return start;
    }
static  void sll_display(SLLNODE start)
    {
        SLLNODE tptr;
        for(tptr=start  ;   tptr!=null; tptr=tptr.next)
                System.out.print(tptr.data+" ");
    }
    static  void sll_rev_display(SLLNODE tptr)
    {
        if(tptr==null)
            return;        
        sll_rev_display(tptr.next);
        System.out.print(tptr.data+" ");

    }
static SLLNODE ll_reverser(SLLNODE start)
    {
        SLLNODE safe=null,newnext=null,tptr=null;
        tptr=start;
        while(tptr!=null)
        {
            safe=tptr.next;
            tptr.next=newnext;
            newnext=tptr;
            tptr=safe;
        }
        return newnext;
    }
public static void main(String[] args) throws Exception {
        SLLNODE start=null;
        start=insert_node(start,30);
        start=insert_node(start,20);
        start=insert_node(start,10);
        start=insert_node(start,40);
        sll_display(start);
        // start=insert_node_at_end(start,30);
        // start=insert_node_at_end(start,20);
        // start=insert_node_at_end(start,10);
        // start=insert_node_at_end(start,40);
        // sll_display(start);
        System.out.println();
        //sll_rev_display(start);
        start=ll_reverser(start);
        sll_display(start);
    }
}
