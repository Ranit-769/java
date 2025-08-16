import   java.util.*;

public class indianCoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,20,50,100,500,1000};

        int count=0;
        int amount=2001;

        ArrayList <Integer> ans =new ArrayList<>();

        Arrays.sort(coins,Comparator.reverseOrder());

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }

        System.out.println(count);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
            System.out.print(" ");
        }
    }
}
