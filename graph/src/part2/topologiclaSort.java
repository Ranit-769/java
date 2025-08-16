package part2;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Stack;

public class topologiclaSort {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static  void create(ArrayList<Edge>[] graph){

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

    public  static  void topoSort(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s =new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topoSortutil(graph,i,vis,s);
            }
        }

        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }
    public  static  void topoSortutil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){

        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                topoSortutil(graph, e.dest, vis, s);
            }
        }
        s.add(curr);
    }

    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        create(graph);
        topoSort(graph);

    }
}
