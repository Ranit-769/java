
import java.util.*;

public class ConectNrope_withMINcost {
    public static void main(String args[]){
        int roplenghts[]={5,4,9,3,2};

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<roplenghts.length;i++){
            pq.add(roplenghts[i]);
        }

        int cost =0;

        while(pq.size()>1){
            int min=pq.remove();
            int max=pq.remove();
            cost+=min+max;
            pq.add(min+max);
        }
        System.out.println("cost is:"+cost);
    }
}
