package bitManipulation;

public class clear_last_It_hbit {
     
    public static int clearLast_ith_Bit(int n,int pos) {
        int bitmask= (-1)<<pos;
        return n & bitmask;
    }
    public static void main(String args[]){
              System.out.println(clearLast_ith_Bit(15, 2));
    }
}
