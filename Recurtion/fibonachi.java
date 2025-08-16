public class fibonachi {

    public static int fib(int b ){

     if(b==0 || b==1){
            return b;
     }
        int fibNM1=fib(b-1);
        int fibNM2=fib(b-2);
        int fibN=fibNM1+fibNM2;

        return fibN;

    }
   public static void main(String args[]){
    int n=25;
    System.out.println(fib(n));
    System.out.println(fib(26));
   } 
}
