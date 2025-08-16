package TWO_D_ARRAY;
import java.util.*;

public class REPRESENT {

    public static void printArray(int arr[][]){
        for( int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[] ){
     
        Scanner sc= new Scanner(System.in);   
        int arr[][]=new int[3][3];

        System.out.print("enter arrays : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);

    }
}
