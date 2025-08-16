public class SumOFnatu_num {

    public static int sum(int n){
       
         if(n==1){
            return 1;
         }

        int sumNM1=sum(n-1);
        int sumN=n+ sumNM1;
        
        return sumN;
    }
    public static void main(String args[]){
           int n=6;
           System.out.println(sum(n));
    }
}
