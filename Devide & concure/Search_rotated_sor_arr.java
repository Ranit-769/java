public class Search_rotated_sor_arr {


    public static int search (int arr[],int tar,int  si ,int ei) {

        if(si>ei){
            return -1;
        }
            
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }


        //lie in L1
         if(arr[si]<=arr[mid]){
                 if(arr[si]<=tar && tar<=arr[mid]){
                    return search(arr,tar,si,mid-1);
                 }
                 else{
                    return search (arr,tar,mid+1,ei);
                 }
         }
         else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search (arr,tar,mid+1,ei);
            }
            else{
                return search (arr,tar,si,mid-1);
            }

         }
    }

    public static void main (String args[]) {
         int arr[]={4,5,6,7,0,1,2};
         int terget =6 ;
        int idx= search(arr,terget,0,arr.length-1); 

        if(idx==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+idx);
        }
    }
    
}
