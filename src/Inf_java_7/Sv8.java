package Inf_java_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sv8 {
    static int result = 0;
    static int[] dis = {1,-1,5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();
    public static int bfs(int s,int e){
       ch = new int[10001];
       ch[s]=1;
       queue.offer(s);
       int level = 0;
       while(!queue.isEmpty()){
           int len = queue.size();
           for(int i=0;i<len;i++){
               int x = queue.poll();
               for(int j : dis){
                   int nx = x+j;
                   if(nx==e) return level+1;
                   if(nx>=1 && nx <=10000 && ch[nx]==0){
                       ch[nx]=1;
                       queue.offer(nx);
                   }
               }
           }
           level++;
       }
       return 0;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();

        System.out.println(bfs(s,e));
    }
}
