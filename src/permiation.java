public class permiation {
    public static void printpermiation(String str,String permiation){

        if(str.length()==0){
            System.out.println(permiation);
            return;
        }


        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstring=str.substring(0,i)+str.substring(i+1);
            printpermiation(newstring,permiation+current);

        }
    }
    public static void main(String[]args){
        String str="abcd";
        printpermiation(str,"");
    }
}
