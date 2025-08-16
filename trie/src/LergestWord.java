public class LergestWord {

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

        public static String ans=" ";

        public static void lergestWord(Node root,StringBuilder temp){

            if(root==null){
                return;
            }
            for(int i=0;i<26;i++){
                if(root.children[i]!=null && root.children[i].eow==true){
                    char ch=(char)(i+'a');
                    temp.append(ch);
                    if(temp.length()>ans.length()){
                        ans=temp.toString();
                    }
                    lergestWord(root.children[i],temp);
                    ///backtrack
                    temp.deleteCharAt(temp.length()-1);

                }

            }
        }

        public static void main(String[] args) {

            String words[]={"a","ap","there","app","apple","appl","apply"};
            for (int word = 0; word < words.length; word++) {
                insert(words[word]);

            }
            lergestWord(root,new StringBuilder(""));
            System.out.println(ans);

        }
    }

