package Strings;
import java.util.*;

public class subString {

    public static String Sub_string(String Str,int si,int li){
           String Substr="";
            for(int i=si;i<li;i++){
                Substr+=Str.charAt(i);
            }
            return Substr;
    }
    public static void main(String args[]){
           String Str="hello boy";
           int si=3;
           int li=8;
           System.out.println(Sub_string(Str,si,li));
    }
}
