package dp3;

import java.util.concurrent.atomic.AtomicLong;

public class rodcutting {

    public  static  int cutting(int length[],int price[],int totalrod){
        int n=price.length;
        int dp[][]=new int[n+1][totalrod+1];


        for (int i = 0; i < n+1; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < totalrod +1; i++) {
            dp[0][i]=0;
        }

            for (int i = 1; i <n+1 ; i++) {
                for (int j = 1; j <totalrod+1 ; j++) {
                    if(length[i-1]<=j){
                        dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                    }
                    else {
                        dp[i][j]=dp[i-1][j];
                    }
                }

            }
            return dp[n][totalrod];

    }
    public static  void main(String rags[]){
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int  totalrod=8;

        System.out.println(cutting(length,price,totalrod));
    }
}
