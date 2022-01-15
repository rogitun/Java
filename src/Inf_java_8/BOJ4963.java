package Inf_java_8;

import java.util.Scanner;

public class BOJ4963 {
    static int w;
    static int h;
    static int[][] arr;
    static int[] xp = {1,-1,0,0,1,1,-1,-1};
    static int[] yp = {0,0,1,-1,-1,1,-1,1};



    public static void dfs(int x,int y){
        for (int i = 0; i < 8; i++) {
            int nx = x + xp[i];
            int ny = y + yp[i];
            if(nx>=0 && ny>=0 && nx<h && ny<w && arr[nx][ny]==1) {
                arr[nx][ny]=0;
                dfs(nx, ny);
            }
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            w = kb.nextInt(); //열
            h = kb.nextInt(); //행
            if(w==0 && h==0) break;
            arr = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    arr[i][j] = kb.nextInt();
                }
            }
            int result=0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1) {
                        result++;
                        arr[i][j] = 0;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(result);

        }
    }
}
