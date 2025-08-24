package dp3;

import java.util.HashSet;

public class LCS {

   static HashSet<Character> s=new HashSet<>();
 /// use hash map???? do this later
 ///

    public static  int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }


        if(str1.charAt(n-1)== str2.charAt(m-1) ){
            s.add(str1.charAt(n-1));

            return lcs(str1, str2, n-1, m-1)+1;
        }
        else {
            int ans1=lcs(str1, str2, n-1, m);
            int ans2=lcs(str1, str2, n, m-1);
            return  Math.max(ans1,ans2);
        }

    }


    /// /lcs with memorization
    ///
    public static  int lcs2(String str1,String str2,int n,int m){

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for (int j = 0; j < m+1; j++) {
                dp[i][j]=-1;
            }
        }

        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(str1.charAt(n-1)== str2.charAt(m-1) ){
//            s.append(str1.charAt(n-1));

            return dp[n][m]=lcs2(str1, str2, n-1, m-1)+1;
        }
        else {
            int ans1=lcs2(str1, str2, n-1, m);
            int ans2=lcs2(str1, str2, n, m-1);
            return  dp[n][m]=Math.max(ans1,ans2);
        }

    }

    public static  int tabuletrLCS(String str1,String str2){
        int n= str1.length();
        int m= str2.length();
        int [][] dp= new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;

                    } else {
                        int ans1 = dp[i - 1][j];
                        int ans2 = dp[i][j - 1];

                        dp[i][j] = Math.max(ans1, ans2);
                    }
            }
        }
            return dp[n][m];
        }



    public static  void main(String rags[]){
        String str1="abcdefg";
        String str2="abdeg";
//        System.out.println(lcs(str1,str2,str1.length(),str2.length()));
//        System.out.println(s);

//        System.out.println(lcs2(str1,str2,str1.length(),str2.length()));
        System.out.println(tabuletrLCS(str1,str2));

    }
}
