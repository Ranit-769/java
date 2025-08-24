package dp5;

public class Wildcard {

    public static  boolean isMatch(String s, String p){
        int n=s.length();
        int m = p.length();

        boolean dp[][]= new boolean[n+1][m+1];
        /// s==0 && p==0
        dp[0][0]=true;

        /// s>0 &&& p==0
        for (int i = 1; i <n+1 ; i++) {
            dp[i][0]=false;
        }

        /// p>0 && s==0
        for (int j = 1; j < m+1; j++) {
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        /// bottomUP
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j < m+1; j++) {
                //case 1

                   if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                       dp[i][j]=dp[i-1][j-1];
                   }
               //case 2

                   else if (p.charAt(j-1)=='*') {
                       dp[i][j]=dp[i][j-1] || dp[i-1][j];
                   }

              //case 3

                else {
                    dp[i][j]=false;
                   }

            }
        }
        p(dp);
        return  dp[n][m];
    }

    public static void p(boolean dp[][]){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  static  void main(String rags[]){
        String s="aabbaba";
        String p="****??b******ba";
        System.out.println(isMatch(s,p));
    }
}
