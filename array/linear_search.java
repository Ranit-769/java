package array;
import java.util.Scanner;

public class linear_search {

public static int lin_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }


public static void main(String args[]){

    int arr[]=new int[50];
    
    try(Scanner sc=new Scanner(System.in)){

        System.out.print("enter the arr size: ");
        int n=sc.nextInt();
        
        System.out.print("enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            
        System.out.print("enter the key to search: ");
        int key=sc.nextInt();

        int result=lin_search(arr,key);
        if(result==-1){
           System.out.print("element is not found;");
        }
        else{
            System.out.println("element is found at index :"+result);
        }

    }
    
    
 } 
}

