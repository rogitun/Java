package Inf_java_8;

import java.util.ArrayList;
import java.util.Scanner;

public class E3 {
    public static class ques{
        int score;
        int time;
        public ques(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }


    static int n,m;
    static ArrayList<ques> arrayList = new ArrayList<>();
    static int result =0;

    public static void dfs(int l,int s,int t){
        if(l==n){
            if(t<=m) {
                result = Math.max(result, s);
                return;
            }
        }
        else{
            dfs(l+1,s+arrayList.get(l).score,t+arrayList.get(l).time);
            dfs(l+1,s,t);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int a,b;

        for(int i=0;i<n;i++){
            a= kb.nextInt();
            b= kb.nextInt();
            arrayList.add(new ques(a,b));
        }
        dfs(0,0,0);
        System.out.println(result);


    }
}
