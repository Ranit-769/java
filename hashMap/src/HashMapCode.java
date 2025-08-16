
import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;


            public Node(K key, V value) {
                this.key = key;
                this.value=value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }

        }


        private void rehashing(){
            LinkedList<Node>oldbucket[]=buckets;
            N=2*N;
            buckets=new LinkedList[2*N];

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll=oldbucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }

            }

        }



        private int hashfunction(K key){
            int hc= key.hashCode();
            return Math.abs(hc)%N;
        }

        private int searchINll(K key, int bi){
            LinkedList<Node>ll=buckets[bi];
            int di=0;

            for(int i=0;i<ll.size();i++){
                Node node= ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }


        public void put(K key,V value){ /// /o(lamda)->O(1)
            int bi=hashfunction(key);
            int di = searchINll( key,bi);

            if(di != -1){
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;

            }

            double lamda= (double)n/N;
            if(lamda>2.0){
                rehashing();
            }
        }

        public boolean cotainsKey(K key ){  /// //O(1)
            int bi=hashfunction(key);
            int di = searchINll( key,bi);

            if(di != -1){
                return true;
            }else{
               return false;
            }


        }
        public V get(K key){   /// /O(1)
            int bi=hashfunction(key);
            int di = searchINll( key,bi);

            if(di != -1){
                Node node=buckets[bi].get(di);
               return  node.value;
            }else{
                return  null;

            }

        }

        public V remove(K key){    /// /O(1)
            int bi=hashfunction(key);
            int di = searchINll( key,bi);

            if(di != -1){
                Node node=buckets[bi].remove (di);
                return  node.value;
            }else{
                return  null;

            }
        }


    public  ArrayList<K> keySet(){
            ArrayList<K>keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList <Node> ll=buckets[i];
               for (Node node : ll) {
                 keys.add(node.key);
               }
            }
            return keys;
    }


    }
    public static void  main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("india",100);
        hm.put("china",170);
        hm.put("us",70);

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);

        }
        System.out.println(hm.get("india"));
        System.out.println(hm.remove("us"));
        System.out.println(hm.get("us"));
    }
}
