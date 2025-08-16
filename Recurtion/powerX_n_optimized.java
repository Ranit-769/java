public class powerX_n_optimized {

    public static int power(int x ,int n){

        if (n== 0){
            return 1;
        }
        int halfpowerSQ=power(x,n/2)* power(x,n/2);
        if(n%2!= 0){
            halfpowerSQ= x*halfpowerSQ;
        }
        return halfpowerSQ;
       
    }
    
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(power(x,n));
    }
}
