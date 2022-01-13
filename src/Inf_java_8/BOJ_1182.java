package Inf_java_8;

import java.util.Scanner;
//백준1182번
public class BOJ_1182 {

    static int[] arr;

    static int n,s;
    static int result=0;
    public static void dfs(int l,int sum){
        if(l==n){
            if(sum==s)result++;
            return;
        }
        else{
            dfs(l+1,sum+arr[l]);
            dfs(l+1,sum);
        }

    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        s = kb.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }

        dfs(0,0);
        if(s==0)result--;
        System.out.println(result);
    }
}
