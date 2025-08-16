package TWO_D_ARRAY;
import java.util.*;

public class find_largest {
    
    public static int find_largest_number(int arr[][]){

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }

        }
        return largest;
    }
    public static void inputArray(int arr[][]){

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the elments:");
           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
           }
    }

    public static void print_arr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]=new int[4][4];
        inputArray(arr);
        print_arr(arr);
        int result=find_largest_number(arr);
        System.out.println("Largest number in the array is: "+result);
    }
    
}
