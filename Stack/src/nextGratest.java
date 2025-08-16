
import java.util.*;

public class nextGratest {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextGratest[]=new int [arr.length];

        for(int i= arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[i]>=arr[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nextGratest[i]=-1;
            }
            else{
                nextGratest[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGratest.length;i++){

            System.out.println(nextGratest[i]);
        }
    }

}