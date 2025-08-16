public class ZiaZag {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next= head;
        head=newNode;

    }

    public void addlast(int data){
        Node newNode=new Node(data);
        if(head== null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;



    }
    public void Zigzag(){
       /// find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid=slow;
        System.out.println(mid.data);

        /// reverse 2nd half

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
/// merge them
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            right=nextR;
            left=nextL;
        }



    }

    public  void print(){
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

    public static void main (String args[]){
         ZiaZag ll=new ZiaZag();
         ll.addfirst(1);
         ll.addlast(2);
         ll.addlast(3);
         ll.addlast(4);
         ll.addlast(5);
         ll.addlast(6);

         ll.print();
         ll.Zigzag();
         ll.print();

    }
}
