import java.util.*;

public class ActivitySelection_notSorted_End {

    public static void main(String args[]){
        int start[]={10,13,20};
        int end[]={20,25,30};

        int activities[][]= new int [start.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        int maxActivity;
        ArrayList <Integer> ans = new ArrayList<>();


        maxActivity=1;
        int lastend=activities[0][2];
        ans.add(activities[0][0]);

        for(int i=1;i<start.length;i++){
            if(activities[i][1]>= lastend) {
                maxActivity++;
                ans.add(activities[i][0]);
                lastend = activities[i][0];
            }
        }
        System.out.print(maxActivity);


    }
}
