package sortAlgo;

public class selection_sort {
    public static  void slectionSort(int arr[]){
        for (int i=0; i<arr.length-1;i++){
         int smallest=i;
         for(int j=i+1; j<arr.length;j++){
             if(arr[j]<arr[smallest]){
                 smallest=j;
                 
             }
             int temp=arr[smallest];
             arr[smallest]=arr[i];
             arr[i]=temp;
         }
        }
 }

 public static void printarr(int arr[]){

     System.out.println("sorted arr:=>");
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
 }
  
  public static void main(String args[]){
         int arr[]={5,2,1,3,4};
         slectionSort(arr);
         printarr(arr);
  }
}
