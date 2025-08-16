package bitManipulation;

public class clear {
    public static int clearBit(int n, int pos){
        int bitmask=~(1<<pos);//(~0)==-1
        return n & bitmask;  //clears the bit at position pos
    }
    public static void main(String args[]){
        System.out.println(clearBit(10,2));
    }
    
}
