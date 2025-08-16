import javax.swing.text.StyledEditorKit;

public class create {

    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i< children.length;i++){
                children[i]=null;
            }
        }
    }

    public static Node root= new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx= word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];


        }
        curr.eow=true;

    }

    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx= key.charAt(level)-'a';
            if(curr.children[idx]==null){
                  return false;
            }
                curr=curr.children[idx];


        }
       return curr.eow;
    }

    public static void main(String[] args) {

         String words[]={"the","a","there","any"};
        for (int word = 0; word < words.length; word++) {
            insert(words[word]);

        }

        System.out.println(search("the"));
        System.out.println(search("thee"));
        System.out.println(search("a"));
        System.out.println(search("theeaszs"));

    }
}