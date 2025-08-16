package bitManipulation;

public class odd_or_even {

    public static boolean odd_or_even(int n ){
            if((n & 1)==1){
                return true;
            }
            return false;
    }
    public static void main(String args[]){
          boolean res=odd_or_even(6);
          if(res==true){
             System.out.println("Number is odd");
          }
          else{
             System.out.println("Number is even");
          }
    }
}
