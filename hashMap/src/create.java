import java.util.*;

public class create {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",70);


        System.out.println(hm);
        System.out.println(hm.get("indp"));

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indi"));
        hm.remove("us");
        System.out.println(hm);

//        System.out.println(pop);
    }
}