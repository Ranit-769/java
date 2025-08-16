public class permutation {
    public static void PERM(String str,String ans){
       
         if(str.length()==0){
            System.out.println(ans);
            return;
         }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i); 
            System.out.println("str="+str);
            String  newStr=str.substring(0,i)+str.substring(i+1);
            System.out.println(ans+" = "+i+"="+newStr+" "+currchar); 
            PERM(newStr,ans+currchar);
            
        }
    }
    public static void main(String args[]){
        String str="abc";
        PERM(str,"");

    }
}
