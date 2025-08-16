
import java.util.PriorityQueue;


public class Weakest_Solder {
    static class rows implements Comparable<rows>{
        int solider;
        int idx;

        public rows(int soldier,int idx){
            this.solider=soldier;
            this.idx=idx;

        }
        @Override
        public int compareTo(rows r2){
            if(this.solider == r2.solider){
                return this.idx- r2.idx;
            }
            else{
                return this.solider- r2.solider;
            }
        }
    }
    public  static void main(String  args[]){
        int soldier[][]={{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                         };
        int k=2;

        PriorityQueue<rows>pq=new PriorityQueue<>();
        for(int i=0;i<soldier.length;i++){
            int count =0;
            for(int j=0;j<soldier[0].length;j++){
                count+=soldier[i][j]==1 ? 1:0;
            }
            pq.add(new rows(count,i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
