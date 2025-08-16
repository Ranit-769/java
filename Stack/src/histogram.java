import java.util.*;

public class histogram {

    public static void maxArea(int arr[]){

        Stack <Integer> s=new Stack<>();
        int max_area=0;
        int nsl[]=new int [arr.length];
        int nsr[]=new int [arr.length];
        /// nsr
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() &&  arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        /// nsl

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() &&  arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        /// max

        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;

            int currMAX=height*width;

            max_area=Math.max(max_area,currMAX);
        }

        System.out.print("maximum area of histogram =  "+ max_area);
    }
    public static void main(String  args[]){
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
