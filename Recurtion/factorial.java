public class factorial {

    public static int fact(int n){

        if(n==0){
            return 1;
        }
        int factNM1=fact(n-1);
        int factN=n*factNM1;

        return factN;
    }
    public static void main(String args[]){
          int n=5;
          System.out.println(fact(n));
          System.out.println(fact(6));
        //   System.out.println(fact(25 ));
          

    }
}
