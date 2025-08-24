package dp6;

public class MINpertition {

    public  static  int minimum_pertition(int arr[]){

     int n= arr.length;
     int sum=0;
        for (int i = 0; i < n; i++) {

             sum+=arr[i];
        }

     int w=sum/2;

     int[][]dp=new int [n+1][w+1];

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j < w+1; j++) {
                if(arr[i-1]<=j){
                    dp[i][j]=Math.max(arr[i-1]+dp[i][j-arr[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }

        int  sum1=dp[n][w];
        int sum2= sum-sum1;

        /// if the question is  the diff==0 or not
//        if(sum1==(double)sum/2){
//            System.out.print("sum=0 possible");
//        }else{
//            System.out.println("sum=0 not  possible");
//        }
//
        /// //
        return Math.abs(sum1-sum2);
    }

    public  static  void main(String args[]){
        int arr[]={1,2,3,4,5};
        int min_ans= minimum_pertition(arr);
        System.out.println(min_ans);
    }
}
