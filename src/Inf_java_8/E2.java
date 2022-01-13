package Inf_java_8;

import java.util.Scanner;

public class E2 {

    static int c,w; // w 마리, c는 무게
    static int[] arr;
    static int result = 0;
    public static void dfs(int n,int tmp){
       if(n==w){
           if(tmp<=c && result<tmp)
               result= tmp;
                return;
        }
        else{
            dfs(n+1,tmp+arr[n]);
            dfs(n+1,tmp);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        w = kb.nextInt();
        arr=new int[w];

        for(int i=0;i<w;i++){
            arr[i] = kb.nextInt();
        }

        dfs(0,0);
        System.out.println(result);
    }
}
