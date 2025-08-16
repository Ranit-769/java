package Strings;

public class largest {
    public  static String find_largest(String fruit[]){
         String largest= fruit[0];
              for(int i=1;i<fruit.length;i++){
                if(largest.compareTo(fruit[i])<0){
                    largest=fruit[i];
                }
              }
              return largest;
    }
    public static void main(String args[]){
               String fruit[]={"apple","mango","bananna"};
              System.out.println(find_largest(fruit));
    }
}
