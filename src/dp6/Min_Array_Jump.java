package dp6;

import java.util.Arrays;

public class Min_Array_Jump {

   public static  int minjum(int arr[],int n){
       int[] dp= new int[n];

       Arrays.fill(dp,-1);
       dp[n-1]=0;


       for(int i=n-2;i>=0;i--){
           int steps=arr[i];
           int ans=Integer.MAX_VALUE;
           for(int j=i+1;j<=i+steps && j<n ;j++){
               if(dp[j]!=-1){
                   ans=Math.min(ans,dp[j]+1);
               }

           }
           if(ans!=Integer.MAX_VALUE){
               dp[i]=ans;
           }
       }
    return dp[0];
   }

    public  static  void main(String args[]){
        int arr[]={2,3,1,1,4};
        int n= arr.length;
        int ans=  minjum(arr,n);
        System.out.println(ans);
    }
}
