package array2;

public class max_sub_arr_sum {

    public static void print_maxSum( int arr[]){

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<=arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
              int end= j;
              currentSum=0;
              for (int k=start;k<=end;k++){
                currentSum+=arr[k];
                
              }
              maxSum=Math.max(maxSum,currentSum);
              System.out.println(currentSum);

            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
    public static void main(String args[] ){
            int arr[]={2,3,4,5,6,7};
            print_maxSum(arr);
    }
     
}
