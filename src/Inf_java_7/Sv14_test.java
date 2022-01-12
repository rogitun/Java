package Inf_java_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//이전의 Sv14_bfs를 Arraylist가 아닌 단순 배열로 했을시 어떻게 다른지 비교 용도.
public class Sv14_test {
        static int[] result;
        static int[] visited;
        static int n;
        static int[][] arr;

        public static void bfs(int v) {
            Queue<Integer> queue = new LinkedList<>();
            visited[v] = 1;
            result[v] = 0;
            queue.offer(v);
            while (!queue.isEmpty()) {
                int tmp = queue.poll();
                for(int i=2;i<=n;i++){
                    if(arr[tmp][i]!=0 && visited[i]!=1){
                        queue.offer(i);
                        visited[i] = 1;
                        result[i] = result[tmp]+1;
                    }
                }
            }
        }


        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            n = kb.nextInt();
            int m = kb.nextInt();
            visited = new int[n + 1];
            result = new int[n + 1];
            arr = new int[n+1][n+1];
            int a, b;


            for (int i = 0; i < m; i++) {
                a = kb.nextInt();
                b = kb.nextInt();
                arr[a][b] = 1;
            }

            bfs(1);

            for (int i = 1; i <= n; i++) {
                System.out.println(i + " : " + result[i]);
            }
        }
    }

