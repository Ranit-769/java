package bitManipulation;

public class update {

    public static  int clear(int n, int pos){
         int bitmask=~(1<<pos);
         return n & bitmask;
    }
    public static int set( int n,int pos){
        int bitmask=1<<pos;
        return n | bitmask;
    }

    // public static int  update(int n, int pos, int value){
    //       if (value==0){
    //          return clear(n, pos);
    //       }
    //         return set(n,pos);
    // }

    public static int  update_value(int n,int pos,int newbit){
       
        n= clear(n, pos);
        // System.out.println(n);
        
        int bitmask=newbit<<pos;
        return n | bitmask;
    }

    public static void main(String args[]){
            
        System.out.println(update_value(10,3,1));
    }
    
}
