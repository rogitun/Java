package inf_java_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fi8 {
    public static class person{
        int id;
        int prior;
        public person(int id, int prior) {
            this.id = id;
            this.prior = prior;
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int result = 1;
        Queue<person> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(new person(i,kb.nextInt()));
        }
        while(!q.isEmpty()){
            person tmp = q.poll();
            for(person x : q){
                if(x.prior > tmp.prior){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.id==m) break;
                else result++;
            }
        }
        System.out.println(result);


    }
}
