
import java.util.ArrayList;
public class PairSUM2_SORTED_ROTATED {

    public static boolean  PAIRsumFOR_SortedRO_arr(ArrayList <Integer> List,int terget){
        int pivot=-1;
        int n=List.size();
        for(int i=0;i<n;i++){
            if(List.get(i) > List.get(i+1)){
                 pivot=i;
                 break;
            }

        }
        int lp=pivot+1;
        int rp=pivot;

        while(lp!=rp){
             if(List.get(lp)+List.get(rp)==terget){
                 return true;
             }
             else if(List.get(lp)+List.get(rp)<terget){
                 lp=(lp+1)%n;
             }
             else{
                 rp=(n+rp-1)%n;
             }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList <Integer> List=new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        List.add(10);

        System.out.print(PAIRsumFOR_SortedRO_arr(List,16));

    }
}