package bitManipulation;

public class clear_range {

   
    public static int clearRange(int num, int start, int end){
        int a=(-1)<<(end+1);
        int b=(1<<(start))-1;
        int mask=a|b;
        return num & mask;

    }
    public static void main(String[] args){
              System.out.println(clearRange(45,2,4));
    }
    
}
