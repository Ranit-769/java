package TWO_D_ARRAY;
import java.util.*;

public class searchElement {

    public static boolean   Searcharr(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                   System.out.print("element is found" );
                   return true;
                }
            }
        }
        System.out.println("element not found");
        return false;

    }

    public static void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printarr(arr);
        System.out.print("Enter the Searching element: ");
        int n= sc.nextInt();
        
        Searcharr(arr,n);

    }
    
}
