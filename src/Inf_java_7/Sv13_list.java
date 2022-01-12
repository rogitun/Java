package Inf_java_7;

//경로 탐색 - 인접리스트
//n이 커질수록 인접행렬로 표현하기가 어려워진다.

import java.util.ArrayList;
import java.util.Scanner;

public class Sv13_list {
    static int n;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visited;
    static int result = 0;
    public static void dfs(int v){
        if(v==n) result++;
        else{
            for(int next : graph.get(v)){
               if(visited[next]!=1){
                   visited[next]=1;
                   dfs(next);
                   visited[next]=0;
               }
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int m = kb.nextInt();

        graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        visited = new int[n+1];

        for(int i=0;i<m;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
       visited[1]=1;
        dfs(1);
        System.out.println("result = " + result);
    }
}
