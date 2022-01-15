package Inf_java_8;

import javax.swing.text.html.HTMLDocument;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E11 {
    public static class Point{
        int x,y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int n;
    static int m;
    static int arr[][];
    static int days[][];

    static int[] xp = {1,-1,0,0};
    static int[] yp = {0,0,1,-1};
    static Queue<Point> queue = new LinkedList<>();
    public static void bfs(){
        while(!queue.isEmpty()){
            Point now = queue.poll();
            for(int i=0;i<4;i++){
                int nx = now.x + xp[i];
                int ny = now.y + yp[i];
                if(nx >=0 && nx<m && ny >=0 && ny<n && arr[nx][ny]==0){
                    arr[nx][ny]=1;
                    queue.offer(new Point(nx,ny));
                    days[nx][ny] = days[now.x][now.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        n= kb.nextInt();
        m=kb.nextInt();
        arr=new int[m][n];
        days= new int[m][n];
        Point start=new Point(0,0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= kb.nextInt();
                if(arr[i][j]==1) queue.offer(new Point(i,j));
            }
        }
        bfs();
        int result = -1;
        boolean flag= true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) flag=false;
            }
        }

        if(flag){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    result=Math.max(result,days[i][j]);
                }
            }
        }
        System.out.println(result);
    }
}
