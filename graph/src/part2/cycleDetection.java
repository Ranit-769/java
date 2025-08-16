package part2;

import java.util.ArrayList;

public class cycleDetection {

    static  class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static  void crate(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
       /// graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));


        graph[2].add(new Edge(2,1,1));
        //graph[2].add(new Edge(2,0,1));

        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,3,1));
    }

    public static  boolean detectcycle(ArrayList<Edge> graph[]){
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!visit[i]){
                if(detectcycleutil(graph,visit,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectcycleutil(ArrayList<Edge>[]graph,boolean visit[],int curr,int par){
        visit[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            /// case 3
            if(!visit[e.dest]){
                if(detectcycleutil(graph, visit, e.dest, curr)){
                    return  true;
                }
            }

            /// case 1
            else if(visit[e.dest] && e.dest!=par){
                return true;
            }
            /// case 2-> continue
        }
      return  false;
    }


    public static  void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph=new  ArrayList[v];
        crate(graph);
        System.out.print(detectcycle(graph));

    }
}
