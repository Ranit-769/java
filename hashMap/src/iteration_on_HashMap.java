
import java.util.*;

public class iteration_on_HashMap {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("us", 70);
        hm.put("china", 150);
        hm.put("uk", 90);
        hm.put("span", 90);
        hm.put("german", 70);
        hm.put("england", 80);
        System.out.println(hm);

        Set<String>key=hm.keySet();
        System.out.println(key);

        /// iteration
        for (String k : key) {
            System.out.println("city:="+k+" "+"value:="+hm.get(k));
            
        }
        System.out.println(" ");

    }
}
