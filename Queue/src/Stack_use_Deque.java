import java.util.*;



public class Stack_use_Deque {

    Deque <Integer> dq= new LinkedList<>();

    public  void push(int data){
        dq.addLast(data);

    }
    public  int pop(){
        return dq.removeLast();
    }

    public int peek(){
        return dq.removeLast();
    }

    public static  void main(String args[]){
        Stack_use_Deque s= new Stack_use_Deque();
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(6);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());




    }
}
