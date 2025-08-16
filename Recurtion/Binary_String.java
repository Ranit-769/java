public class Binary_String {

    public static void print_BIn_String(int n,int last_position,String str){

        if(n==0){
            System.out.println(str);
            return;
        }
         if(last_position == 0){
            print_BIn_String(n-1, 0, str+"0");
            print_BIn_String(n-1, 1, str+"1");
         }
         else{
            print_BIn_String(n-1, 0, str+"0");
         }
    }
    public static void main(String args[]){
      
        int n=3;
        print_BIn_String(n,0,"");
    }
}
