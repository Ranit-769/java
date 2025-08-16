import java.util.HashSet;

public class uniqesequence {

    public static HashSet<String>set=new HashSet<>();

    public static void sequence(int index,String str,String newstring,HashSet<String>set
){

        if(index==str.length()){
            if(set.contains(newstring)){
                return;
            }
            else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }


         char currchar=str.charAt(index);

               sequence(index+1,str,newstring+currchar,set);
               sequence(index+1,str,newstring,set);

    }
    public static void main(String[]args){
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        sequence(0,str,"",set);
    }
}
