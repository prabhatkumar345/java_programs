//import java.util.*;
class LL{
    Node head;
    int size;
    LL(){
       size=0;
    }

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        size++;   

    }}
//insertion at begning
void addfirst(int data){
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;

}
void addlast(int data){
    Node lastnode=new Node(data);
    if(head==null){
        head=lastnode;
    }
    Node addlast=head;
    while(addlast.next!=null){
        addlast=addlast.next;
    }
    addlast.next=lastnode;


}    
void firstdelete(){
    if(head==null){
        System.out.println("empty list");
    }
    head=head.next;
    size--;
}
void lastdelete(){
    if(head==null){
        System.out.println("empty list");
    }size--;
    if(head.next==null){
        head=null;

    }
    Node secondnode=head;
    Node lastnode=head.next;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
        secondnode=secondnode.next;
    }
secondnode.next=null;
}


    void printlist(){
        if(head==null){
            System.out.print("List is empty");

        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("NULL \n");
       // System.out.println("Size="+size);
        System.out.println( );
    }

    void reverse(){
        if(head==null || head.next==null){
            return;
        }Node prev=head;
        Node curren=head.next;
        while(curren!=null){
            Node nextnode=curren.next;
            curren.next=prev;

            //update
            prev=curren;
            curren=nextnode;
        }
        head.next=null;
        head=prev;
    }
    
    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.addlast(4);
        list.printlist();
        list.reverse();
        list.printlist();
        

        
    }

}