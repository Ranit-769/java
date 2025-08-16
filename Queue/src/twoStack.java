
import java.util.*;
public class twoStack {

    static Stack <Integer> s1=new Stack<>();
    static  Stack <Integer> s2= new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add (int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return s1.pop();
    }

    public static int peek(){
        if(isEmpty()){
            System.out.print("emptu");
            return -1;
        }
        return s1.pop();
    }

    public static void main(String args[]){

        add(1);
        add(2);
        add(5);
        add(4);

        System.out.println(peek());

        System.out.println(peek());

        System.out.println(peek());

        System.out.println(peek());



    }

    } 


