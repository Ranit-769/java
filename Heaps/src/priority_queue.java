import java.util.*;
//import java.util.PriorityQueue;


public class priority_queue {

    static  class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank- s2.rank;
        }


    }
    public static void main(String args[]) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq=new PriorityQueue<>();
//          pq.add(2);
//          pq.add(3);
//          pq.add(1);
//          pq.add(4);

        pq.add(new Student("a",4));
        pq.add(new Student("b",3));
        pq.add(new Student("c",1));
        pq.add(new Student("d",2));

          while(!pq.isEmpty()){
              System.out.println(pq.peek().name+"->"+pq.peek().rank);
              pq.remove();
          }

        }
    }
