import java.util.ArrayList;


public class fndMAX_waterOPTIMAL {

     public static int calWATER_LEV(ArrayList<Integer>hight){
          
        int maxWater=0;
        int Lp=0;
        int Rp=hight.size()-1;
        while(Lp<Rp){
            int  minht=Math.min(hight.get(Lp),hight.get(Rp));
            int weight=Rp-Lp;

            int CurrWater=minht*weight;
            maxWater=Math.max(maxWater,CurrWater);

            if(hight.get(Lp)<hight.get(Rp)){
                Lp++;
            }
            else{
                Rp--;
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


          System.out.println("Maximum water level is: "+calWATER_LEV(hight));
         
    }
    
}
