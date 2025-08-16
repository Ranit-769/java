package array2;

public class max_sum_subarray_prefix {
    
    public static void cal_sum_prefix( int arr[]){

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
               prefix[i]=arr[i]+prefix[i-1];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j; 
                 if(start==0){
                    currSum=prefix[end];
                 }
                 else{
                    currSum=prefix[end]-prefix[start-1];
                 }
                 maxSum=Math.max(currSum,maxSum);
            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);


    }
    public static void main(String args[]){
          int arr[]={1,-2,6,-1,3};
          cal_sum_prefix(arr);
    
    }
}
