import java.util.*;

public class minimundis {
    static class Node {
        int data;
        Node left , right ;

        Node(int data){
            this.data= data;
            this.right= null;
            this.left= null;
        }

    }
    public static Node lca2(Node root, int n1 , int n2){

        if(root== null || root.data== n1 || root.data==n2){
            return root;
        }

       Node leftans= lca2(root.left,n1,n2);
       Node rightans=lca2(root.right,n1,n2);

        if(leftans==null){
            return  rightans;
        }
        if(rightans== null){
            return leftans;
        }
        return root;

    }

    public static  int getdis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data== n){
            return 0;
        }

        int leftdis=getdis(root.left,n);
        int rightdis= getdis(root.right,n);

        if(leftdis==-1 && rightdis==-1){
            return -1;
        } else if (leftdis==-1) {
            return rightdis+1;

        }else {
            return leftdis+1;
        }

    }

    public static int minDis(Node root, int n1,int n2){


        Node lca= lca2(root, n1, n2);
        int dis1= getdis(lca,n1);
        int dis2= getdis(lca, n2);

        return dis1+dis2;

    }

    public static int Kansister(Node root ,int n, int k){
        if(root== null ){
            return -1;
        }
        if(root.data== n){
            return 0;
        }
        int leftdis=Kansister(root.left, n, k);
        int rightdis= Kansister(root.right,n,k);

        if(leftdis==-1 && rightdis==-1){
            return -1;
        }
        int max= Math.max(leftdis,rightdis);
        if(max+1==k){
            System.out.print(root.data);
        }
        return max+1;
    }
    public static  void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        int n1= 4,n2=3;
//        System.out.print(minDis(root,n1,n2));

        int n=5,k=1;
        Kansister(root,n,k);
    }
}
