public class Reverse {
      public class Node {
          int data;
          Node next ;
          public Node (int data) {
              this.data=data;
              this.next=null;
          }

      }

      public static  Node head;
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

      //reverse
     public void reverse(){
          if(head==null){
              System.out.print("empty");
              return;
          }
          Node prev=null;
          Node curr=head;
          Node next;

          while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          head= prev;

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
          Reverse  ll=new Reverse();
          ll.add(5);
          ll.add(4);
          ll.add(3);
          ll.add(2);
          ll.add(1);

          ll.print();

          ll.reverse();
          ll.print();


      }

}
