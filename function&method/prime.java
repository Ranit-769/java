public class prime {

    public static boolean isprime(int n){
        // boolean isprime=true;
        if(n==2){
            return true;
            
        }
        // for(int i=2;i<=n-1;i++){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                // isprime=false;
                return false;
            
            }
           
        }
        return  true;
        
    }
    public static void main(String args[]){
            int n=10;
            boolean result=isprime(n);
            if(result){
            System.out.println(result + ", "+n+ " is a prime number.");
            }else{
                System.out.println(result + ", "+n+ " is not a prime number.");
            }
    }
}
