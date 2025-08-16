package bitManipulation;

public class getIthbit {

    public  static  int getIthbit(int n,int i){
          int bitMask= 1 << i;

          if((n & bitMask)==0){
             return 0;
          }
          else {
            return 1;
          }

          
    }
    public static void main(String[] args){
            int n=15;
            int i=4;
            System.out.println("The "+i+"th bit of "+n+" is: "+(getIthbit(n,i)));

    }
    
}
