package TWO_D_ARRAY;

public class diagonal_sum {

    public static int  sum(int matrix[][]){

        int sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                     sum+=matrix[i][j];
                }
                else if((i+j)==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
            
        }
        return sum;
    }
    public static void main(String  args[]){
           int matrix[][]={
                      {0,1,2},
                      {3,4,5},
                      {6,7,8}
                    };
            int result=sum(matrix);
            System.out.print("Sum of elements on the main diagonal and anti-diagonal are: "+result);
    }
    
}
