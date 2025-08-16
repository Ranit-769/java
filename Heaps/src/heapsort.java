public class heapsort {

/// assendimgOrder
    public static void hypify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;

        int maxINX=i;

        if(left< size  && arr[maxINX]<arr[left]){
            maxINX=left;
        }
        if(right<size && arr[maxINX]<arr[right]){
            maxINX=right;
        }

        if(maxINX != i){
            int temp=arr[i];
            arr[i]=arr[maxINX];
            arr[maxINX]=temp;

            hypify(arr, maxINX, size);
        }
    }



/// /decending_order
///

public static void hypify2(int arr[],int i,int size){
    int left=2*i+1;
    int right=2*i+2;

    int minINX=i;

    if(left< size  && arr[minINX] > arr[left]){
        minINX=left;
    }
    if(right<size && arr[minINX] > arr[right]){
        minINX=right;
    }

    if(minINX != i){
        int temp=arr[i];
        arr[i]=arr[minINX];
        arr[minINX]=temp;

        hypify2(arr, minINX, size);
    }
}
    public static void heap(int arr[]){
        ///for non leaf-build maxheap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
//            hypify(arr,i,n);
            hypify2(arr,i,n);
        }

        /// swap
        for(int i=n-1;i>0;i-- ){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

//            hypify(arr,0,i);

            hypify2(arr,0,i);
        }

    }
    public static void main(String args[]){
       int arr[]={1,2,4,5,3};
       heap(arr);

       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }


    }
}
