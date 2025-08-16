import java.util.*;

public class reverse {
    public static void reverse(Queue <Integer> q){
            Stack <Integer> S= new Stack<>();
            while(!q.isEmpty()){
                S.push(q.remove());
            }
            while(!S.isEmpty()){
                q.add(S.pop());
            }
        }
        public static void main(String args[]){
           Queue <Integer> q= new LinkedList<>();
           q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            reverse(q);
           while(!q.isEmpty()) {
             System.out.print(q.remove());
               System.out.print(" ");

           }
        }
    }


