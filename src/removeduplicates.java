public class removeduplicates  {

    public static boolean []map=new boolean[26];

    public static void remove(int index,String str,String newstring){

       if(index==str.length()){
           System.out.println(newstring);
           return;
       }

        char currchar=str.charAt(index);

        if(map[currchar-'a']==true){
               remove(index+1,str,newstring);
        }
        else{
            newstring+=currchar;
            map[currchar-'a']=true;
            remove(index+1,str,newstring);


        }

    }
    public static void main(String[]args){
        String str="abbcddfeekhuuololfin";
        remove(0,str,"");

    }
}
