package Inf_java_8;

import java.util.Scanner;

public class E8 {
    static int[][] arr = new int[8][8];
    static int[] xp = {1,-1,0,0};
    static int[] yp = {0,0,-1,1};
    static int route = 0;
    public static void dfs(int x,int y){
        if(x==7 && y==7){
            route++;
            return;
        }
        else{
            for(int i=0;i<4;i++){
                int nx = x+xp[i];
                int ny = y+yp[i];
                if(nx>=1 && ny>=1 && nx<=7 && ny <= 7 && arr[nx][ny]==0){
                    arr[nx][ny]=1;
                    dfs(nx,ny);
                    arr[nx][ny]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a =0 ;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        arr[1][1]=1;
        dfs(1,1);
        System.out.println(route);
    }
}
