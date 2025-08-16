
public class create {

    public static class Node{
         int data;
         Node next;
         public Node(int data){
             this.data=data;
             this.next=null;
         }
    }

    public static Node head;
    public static Node tail;

///add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    ////add last
     public void addlast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode; 

     }
     ///add mid
     public void addmid(int data,int i){
       Node newNode=new Node(data);
       if(i==0){
         addFirst(data);
       }
       
       Node temp=head;
       int idx=0;

       while(idx<(i-1)){
        temp=temp.next;
        idx++;
       }
       newNode.next=temp.next;
       temp.next=newNode;

     }

    public  void print (){
        Node temp=head;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    
    public static void main(String args[]){
        create ll=new create();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        // ll.addmid(9, 7);

          
        ll.print();

    
   }
}

