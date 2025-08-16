import java.util.*;

public class ActivitySelection {

    public static void main(String args[]){

        int start[]={10,12,20};
        int end[]={20,25,30};

        int maxActivity;

        ArrayList <Integer> ans= new ArrayList<>();

        maxActivity=1;
        ans.add(0);

        int lastend=end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                ans.add(i);
                maxActivity++;
                lastend=end[i];
            }

        }

        System.out.print(maxActivity);

    }
}
