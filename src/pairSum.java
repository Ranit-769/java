
import java.util.ArrayList;

public class pairSum {

    public static boolean PAIRsum(ArrayList <Integer> List,int terget) {

        int LP = 0;
        int RP = List.size() - 1;
        while (LP < RP) {
            if (List.get(LP) + List.get(RP) == terget) {
                return true;
            } else if (List.get(LP) + List.get(RP) < terget) {
                LP++;

            }
            else{
                RP--;
            }
        }
        return false;
    }
    public static void main(String args[]){
            ArrayList <Integer> List= new ArrayList<>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        System.out.println(PAIRsum(List,5));
        System.out.print(PAIRsum(List,12));



    }
}
