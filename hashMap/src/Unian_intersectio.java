
import java.util.*;

public class Unian_intersectio {
    public  static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i< arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());
        System.out.print("union elements are:=");
        for(Integer key:set){
            System.out.print(" "+key+" ");
        }
        System.out.println();

        set.clear();
        for(int i=0;i< arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        System.out.print("intersection elements are:=");

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println(count);


    }
}
