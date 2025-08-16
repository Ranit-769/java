import java.util.ArrayList;



public class operation {

   public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list.size());

        //to get element 
        int element =list.get(0);
         System.out.println(element);
        
        //remove element 
        list.remove(2);
        System.out.println(list);
        
        //set element in any index
        list.set(2,3);
        System.out.println(list);

        //check existance

        
       System.out.println(list.contains(4));


       
        // System.out.println(list.size());
   }
}