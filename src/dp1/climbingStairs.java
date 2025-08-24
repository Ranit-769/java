package dp1;

import java.lang.reflect.Array;
import java.util.*;

public class climbingStairs {

    public static int countWay(int n,int[] way){
         if(n==0){
             return 1;
         }
         if(n<0){
             return 0;
         }
         if(way[n]!=-1){
             return way[n];

         }
         way[n]=countWay(n-1,way)+countWay(n-2,way);
         return way[n];
    }

    public static int countWay_tabulation(int n){
        int dp[]=new  int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }



    public static void main(String rags[]){
        int n=6;
        int [] way=new int[n+1];
        Arrays.fill(way,-1);
        System.out.println(countWay(n,way));
        System.out.println(countWay_tabulation(n));

    }
}
