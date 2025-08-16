import java.util.LinkedList;

public class DetectCycle {


        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;

//    public void print (){
//        if(head==null){
//            System.out.print("ll is empty");
//            return;
//        }
//        Node temp=head;
//        while(temp!=null) {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//
//
//        }
//        System.out.println("null");
//    }


    public static boolean isCycel(){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]){

//        DetectCycle ll=new DetectCycle();

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;

        System.out.println(isCycel());


//        ll.print();


    }

}
