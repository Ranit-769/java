public class findoccurance {

     public static int first =-1;
     public static int last =-1;

     public static void occurance(int index,String str,char element){

          if(index==str.length()){
               System.out.println(first);
               System.out.println(last);
               return;
          }

           char currentchar=str.charAt(index);
           if(currentchar==element){
                if(first==-1){
                     first=index;
                }
                else{
                     last=index;

                }
                }
                occurance(index+1,str,element);

     }
     public static void main(String[]args){
          String str= "abcdaafaah";
          occurance(0,str,'a');
     }

}
