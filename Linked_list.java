import org.w3c.dom.ls.LSOutput;

public class Linked_list{
    //this display the data by using the function with for loop
    public static void arrange(Node head){
        for(int i=0;i<=5;i++){
            System.out.print(head.data +" ");
            head=head.next;
        }
        System.out.println( );
    }
    //this is done using the recurrision function
    public static void arrange2(Node x){
        if(x==null) return;
        System.out.print(x.data +" ");
        arrange2(x.next);
    }
  public static class Node{
        int data;//value
        Node next;//address of the next node
        public Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(39);
        Node b=new Node(86);
        Node c=new Node(38);
        Node d=new Node(66);
        Node e=new Node(48);
        Node f=new Node(55);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        arrange(a);
        arrange2(a);
        //this is done by using the temp variable
        Node temp=a;
        System.out.println( );
        for(int i=0;i<=5;i++){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
}