import java.util.*;

public class Build {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    /// /
    /// search node
    /// /

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /// /
    /// DeleteNode

    public static Node Delete(Node root, int val) {

        if (root.data > val) {
            root.left = Delete(root.left, val);
        } else if (root.data < val) {
            root.right = Delete(root.right, val);
        } else {
            ///case1
            if (root.left == null && root.right == null) {
                return null;
            }
            /// case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;

            }

            /// case 3
            Node IS = findInorderSuccsser(root.right);
            System.out.println("InorderSuccsser" + IS.data);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }
        return root;

    }


    /// ///////////
    /// print root to leaf
    /// ///////////
    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void rootToleaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        }

        rootToleaf(root.left, path);
        rootToleaf(root.right, path);
        path.remove(path.size() - 1);

    }


    public static void printInRenge(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRenge(root.left, k1, k2);
            System.out.print(root.data + " ");

            printInRenge(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRenge(root.left, k1, k2);
        } else {
            printInRenge(root.right, k1, k2);
        }


    }

    /// ////////
    /// validity check
    /// ///////
    public static Boolean isvalid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data > max.data) {
            return false;
        }

        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
    }

    public static Node findInorderSuccsser(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int values[] = {4, 5, 6, 2, 1, 3};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

//        if(search(root,7)){
//            System.out.print("found");
//        }else{
//            System.out.print("not found");
//        }

//        root= Delete(root,4);
//        inorder(root);
//        printInRenge(root,2,6);

//     rootToleaf(root,new ArrayList<>());

        if (isvalid(root, null, null)) {
            System.out.print("valid");
        } else {
            System.out.print("not valid");
        }
    }
}
