package Inf_java_7;

import java.util.Scanner;

public class Sv12_dfs {
    //경로탐색

    static int[][] arr;
    static int[] visited;
    static int n;
    static int result =0;
    public static void dfs(int start){
        if(start==n) result++;
        else
            for(int i=2;i<=n;i++){
                if(arr[start][i]!=0 && visited[i]!=1){
                    visited[i]=1;
                    dfs(i);
                    visited[i]=0;
                }
            }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int m = kb.nextInt();
        arr = new int[n+1][n+1];
        visited = new int[n+1];
        int a,b;
        for(int i=0;i<m;i++){
            a= kb.nextInt();
            b = kb.nextInt();
            arr[a][b]=1;
        }
        dfs(1);
        System.out.println("result = " + result);

    }
}
