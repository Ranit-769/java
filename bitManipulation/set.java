package bitManipulation;

public class set {

    public static int setBit(int n, int pos){

        int bitmask=1<<pos;
        return n | bitmask;
    }
    public static void main(String args[]){
           System.out.println(setBit(10,2));
    }
    
}
