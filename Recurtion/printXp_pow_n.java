public class printXp_pow_n {

    public static int pow(int x ,int n){

     if(n==0){
        return 1;
     }
      int powNM1=pow(x,n-1);
      int powN=x*powNM1;

      return powN;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(pow(x,n));
    }
}
