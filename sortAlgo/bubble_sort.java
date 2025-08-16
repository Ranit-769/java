package sortAlgo;

public class bubble_sort {

    public static void bubbleSort(int arr[]){
      for(int i=0;i<arr.length-1;i++){
          for(int  j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
          }
      }

    }

    public static void printARR(int arr[]){
        System.out.print("sorted arr is => ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }


    public static void main(String args[]){
          int arr[]={5,2,3,4,1};
          bubbleSort(arr);
          printARR(arr);
    } 
    
}
