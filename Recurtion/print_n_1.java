public class print_n_1 {

    public static void print_Nto1(int n){
       
         if(n==0){
            return;
         }
        System.out.print(n+" ");
        print_Nto1(n-1);


    }
      public static void main(String args[]){
          int n=10;
            print_Nto1(n);
      } 
}