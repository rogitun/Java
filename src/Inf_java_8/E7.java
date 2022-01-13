package Inf_java_8;

import java.util.Scanner;

public class E7 {
    static int[][] dp;
    public static int dfs(int n,int r){
        if(dp[n][r]!=0) return dp[n][r];
        if(n==r || r==0)return 1;
        else return dp[n][r]=dfs(n-1,r-1)+dfs(n-1,r);
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int r = kb.nextInt();
        dp = new int[n+1][n+1];
        System.out.println(dfs(n,r));
    }
}
