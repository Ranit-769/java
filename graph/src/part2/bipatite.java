package part2;

import com.sun.jdi.connect.spi.TransportService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bipatite {
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


        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,1,1));

       graph[4].add(new  Edge(4,2,1));
       graph[4].add(new Edge(4,3,1));


    }

    public static  boolean isbipatite(ArrayList<Edge> graph[]) {

        int colo[] = new int[graph.length];
        for (int i = 0; i < colo.length; i++) {
            colo[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (colo[i] == -1) {
                q.add(i);
                colo[i]=0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0;j< graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(colo[e.dest]==-1){
                            int nextcolo=colo[curr]==0 ?1:0;
                             colo[e.dest]=nextcolo;
                             q.add(e.dest);
                        } else if (colo[e.dest]==colo[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        create(graph);
        System.out.println(isbipatite(graph));
    }
}
