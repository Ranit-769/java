public class Last_occ {

    public static int lastoccurance(int arr[] ,int key ,int i){
        
        if(i>=arr.length){
            return -1;
        }

      int isfound =  lastoccurance(arr, key, i+1);
        if( isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    public static void main(String args[]){
            int arr[]={1,2,3,7,4,5,7,5,6,8,9,7};
            int key=9;
            System.out.println(lastoccurance(arr,key,0));
    } 
}