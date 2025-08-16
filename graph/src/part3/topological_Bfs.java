package part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topological_Bfs {

    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

    public static void calculateinorder(ArrayList<Edge> graph[],int inorder[]){

        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e= graph[v].get(j);
                inorder[e.dest]++;
            }
        }
    }

    public static  void topology(ArrayList<Edge> graph[]){
        Queue<Integer> q=new LinkedList<>();
        int inorder[]=new int[graph.length];

        calculateinorder(graph,inorder);

        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==0){
                  q.add(i);
            }
        }

        while (!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e= graph[curr].get(i);
                inorder[e.dest]--;
                if(inorder[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }


    public static void main(String args[]){
        int v=6;
        ArrayList<Edge> [] graph= new ArrayList[v];
        create(graph);
        topology(graph);
    }
}
