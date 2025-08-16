public class priintxn  {
     public static int calpower(int x,int n){
       if(n==0){
           return 1;
       }
       if(x==0){
           return 0;
       }

         if(n%2==0){
             return calpower(x,n/2)*calpower(x,n/2);
         }
         else{
             return calpower(x,n/2)*calpower(x,n/2)*x;
         }
     }
     public static void main(String[]args){
          int x=4;
          int n=6;
          int ans=calpower(x,n);
         System.out.println(ans);
     }
}
