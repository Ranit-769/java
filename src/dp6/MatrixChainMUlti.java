package dp6;

import java.util.*;

public class MatrixChainMUlti {

    public static  int mcm(int arr[],int i,int j){

        if(i==j){
            return 0;
        }

        int ans= Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr, i, k);
            int cost2=mcm(arr, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalans=cost1+cost2+cost3;

            ans=Math.min(ans,finalans);
        }
        return ans;
    }


    /// Memorization
    ///
    public  static int mcm2(int arr[],int i,int j){
        int n= arr.length;
        int[][] dp= new int[n][n];

        for ( int k = 0; k < n ; k++) {
          Arrays.fill(dp[k],-1);
        }

        if(i==j){
            return 0;
        }

        int ans=Integer.MAX_VALUE;

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        for(int k=i;k<=j-1;k++){
            int cost1=mcm2(arr, i, k);
            int cost2=mcm2(arr, k+1, j);
            int cost3= arr[i-1]*arr[k]*arr[j];

            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);
        }
        return  dp[i][j]=ans;
    }
/// tabulation
///

public static int  mcmTabu(int arr[]){
    int n=arr.length;

    int [][]dp=new int[n][n];

    for (int i = 0; i < n; i++) {
        dp[i][i]=0;  ///i==j
    }

    for(int length=2;length<=n-1;length++){
        for(int i=1;i<=n-length;i++){
            int j=i+length-1;
             dp[i][j]=Integer.MAX_VALUE;
            for (int k = i; k <= j-1; k++) {
                int cost1=dp[i][k];
                int cost2=dp[k+1][j];
                int cost3=arr[i-1]*arr[k]*arr[j];
                int finalans=cost1+cost2+cost3;

                dp[i][j]=Math.min(dp[i][j],finalans);
            }
        }
    }
    print(dp);
    return dp[1][n-1];

}

public  static void print(int [][]dp){
    for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}

public static void  main(String args[]){
        int arr[]={1,2,3,4,3};
        int n= arr.length;

        /// recursion
        int minCost= mcm(arr,1,n-1);
        System.out.println("min cost(recursion):="+minCost);
        /// memorization
        int minCost2= mcm2(arr,1,n-1);
        System.out.println("min cost(memorization):="+minCost2);
        /// /tabulation

        int mincost3=mcmTabu(arr);
         System.out.println("min cost(Tabulation):="+mincost3);
    }
}
