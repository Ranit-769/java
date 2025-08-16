public class print_1_n {

    public static void print_1toN (int n) {
        
         if(n==0){
            return;
         }
        print_1toN(n-1);
        System.out.print(n +" ");
    }
    public static void main (String args[]) {
            
        int n =10;
        print_1toN(n);
    }
}
