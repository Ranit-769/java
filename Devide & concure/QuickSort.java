public class QuickSort {

    public static int partition(int arr[],int si,int ei){

        int pivot=arr[ei];
        int i=si-1;
        System.out.println("pivot: "+pivot);

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
    
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        System.out.println("i: "+i);
        return i;
    }

    
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        

        int loc_of_pivot=partition(arr,si,ei);
        quicksort(arr,si,loc_of_pivot-1);
        quicksort(arr,loc_of_pivot+1,ei);

    }

    public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
    public static  void main(String args[]){
        int arr[]={7,8,6,1,2,4};
        print(arr); 
        System.out.println();
        
        quicksort(arr, 0, arr.length-1);
        print(arr);

    }
}

