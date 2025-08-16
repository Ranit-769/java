package supplemental;

import part1.DFS;
import part5.kruskal;

import java.util.ArrayList;
import java.util.Stack;

public class StronglyConnectedComponent {

    static class Edge {
        int src;
        int dest;


        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;


        }
    }
    public static  void create(ArrayList<Edge>[] graph){

        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));


        graph[3].add(new Edge(3,4));

    }

    public static void topologi(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologi(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }


    public static  void  dfs( ArrayList<Edge> transpose[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");

        for(int i=0;i<transpose[curr].size();i++){
            Edge e=transpose[curr].get(i);
            if(!vis[e.dest]){
                dfs(transpose,e.dest,vis);
            }

        }

    }

    public static void kosaraju( ArrayList<Edge> graph[],int V){
        boolean vis[]=new boolean[V];
        Stack<Integer>s=new Stack<>();

        /// step1
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                topologi(graph,i,vis,s);
            }
        }

        /// step2

        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));

            }
        }


        /// /step3---->

        while (!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("scc->");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }

    }


    public static void main(String rags[]){
        int V= 5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create(graph);
        kosaraju(graph,V);
    }
}
