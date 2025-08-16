public class hight_calculate {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public static int hight(Node root){
        if(root == null){
            return 0;
        }
        int  lp=  hight(root.left);
        int  rp=  hight(root.right);

     return Math.max(lp,rp)+1;
    }


    /// count of nodes

    public static  int count(Node root){
        if(root==null){
            return 0;

        }
         int leftcount = count(root.left);
        int rightcount= count(root.right);

        return (leftcount+rightcount)+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftsum=sum(root.left);
        int rightsum= sum(root.right);

        return leftsum+rightsum+ root.data;
    }

/// /
/// approch1
///
    public static int diamiter2(Node root ){      /// O(n^2) time
        if(root== null){
            return 0;
        }
        int leftdia= diamiter2(root.left);
        int lh= hight(root.left);
        int rightdia= diamiter2(root.right);
        int rh= hight(root.right);

        int selfdia= lh+rh+1;

        return Math.max(selfdia,Math.max(leftdia,rightdia));


    }

/// /
/// approch 2
///
    static class InFo{
        int diam;
        int ht;

        public InFo(int diam ,int ht){
            this.diam=diam;
            this.ht= ht;
        }
    }

    public static InFo diamiter(Node root){     /// O(n) time

        if(root == null){
            return  new InFo(0,0);
        }
        InFo leftInFo= diamiter(root.left);
        InFo rightInFo= diamiter(root.right);

        int diam= Math.max(leftInFo.ht+rightInFo.ht+1, Math.max(leftInFo.diam,rightInFo.diam));
        int ht= Math.max(leftInFo.ht,rightInFo.ht)+1;

        return new InFo(diam,ht);
    }


    public static  boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return  true;
        }
        if(node == null || subroot==null|| node.data != subroot.data){
            return false;
        }

        if(! isIdentical(node.left, subroot.left)){
            return false;
        }
        if(! isIdentical(node.right,subroot.right)){
            return false;
            }

        return true ;

    }

    public static boolean isSubtree(Node root, Node subroot){

       if(root == null ){
           return  false;

       }
       if(root.data == subroot.data){
           if(isIdentical(root,subroot)){
               return true;
           }
       }
       return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

//       System.out.print(hight(root));
//       System.out.print(sum(root));

//       System.out.print(diamiter(root).diam);

         Node subroot = new Node (2);
         subroot.left= new  Node(4);
         subroot.right = new Node(5);


         System.out.print(isSubtree(root,subroot));


    }
}
