import java.util.*;

public class transformtionTree {
    static class Node {
        int data;
      Node left , right ;

        Node(int data){
            this.data= data;
            this.right= null;
            this.left= null;
        }

    }

    public static  int tranform(Node root){

        if(root== null){
            return 0;
        }

        int leftchild= tranform(root.left);
        int righchild= tranform(root.right);

       int data= root.data;

       int newleft=root.left==null ? 0 : root.left.data;
       int newright= root.right==null ? 0: root.right.data;

       root.data=newleft+leftchild+newright+righchild;
       return data;

    }

    public static void preoder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }

    public static  void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        tranform(root);
        preoder(root);
    }
}
