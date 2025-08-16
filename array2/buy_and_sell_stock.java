package array2;

public class buy_and_sell_stock {

    public static int profit_cal(int price[]){

        int buy_Stock=Integer.MAX_VALUE;
        int max_profit=0;

        for(int i=0;i<price.length;i++){
            if(buy_Stock<price[i]){
                int profit=price[i]-buy_Stock;
                System.out.println(i+"="+ profit);
                max_profit=Math.max(profit,max_profit);
            }
            else{
                buy_Stock=price[i];
            }
            
        }
        if(max_profit>0){
            return max_profit;
        }
        return 0;

    }

    public static void main(String args[]){
        int price[]={7, 1, 5, 3, 6, 4};
        int profit=profit_cal(price);
        if(profit==0){
            System.out.println("No Profit Possible");
        }
        System.out.println("Maximum Profit: "+profit);

    }
    
}
