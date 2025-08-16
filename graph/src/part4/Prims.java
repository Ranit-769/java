package part4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));



        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));


    }

    static class pair implements  Comparable<pair>{
         int vertex;
         int cost;

        public pair(int v,int c){
            this.vertex=v;
            this.cost=c;
        }

        @Override
        public  int compareTo(pair p2){
            return this.cost-p2.cost;
        }
    }

    public static  void MSt(ArrayList<Edge> graph[]){
          boolean vis[]=new boolean[graph.length];
          PriorityQueue<pair>pq=new PriorityQueue<>();
          pq.add(new pair(0,0));
          int finalcost=0;
          ArrayList<Integer> edge=new ArrayList<>();

          while (!pq.isEmpty()){
              pair curr= pq.remove();
              if(!vis[curr.vertex]){
                  vis[curr.vertex]=true;
                  finalcost+= curr.cost;
                   edge.add(curr.vertex);////do it later

                  for(int i=0;i<graph[curr.vertex].size();i++){
                      Edge e=graph[curr.vertex].get(i);
                      pq.add(new pair(e.dest,e.wt));
                  }
              }
          }

          System.out.println("min cost:"+finalcost);
          System.out.print("edges are"+edge);


    }


    public  static  void main(String args[]){
        int v=4;
        ArrayList<Edge> garph[]=new ArrayList[v];
        create(garph);
        MSt(garph);
    }

}
