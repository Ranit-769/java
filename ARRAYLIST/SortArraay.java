import java.util.ArrayList;
import java.util.Collections;


public class SortArraay {
    public static void  main(String args[]){

    ArrayList <Integer> list =new ArrayList<>();
        
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.add(1);
        list.add(2);   
        list.add(3);
        list.add(4);

        
        System.out.println(list );
        Collections.sort(list); // Sort the list in ascending order
        System.out.println(list);
         
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list); // Sort the list in descending order
    }
}
