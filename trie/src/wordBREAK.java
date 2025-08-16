import javax.swing.text.StyledEditorKit;

public class wordBREAK {

    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i< children.length;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

 public static void insert(String word ){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
 }

 public static boolean search(String key ){
     Node curr=root;

     for(int level=0;level<key.length();level++){
         int idx=key.charAt(level)-'a';
         if(curr.children[idx]==null){
             return false;
         }
         curr=curr.children[idx];
     }
     return curr.eow;
 }

 public static  boolean wordbreak(String word) {

     if(word.length()==0){
         return true;

     }


     for (int i = 1; i <= word.length(); i++) {
         if (search(word.substring(0, i)) && wordbreak(word.substring(i)) ) {

            return true;
         }
     }
     return false;
 }
    public static  void main(String args[]){
        String words[]={"i","like","sam","samsang","you","know"};
        String word="ilikesamsang";

        for (int wor = 0; wor < words.length; wor++) {
            insert(words[wor]);

        }

        System.out.println( wordbreak(word));
    }
}
