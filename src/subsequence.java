public class subsequence {

    public static void sequence(String newstring, String str ,int index){

        if(index==str.length()){
            System.out.println(newstring);
            return;
        }
        char currarent =str.charAt(index);
//    to be go
         sequence(newstring+currarent,str,index+1);
//        not go
        sequence(newstring,str,index+1);
    }
    public static void main(String[]args){
        String str="jt";
        sequence("",str,0);
    }
}
