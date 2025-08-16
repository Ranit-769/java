import javax.print.DocFlavor;
import java.util.TreeMap;

public class treeMAp {

    public static void main(String args[]){
        TreeMap<String , Integer>tm=new TreeMap<>();

        tm.put("india",100);
        tm.put("us",70);
        tm.put("china",190);
        System.out.println(tm);
    }
}
