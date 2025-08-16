package part1;

import java.util.ArrayList;

public class hasPath {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static  void create(ArrayList<Edge>[] graph){

        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new  Edge(3,5,1));
        graph[3].add(new  Edge(3,4,1));
        graph[3].add(new  Edge(3,1,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));


//        System.out.println("hello");

    }

    public static  boolean ispath(ArrayList<Edge>[] graph, int src, int dst,boolean visit[]){
        if(src==dst){
            return  true;
        }
        visit[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            if(!visit[e.dest] && ispath(graph,e.dest,dst,visit)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){

        int v=7;
        ArrayList<Edge>[] graph= new ArrayList[v];
        create(graph);
        boolean ans=ispath(graph,0,7,new boolean[graph.length]);
        System.out.println(ans);




    }
}
