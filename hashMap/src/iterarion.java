
import java.util.*;
import java.util.TreeSet;

public class iterarion {
    public static void main(String arg[]){
        HashSet<String> city= new HashSet<>();
        city.add("India");
        city.add("us");
        city.add("china");
        System.out.println(city);
//
//        Iterator it= city.iterator();
//        while(it.hasNext()){
////            System.out.println(it.next());
//        }
//
//        System.out.println("--------------------");
//        for (String set: city){
////            System.out.println(set);
//        }

        LinkedHashSet<String>lhm=new LinkedHashSet<>();
        lhm.add("India");
        lhm.add("us");
        lhm.add("china");
        System.out.println(lhm);


//        lhm.remove("us");
//        System.out.println(lhm);
        TreeSet<String >ts=new TreeSet<>();
        ts.add("Bomba");
        ts.add("Us");
        ts.add("China");
        ts.add("Arab");
        ts.add("India");
        System.out.println(ts);
    }
}
