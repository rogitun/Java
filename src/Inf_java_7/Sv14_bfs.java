package Inf_java_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sv14_bfs {
    static int[] result;
    static int[] visited;
    static int n;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = 1;
        result[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int next : graph.get(temp)){
                if(visited[next]!=1){
                    visited[next]=1;
                    queue.offer(next);
                    result[next] = result[temp]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int m = kb.nextInt();
        visited = new int[n+1];
        result = new int[n+1];
        int a,b;

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            a= kb.nextInt();
            b = kb.nextInt();
            graph.get(a).add(b);
        }

        bfs(1);

        for(int i=1;i<=n;i++){
            System.out.println(i + " : " + result[i]);
        }
    }
}
