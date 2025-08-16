package array;

public class binarry_search {

    public static int  binarry_search_num(int arr[], int key){
        
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){

        int arr[]={2,4,8,10,18,20,24};
        int key=24;
        int result=binarry_search_num(arr,key);

        if(result==-1){
            System.out.print("not pesent;");
        }
        else{
            System.out.print("number is found at index: "+result);
        }
    }
    
}
