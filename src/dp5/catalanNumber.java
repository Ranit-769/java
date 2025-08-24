package dp5;

import java.util.Arrays;

public class catalanNumber {

    public  static  int catalan(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalan(i)*catalan(n-i-1);
        }

        return ans;
    }

    /// memorization
    public  static  int catalan2(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);



        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalan2(i)*catalan2(n-i-1);
        }

        return dp[n]=ans;
    }


    /// tabulation
    ///
    public static int catalanTab(int n){
        int dp[]=new int [n+1];

        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++){
            for (int j = 0; j <=i-1; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }

        return dp[n];
    }

    public static  void main(String args[]){
        int n=4;
//        System.out.println(catalan2(n));
        System.out.println(catalanTab(n));

    }
}
