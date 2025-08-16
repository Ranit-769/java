import java.util.*;

public class Deque_cre {
    public  static void main(String args[]){
             Deque <Integer> dq = new LinkedList<>();

             dq.addFirst(1);
             dq.addLast(1);
             dq.addFirst(2);
                dq.addFirst(3);
                dq.addFirst(4);

                while(!dq.isEmpty()){
                    System.out.print(dq.remove());
                    System.out.print(" ");
                }


    }
}
