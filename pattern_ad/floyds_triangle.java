package pattern_ad;
public class floyds_triangle {

    public static void num_triangle( int n){
        int counter =1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
              num_triangle(5);
    }
    
}
