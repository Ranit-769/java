public class Remove_duplicate {

    public static void remove_dup(String str,int idx,StringBuilder newStr,boolean map[]){
       

        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char current_char=str.charAt(idx);
        int current_char_idx=current_char-'a';

        if(map[current_char_idx]==true){
            remove_dup(str,idx+1, newStr, map);
        }
        else{
            map[current_char_idx]=true;
            remove_dup(str,idx+1, newStr.append(current_char), map);
        }

    }
    public static void main(String args[]){
        String str="appnnacollage";
         
        boolean map[]=new boolean[26];
        remove_dup(str, 0, new StringBuilder("") , map);

    }
}
