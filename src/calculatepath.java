
public class calculatepath{
    public static int  path(int n,int m,int i,int j){

        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

        int down =path(n,m,i+1,j);
        int  right =path(n,m,i,j+1);
        return down+right;
    }
    public static void main(String[]args){
        int n=3;
        int m=3;
        int ans=path(n,m,0,0);
        System.out.println(ans);
    }
}