public class Doublell {

    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;


    /// add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

   ///Remove first
    public int RemoveFirst(){

      if(head==null){
          System.out.print("dll is empty");
          return Integer.MIN_VALUE;
      }
      else if(size==1){
          int val=head.data;
          size--;
          return val;
      }

      System.out.println("yaa");
      int val=head.data;
      size--;
      head=head.next;
      head.prev=null;
      return val;
    }

    /// reverse
    public void Reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    /// 
    public  static void print(){
        if(head==null){
            System.out.print("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Doublell dll=new Doublell();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(4);
        dll.print();


//        dll.RemoveFirst();
        dll.Reverse();
        dll.print();



    }
}

