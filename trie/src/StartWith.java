
public class StartWith {

    static class Node{
    Node children[]=new Node[26];
    boolean eow=false;
    int freq;

    public Node(){
        for(int i=0;i<children.length;i++){
            children[i]=null;
        }
        freq=1;
    }

}

    public static Node root=new Node();

    public static void insert(String word){
       Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }

        curr.eow=true;
    }
    public static boolean startwith(String word){

        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return  false;
            }
            curr= curr.children[idx];
        }
        return true;



    }

    public static  void main(String args[]){
        String words[]={"apple","app","mango","man","woman"};
        String prex1="app";
        String prex2="moon";

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startwith(prex2));
        System.out.println(startwith(prex1));
    }
}
