import java.util.ArrayList;

public class print_multi_daiAL {
     
    public static void main(String args[]){
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List1= new ArrayList<>();
        ArrayList<Integer> List2= new ArrayList<>();
        ArrayList<Integer> List3= new ArrayList<>();
        

        for(int i=0;i<=5;i++){
            List1.add(1*i);
            List2.add(2*i);
            List3.add(3*i);
        }
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);
        System.out.println(mainList);
        System.out.println();
        
        


        
        



    }
}
