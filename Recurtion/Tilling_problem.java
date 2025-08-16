public class Tilling_problem {

    public static int no_tilling(int n){

        if(n==0 || n==1){
            return 1;
        }
        int Fnm1=no_tilling(n-1);
        int Fnm2=no_tilling(n-2);

        int toltal_Way=Fnm1+Fnm2;
        return toltal_Way;
    }
    public static void main(String args[]){
        int n=6;
        System.out.println(no_tilling(n));
    }
}
