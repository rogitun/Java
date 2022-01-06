package Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class java_4 {

    public static int conquer(int a,int b, int[][] arr, boolean[] visited,boolean[] visited2,int crash) {
        int n = arr.length - 1;
        int out =0 ;

        Queue<Integer> aq = new LinkedList<>();
        Queue<Integer> bq = new LinkedList<>();

        aq.add(a);
        bq.add(b);
        visited[a] = true;
        visited[b] = true;
        visited2[b] = true;
        visited2[a] = true;

        while (!aq.isEmpty() && !bq.isEmpty()) {
            if(aq.peek()!=null && aq.peek()==bq.peek()){
                aq.poll();
                out = bq.poll();
//                for(int k=1;k< arr.length-1;k++){
//                    if(arr[out][k]!=0 || arr[k][out] !=0) {
//                        arr[out][k] = 0;
//                        arr[k][out] = 0;
//                    }
//                }
                crash++;
            }
            a = (aq.peek()==null)?0: aq.poll();
            b = (bq.peek()==null)?0: bq.poll();

            for (int i = 1; i <= n; i++) {
                if (arr[a][i] == 1 && !visited[i]) {
                    aq.add(i);
                    visited[i] = true;
                }
                if(arr[b][i] == 1 && !visited2[i]){
                    bq.add(i);
                    visited2[i] = true;
                }
            }
        }
        return crash;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        for(int l=0;l<limit;l++){
            int crash =0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            boolean visited[] = new boolean[n + 1];
            boolean visited2[] = new boolean[n+1];
            int[][] arr = new int[n+1][n+1];


            for(int i = 0; i < m; i++) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();

                arr[v1][v2] = 1;
                arr[v2][v1] = 1;
            }
            crash = conquer(A,B,arr,visited,visited2,crash);

            int anum = 0;
            int bnum = 0;
            int both=0;

            for(int x=1;x<=n;x++) {
                if (visited[x]) anum++;
                if (visited2[x]) bnum++;
                if(visited[x]==false&&visited2[x]==false) both++;
            }

            anum-=(crash+1); bnum-=(crash+1);
            //System.out.println(anum + "/" + bnum + "/ crash = " + crash);
            if(anum<(n/2)){
                if((anum+both+crash)>(n/2))both=both+crash;
                else both=-1;
            }

            System.out.println("#" + (l+1) + " " +crash + " " + both);
        }
        }

}
