public class GridWays {

    public static  int Grid_count(int i,int j,int n,int m){

        if(i==n-1 || j==m-1){
            return 1;

        }
        else if(i==n|| j==m){
            return 0;
        }

        int w1=Grid_count(i,j+1,n,m);
        int w2=Grid_count(i+1,j,n,m);

        return w1+w2;

    }
    public static void main(String args[]){
        int n=3,m=4;
        int ways= Grid_count(0,0,n,m);
        System.out.println(ways);

    }
}
