package array;

public class find_lergest {

    public static  int find_lergest_number(int arr[]) {
        // int largest=Integer.MIN_VALUE;
        int largest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int arr[]={1000,257,58,589,3,5};

        int largest=find_lergest_number(arr);
        System.out.print("largest number is : "+largest);

    }
}
