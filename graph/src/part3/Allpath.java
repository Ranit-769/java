package part3;

import java.util.ArrayList;

public class Allpath {
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
        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new  Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }


    public static void findallpaths(ArrayList<Edge> graph[],int src,int dst,String path){
        if(src==dst){
            System.out.print(path+src);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            findallpaths(graph,e.dest,dst,path+src+"->");
        }
    }

    public static  void main(String args[]){
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);
        findallpaths(graph,5,1," ");
    }
}
