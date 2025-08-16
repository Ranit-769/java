public class palindrom {

    public class Node {
        int data;
        Node next ;
        public Node (int data) {
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;

    public void add(int data){

       Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    
    ///palindrom

    public Node Findmid(Node head){
        Node fast= head;
        Node slow= head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

public boolean palindrom(){
        if(head==null || head.next==null){
            return true;
        }
        /// find middle
        Node mid= Findmid(head);

        /// reverse 2nd part
        Node prev=null;
        Node curr= mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node rightHead=prev;
        Node leftHead= head;

        /// check
        while(rightHead!=null){
            if(rightHead.data != leftHead.data){
                return false;
            }
            rightHead=rightHead.next;
            leftHead=leftHead.next;

        }
        return true;
}


    public void print(){
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
      palindrom  ll=new palindrom();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        ll.print();
        boolean ans= ll.palindrom();
        System.out.println( " its a palindrom ( true or false) =>"+ans);





    }

}


