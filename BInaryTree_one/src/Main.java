//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static class Node{
        int data;
        Node left ;
        Node right ;

        Node(int data){
            this.data= data ;
            this.left=null;
            this.right=null;
        }
    }

    static class Binary{
        static  int idx=-1;
        public static Node Buildtree(int node[] ){
                idx++;
                if(node[idx]==-1){
                  return null;
                }
                Node newnode= new Node(node[idx]);
                newnode.left=Buildtree(node);
                newnode.right= Buildtree(node);
                return newnode;
        }
    }
    public static void main(String[] args) {
     int node[]={};
    }
}