import java.util.*;

public class chocola {

    public  static void main(String args[]){
        int n=4,m =6;

        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());


        int h=0,v=0;
        int hp=1,vp=1;

        int finalcost=0;


        while(v<costVer.length && h<costHor.length){
            if(costHor[h]<= costVer[v]){
                finalcost+=(costVer[v]*hp);
                vp++;
                v++;

            }
            else{
                finalcost+=(costHor[h]*vp);
                hp++;
                h++;
            }
        }
        while(v<costVer.length){
            finalcost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        while(h<costHor.length){
            finalcost+=(costHor[h]*vp);
            hp++;
            h++;
        }

        System.out.print(finalcost);
    }

}
