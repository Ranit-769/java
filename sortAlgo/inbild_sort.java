package sortAlgo;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.Collections;


public class inbild_sort {
     public static void print(Integer arr[]){
        System.out.print("sorted array:=> ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
           Integer arr[]={5,9,36,35,87,3};
        //    Arrays.sort(arr);
        //    Arrays.sort(arr,2,5);
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
    
}
