package Strings;

public class palindrom_check {

    public static boolean ispalindrom(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]){
              String word="ranit";
              boolean result=ispalindrom(word);
              if(result==false){
                System.out.print("not palindrom");
              }
             else{
                System.out.print("palindrom");
             }
              
    }
    
}
