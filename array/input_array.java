package array;
import java.util.Scanner;

public class input_array {
    public static void main(String args[]){
         int arr[]=new int[50];
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("enter the number of elements: ");
            int n=sc.nextInt();
            for(int i=0;i<=n-1;i++){
                System.out.print("Enter element at index "+i+": ");
                arr[i]=sc.nextInt();
            }
       
            for(int i=0;i<n;i++){
                System.out.print("element of "+i+ " is : ");
                System.out.println(arr[i]);
                } 
                System.out.println(arr.length);
            
        }
        
        
    }
}
