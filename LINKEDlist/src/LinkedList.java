//import java.net.StandardSocketOptions;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

     //Add First

    public void addFirst ( int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //AddLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
             head=tail=newNode;
        }

      tail.next=newNode;
        tail=newNode;

    }

    //inset in middle

    public void addMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;

    }


    //Remove first
    public int removeFirst (){
        if(size==0){

            return -1;
        }
        else if (size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //Remove fromLast

    public int Rmovelast(){
        if(size==0){
            return -1;
        }
        else if (size==1){
            int val=head.data;
             head=tail=null;
             size=0;
             return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        return val;
    }

    //Iterative Search
      public int Search( int key){

        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
      }


    //Recursive reverse

    public int reSearch(int key){

        return helper(head,key);

    }

    public int helper(Node head,int key ){

        if(head== null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    //Remove Nth Element

    public void Re_nth(int n){

        int sz=0;
        Node temp=head;
        while(temp!=null){

            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        Node prev=head;

        int i=1;
        int iToFind=sz-n;
        while(i<iToFind){
            prev= prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }


    //print

    public void print (){
        if(head==null){
            System.out.print("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;


        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(3);
        ll.addFirst(1);

        ll.print();
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.addMid(1,2);
        ll.print();
//        System.out.println(size);

//        int ans= ll.removeFirst();
//        ll.print();


//
//        int ans= ll.Rmovelast();
//        ll.print();
//        if(ans==-1){
//            System.out.print("ll is empty;");
//         }
//        else{
//            System.out.print(ans);
//          }


        int key=3;
        int idx= ll.reSearch(key);
        if(idx==-1){
            System.out.print("empty");
        }
        else{
            System.out.println("index of "+ key + "is :"+idx);
        }

        ll.Re_nth(2);
        ll.print();

    }
}
