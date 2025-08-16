
import java.util.*;

public class queue {
    Deque <Integer> dqe = new LinkedList<>();

    public void add(int data){
         dqe.addLast(data);

    }
    public int remove(){
        return dqe.removeFirst();
    }

    public int peek(){
        return dqe.getFirst();
    }

    public static void main (String args[]){
        queue q= new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());



    }
}
