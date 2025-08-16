package TWO_D_ARRAY;
import java.util.*;

public class Find_smallest{
    
    public static int find_smallest_number(int arr[][]){

        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }

        }
        return smallest;
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
        int result=find_smallest_number(arr);
        System.out.println("smallest number in the array is: "+result);
    }
    
}
