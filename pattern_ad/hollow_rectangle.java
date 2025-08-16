package pattern_ad;
public class hollow_rectangle {

    public static void holl_recta(int toRow,int tocolumn){
        for (int i=1;i<=toRow;i++){
            for (int j=1;j<=tocolumn;j++){
                if(i==1||i==toRow||j==1||j==tocolumn){
                             System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){

        holl_recta(5,4);  
    }
}
