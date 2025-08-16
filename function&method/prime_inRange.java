public class prime_inRange {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
         for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
         }
         return true;
    }

    public static void printPrimeInRange(int start, int end){
        for(int i=start;i<=end;i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
           
        }
        System.out.println();
    }
    public static void main(String args[]){

        int start=2;
        int end=20;
        printPrimeInRange(start, end);
    }
    
}
