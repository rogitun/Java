package Inf_java_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E9 {

    public static class point{
        int x;
        int y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[][] arr = new int[8][8];
    static int[][] result = new int[8][8];
    static int[] xp = {1,-1,0,0};
    static int[] yp = {0,0,-1,1};

    public static void bfs(point p){
        Queue<point> queue = new LinkedList<>();
        queue.offer(p);
        arr[p.x][p.y]=1;
        while(!queue.isEmpty()){
            point np = queue.poll();
            for(int i=0;i<4;i++){
                int nx = np.x+xp[i];
                int ny = np.y+yp[i];
                if(nx>=1 && ny>=1 && nx<=7 && ny <=7 && arr[nx][ny]==0){
                    arr[nx][ny]=1;
                    queue.offer(new point(nx,ny));
                    result[nx][ny] = result[np.x][np.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                arr[i][j]=kb.nextInt();
            }
        }

        bfs(new point(1,1));
        System.out.println(
                (result[7][7]>0)?result[7][7]:-1);
    }
}
