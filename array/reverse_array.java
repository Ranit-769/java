package array;

public class reverse_array {

    public static void reverse_an_arr(int arr[]){

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        

    }
    public static void main(String args[]){
         int arr[]={58,65,58,6};
         reverse_an_arr(arr);

         for(int i=0;i<=arr.length-1;i++){
         System.out.print(arr[i]+" ");
         }
    }
    
}
