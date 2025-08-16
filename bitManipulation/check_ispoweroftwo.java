package bitManipulation;

public class check_ispoweroftwo {

    public static boolean IS_power_of_two(int num){
         
        if((num & num-1) ==0){
             return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(IS_power_of_two(8));
    }
    
}
