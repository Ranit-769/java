import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> List,int terget){
           for(int i=0;i<List.size();i++){
                for(int j=i+1;j<List.size();j++){
                    if(List.get(i)+List.get(j)==terget){
                        return true;
                    }
                }
           }
              return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        
        System.out.println("Pair sum found: "+pairSum(List,5));
        System.out.println("Pair sum found: "+pairSum(List,11));

       

    }      
}
