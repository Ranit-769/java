package pattern_ad;
public class inv_half_pyramid_withnum {

    public static void number_pyra( int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" " );
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
            number_pyra(5);
    }
}
