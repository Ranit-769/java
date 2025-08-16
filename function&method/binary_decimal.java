public class binary_decimal {

    public static void Bin_to_Deci(int binum){
        int mynum = binum;
        int power=0;
        int deci=0;

        while(binum>0){
            int lastdegit=binum%10;
            deci=deci+(lastdegit*(int)Math.pow(2,power));
            power++;
            binum=binum/10;
            
        }
        System.out.println(mynum+"="+deci);

    }
    public static void main(String args[]){
        Bin_to_Deci(111);
    }
    
}
