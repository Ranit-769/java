public class bionomial_coeff {
    
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void bio_coeffi(int n,int r){
        int  N=fact(n);
        System.out.println(N);
        int R=fact(r);
        System.out.println(R);
        int NR=fact(n-r);
        System.out.println(NR);

        int nCr=N/(R*NR);
        System.out.println("nCr="+nCr);


    }
    public static void main(String args[]){
       int n=4;
       int r=3;

       bio_coeffi(n, r);
      
    }
    
}
