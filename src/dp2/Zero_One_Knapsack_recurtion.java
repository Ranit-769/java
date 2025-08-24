package dp2;

public class Zero_One_Knapsack_recurtion {
    public static  int knapsack(int val[],int wt[],int w,int n,int dp[][]){

         if(w==0 || n==0){
             return 0;
         }

         if(dp[n][w]!=-1){
             return dp[n][w];
         }
         if(wt[n-1]<=w){
             /// include
             int ans1=val[n-1]+knapsack(val, wt, w-wt[n-1], n-1,dp);
             /// exclude
            int ans2=knapsack(val, wt, w, n-1,dp);
             dp[n][w]=Math.max(ans1,ans2);
             return dp[n][w];
         }
         else {
             /// exclude
             dp[n][w]=knapsack(val, wt, w, n - 1,dp);
             return dp[n][w];

         }
    }


    public static void print(int dp[][]){
        for (int i=0;i< dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static  int Knapsacktapbu(int val[],int wt[],int w){

        int n= val.length;;
        int dp[][]=new int[n+1][w+1];

        for(int i=0;i< dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j< dp[0].length;j++){
            dp[0][j]=0;
        }


        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int value=val[i-1];
                int weight=wt[i-1];

                if(weight<=j){
                    int include=value+dp[i-1][j-weight];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }
                else{
                    int exclude=dp[i-1][j];
                    dp[i][j]= exclude;
                }
            }
        }


        print(dp);

        return dp[n][w];

    }
    public static void main(String ars[]){
        int val[]={15,14,10,45,30};
                int wt[]={2,5,1,3,4};
                        int w=7;
        int n=val.length;

        int dp[][]=new int [n+1][w+1];

        for(int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println("max profit:"+knapsack(val,wt,w,n,dp));
        System.out.println("max profit:"+Knapsacktapbu(val,wt,w));
    }
}
