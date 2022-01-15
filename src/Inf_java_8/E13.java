package Inf_java_8;

import java.util.Scanner;

public class E13 {
    static int n;
    static int[][] arr;
    static int[] xp = {1,-1,0,0,1,1,-1,-1};
    static int[] yp = {0,0,1,-1,-1,1,-1,1};

    static int result=0;

    public static void dfs(int x,int y){
            for (int i = 0; i < 8; i++) {
                int nx = x + xp[i];
                int ny = y + yp[i];
                if(nx>=0 && ny>=0 && nx<n && ny<n && arr[nx][ny]==1) {
                    arr[nx][ny]=0;
                    dfs(nx, ny);
                }
            }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=kb.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    result++;
                    arr[i][j]=0;
                    dfs(i,j);
                }
            }
        }
        System.out.println(result);

    }
}
