import java.util.*;

public class MultiDasimentional {
     public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        mainList.add(list);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currlist = mainList.get(i);
             for(int j=0;j<currlist.size();j++){
                  System.out.print(currlist.get(j)+" ");
             }
             System.out.println();
        }
     }
}
