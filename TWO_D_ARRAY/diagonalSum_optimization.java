package TWO_D_ARRAY;

public class diagonalSum_optimization {

    public static int optimalWay(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;

    } 
    public static void main(String args[]){
        int matrix[][]={
            {0,1,2},
            {3,4,5},
            {6,7,8}
          };
  int result=optimalWay(matrix);
  System.out.print("Sum of elements on the main diagonal and anti-diagonal are: "+result);
}
}
    

