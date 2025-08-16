public class SubSet {

    public static void subString (String str,String ans,int idx){

        if(idx==str.length()){
            if(ans.length()==0){
                System.out.print("null");
                
            }
            System.out.println(ans);
            return;
        }
        // yes
        System.out.println(idx+"(1)="+ans);
          subString(str,ans+str.charAt(idx),idx+1);
          
        // no
        System.out.println(idx+"(2)="+ans);
        subString(str,ans,idx+1);
        
    }
    public static void main(String args[]){
        String str="abc";
        subString(str,"",0);
    }
    
}
