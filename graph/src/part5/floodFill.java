package part5;

import  java.util.*;
public class floodFill {

    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][],int orgcolor){

        if(sr<0|| sc<0 || sr>= image.length || sc>= image[0].length
                                           ||  vis[sr][sc] || image[sr][sc]!=orgcolor){
            return;
        }
//        vis[sr][sc]=true;
        image[sr][sc]=color;

        /// left
        helper(image, sr, sc-1, color, vis, orgcolor);
        /// right
        helper(image, sr, sc+1, color, vis, orgcolor);
        /// /up
        helper(image, sr-1, sc, color, vis, orgcolor);
        /// down
        helper(image, sr+1, sc, color, vis, orgcolor);
    }

    public static  int[][] flood(int image[][],int sr,int sc,int color){
            boolean vis[][]=new boolean[image.length][image[0].length];
            helper(image,sr,sc,color,vis,image[sr][sc]);
            return image;
    }

    public static  void main(String args[]){

        int image[][]={{1,1,1},{1,1,0},{1,0,1}};

        System.out.println(Arrays.deepToString(flood(image, 1, 1, 2)));



    }
}
