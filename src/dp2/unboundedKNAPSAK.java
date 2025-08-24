package dp2;

public class unboundedKNAPSAK {

    public  static  int unbounded_knapsak(int val[],int wt[],int w,int n){
        int dp[][]=new  int[n+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j]=0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if(wt[i-1]<=j){
                    /// include
                    int ans1=val[i-1]+dp[i][j-wt[i-1]];
                    /// exclude
                    int ans2=dp[i-1][j];

                    dp[i][j]=Math.max(ans1,ans2);
                }
                else {
                    int ans=dp[i-1][j];
                    dp[i][j]=ans;
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int n=val.length;
       int ans= unbounded_knapsak(val,wt,w,n);
        System.out.println(ans);
    }
}
