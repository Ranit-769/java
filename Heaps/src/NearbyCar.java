import java.util.PriorityQueue;

public class NearbyCar {
    static  class point implements Comparable<point>{
        int x;
        int y;
        int sq;
        int idx;

        public point(int x,int y,int sq, int idx){
             this.x=x;
             this.y=y;
             this.sq=sq;
             this.idx=idx;
        }

        @Override
        public int compareTo( point p2){
            return this.sq  - p2.sq;

        }
    }

    public static  void main(String args[]){
        int points[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<point>pq= new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int dis=(points[i][0]*points[i][0]) +(points[i][1]*points[i][1]);
            pq.add(new point (points[i][0],points[i][1],dis,i));
         }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }

    }
}
