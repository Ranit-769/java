import java.util.*;

public class max_chAIN {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int maxlength=1;

        int lastSelect_end=pairs[0][1];

        for(int i=1;i< pairs.length;i++){
            if(pairs[i][0]>lastSelect_end){
                maxlength++;
                lastSelect_end=pairs[i][1];
            }
        }
        System.out.print(maxlength);
    }
}
