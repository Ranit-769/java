public class decimal_Binary {

    public static void Deci_to_bin(int decimal) {
       int binary=0;
       while(decimal>0){
        int reminder=decimal%2;
        binary=binary*10+reminder;
        decimal=decimal/2;
       }
       System.out.println(binary);

    }
    public static void main(String args[]){
           Deci_to_bin(16);
    }
    
}
