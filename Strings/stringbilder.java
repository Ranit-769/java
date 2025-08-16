package Strings;

public class stringbilder {

    public static String getString(){
        StringBuilder sb= new StringBuilder("");
          for(char ch='a';ch<='z';ch++){
              sb.append(ch+" ");
          }
          return sb.toString();
    }
    public static void main(String args[]){
              System.out.println(getString());
    }
    
}
