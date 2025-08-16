public class chackarr {
    public static boolean issorted(int index,int arr[]){
       if(index==arr.length-1){

           return true;
       }

        if(arr[index]<arr[index+1]) {
            return issorted(index + 1, arr);
        }
        else{
            return false;

        }
        
    }
    public static void main(String[]args){
        int arr[]={1,2,3,5,4,6,};
        System.out.println(issorted(0,arr));
    }

}
