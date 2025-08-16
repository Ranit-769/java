import java.util.*;


/// /minheap
///
public class insert {
    static class Heap{
        ArrayList <Integer> arr= new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int per=(x-1)/2;

            while(arr.get(x)< arr.get(per)){
                int temp= arr.get(x);
                arr.set(x, arr.get(per));
                arr.set(per,temp);


                x=per;
                per=x;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void hypify(int i){
           int left= 2*i+1;
           int right=2*i+2;

           int minIDX=i;

           if(left<arr.size() && arr.get(minIDX)> arr.get(left)){
               minIDX=left;
           }
           if(right<arr.size() && arr.get(minIDX)> arr.get(right)){
               minIDX=right;
           }

           if(minIDX != i){
               int temp= arr.get(i);
               arr.set(i, arr.get(minIDX));
               arr.set(minIDX,temp);


               hypify(minIDX);

           }
        }

        public int remove(){
            int data= arr.get(0);

            int temp= arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            hypify(0);
            return  data;


        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }

    public static void main(String args[]){

        Heap h=new Heap();
        h.add(2);
        h.add(4);
        h.add(1);
        h.add(3);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
