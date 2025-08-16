//import java.util.LinkedList;

public class RemoveLoop {

    public  static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void CycleBreak (){
          /// check cycle
        System.out.println("start");
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;

            if(slow==fast){
                cycle=true;
                break;
            }
        }




        if(cycle==false){
            return;
        }
        else{
            slow=head;
            Node prev=null;
            while(slow != fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;


            }
            prev.next=null;



        }





    }

    public  static void print(){
        if(head==null){
            System.out.print("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){

        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;

        CycleBreak();
        print();


    }
}
