public class Add_element_subtrac {

    public static void addArray(int arr[],int idx,int val){

        if(idx==arr.length){
            printarr(arr);
            return;
        }
        
        arr[idx]=val;
        System.out.println("arr["+idx+"] = "+arr[idx]);
        addArray(arr, idx+1, val+1);
        arr[idx]=arr[idx]-2;
        System.out.println("arr["+idx+"] = "+arr[idx]);
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
         int arr[]=new int[5];
         addArray(arr, 0, 1 );
         printarr(arr);
   
    }
}