import java.util.ArrayList;

public class Contain_MostWatter {

    public static int MaxWater(ArrayList<Integer> hight){
             int maxWater=0;
             for(int i=0;i<hight.size();i++){
              for(int j=i+1;j<hight.size();j++){
                    int minhight=Math.min(hight.get(i),hight.get(j));
                    int weight=j-i;
                    int currwater= minhight *  weight;
                    maxWater = Math.max(maxWater,currwater);

              }
             }
             return maxWater;
    }
    public static void main(String args[]){
      ArrayList<Integer> hight = new ArrayList<>();
      hight.add(1);
      hight.add(8);     
      hight.add(6);
      hight.add(2);     

      hight.add(5);     
      hight.add(4);     
      hight.add(8);     
      hight.add(3);     
      hight.add(7);     
         
      System.out.println(MaxWater(hight));
      

    }
}
