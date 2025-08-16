package pattern_ad;

public class inverted_roted_half_pattern {

    public static void print_pattern(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }

    public static void main(String args[]){
        print_pattern(5);

    }
    
}
