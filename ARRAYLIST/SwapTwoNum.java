import java.util.ArrayList;

public class SwapTwoNum {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){

        int temp=list.get(idx1); 
        list.set(idx1,list.get(idx2)); 
        list.set(idx2,temp);
    }

    public static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
         
        print(list);

        swap(list, 2, 4);
        print(list);

    }
    
}
