public class mergeSort{

    public static void merge(int arr[],int si ,int mid,int ei){
       int temp[]=new int[ei-si+1];
       int i=si;//left itarater 
       int j=mid+1;//right itarater
       int k=0;//temp itarater


       while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
       }
       
       //left part
       while(i<=mid){
        temp[k++]=arr[i++];
       }

         //right part
        while(j<=ei) {
            temp[k++]=arr[j++];
        } 

        //copying temp array to original array

        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

   
    public static void mergesort(int arr[],int si, int ei){

        if(si>=ei){
         
            return;
        }
        
         int mid=si+(ei-si)/2;
         mergesort(arr, si,mid);
         mergesort(arr,mid+1,ei);
         merge(arr,si,mid,ei);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
         int arr[]={7,8,9,3,10,1};
         print(arr);
         System.out.println();
         mergesort(arr, 0, arr.length-1);
         print(arr);
    }
}