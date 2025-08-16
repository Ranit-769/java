public class Merge {


    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }


    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    /// merging

    public Node merge(Node head1,Node head2){

        Node mergeDummy=new Node(-1);
        Node temp=mergeDummy;


        while(head1!=null && head2 !=null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp= temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp= temp.next;
            }

        return mergeDummy.next;
    }


    /// mergesort
    public Node merge_sort(Node head){



        if(head==null || head.next== null){
            return head;
        }

        Node mid=goMid(head);

        Node RightHead=mid.next;
        mid.next=null;
        Node newLeft=merge_sort(head);
        Node newRight=merge_sort(RightHead);
        return merge(newLeft,newRight);

    }

    public Node  goMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
//        System.out.print(slow.data);
        return slow;
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

        Merge ll= new Merge();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.print();
        ll.head = ll.merge_sort(ll.head);
        ll.print();



    }
}
