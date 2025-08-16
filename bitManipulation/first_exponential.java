package bitManipulation;

public class first_exponential {

    public static int first_Exponential(int n,int a){
          int ans =1;
          while(n>0){
            if((n&1)!=0){
                ans= ans*a;
            }
            a=a*a;
            n=n>>1;

          }
          return ans;
    }
    public static void main(String args[]){
           System.out.println(first_Exponential(5,3));//3^5 
    }
}