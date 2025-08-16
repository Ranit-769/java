public class Friends_pair {
    
    public static int  Friends_pair(int n){
       
        if(n==1|| n==2){
            return n;
        }
         //single way
         int frNM1=Friends_pair(n-1);
         //pair way
         int frNM2=(n-1)*Friends_pair(n-2);

         int totalWays= frNM1+frNM2;
         
         return totalWays;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(Friends_pair(n));

    }
}
