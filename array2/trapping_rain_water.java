package array2;

public class trapping_rain_water {

    public static void cal_waterTrapped(int hight[]){
        int n=hight.length;
        int width=1;

        int totalWater=0;

        int leftMax[]= new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=hight[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(hight[i],leftMax[i-1]);

        }
       
        rightMax[n-1]=hight[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(hight[i],rightMax[i+1]);
        }

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            int trapped_Water=(waterlevel-hight[i])*width;
            totalWater+=trapped_Water;
        }
        System.out.println("Total water trapped is: "+totalWater);
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        cal_waterTrapped(arr);

    }
}
