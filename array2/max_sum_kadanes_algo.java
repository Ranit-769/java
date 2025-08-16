package array2;

public class max_sum_kadanes_algo{

    public static int cal_max_sum_prefix(int arr[]){
             
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
             currentSum+=arr[i];
             if(currentSum<0){
                currentSum=0;
             }
             System.out.println(currentSum);
             maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
             int arr[]={-2,3,-1,-2,6,7};
             int max=cal_max_sum_prefix(arr);
             System.out.print("max sub array sum :"+max);

             

    }
    
}
