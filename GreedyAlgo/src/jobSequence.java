import java.util.*;

public class jobSequence {
    static class job {
        int id;
        int profit;
        int deadLine;

        job(int i, int p, int d) {
            id = i;
            profit = p;
            deadLine = d;
        }
    }

        public static void main(String args[]){
            int jobsinfo[][]={{4,20},{1,10},{1,40},{1,30}};

            ArrayList <job> jobs = new ArrayList<>();

            for(int i=0;i<jobsinfo.length;i++){
                jobs.add(new job(i, jobsinfo[i][1],jobsinfo[i][0] ));
            }

            ArrayList <Integer> seq =new ArrayList<>() ;

            Collections.sort(jobs,  (obj1 , obj2)-> obj2.profit- obj1.profit);

            int time=0;

            for(int i=0;i<jobs.size();i++){
                job cur = jobs.get(i);
                if(cur.deadLine > time){
                   seq.add(cur.id);
                   time++;
                }
            }
            System.out.println(seq.size());
            for(int i=0;i<seq.size();i++){
                System.out.print(seq.get(i)+" ");
            }
            System.out.println();

        }
    }

