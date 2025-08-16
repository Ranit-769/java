package TWO_D_ARRAY;

public class search_sorted_matrix {

    public static int search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
                    if(matrix[row][col]==key){
                     System.out.print("element is found at index: "+"("+row+","+col+")");
                       return 0; 
                    }
                    
                    else if(matrix[row][col]<key){
                        row++;

                    }
                    else{
                        col--;
                    }
        }
        return -1;
    }
    public static void main(String args[]){
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45,},
            {27,29,37,48},
            {32,33,39,50}
          };
          int key=60;
  int result=search(matrix,key);
  if(result==-1){
    System.out.print("element is not found");
  }

}

    }
    

