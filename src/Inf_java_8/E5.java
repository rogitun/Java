package Inf_java_8;

import java.math.BigInteger;
import java.util.Scanner;

//거스름돈 알고리즘
public class E5 {

    static int n;
    static int[] arr;
    static int m;
    static int result;
    public static void dfs(int l,int sum){
        if(sum>m || l>result)return;
        if(sum==m){
            result = Math.min(result,l);
            return;
        }
        else{
            for(int i=n-1;i>=0;i--){
                dfs(l+1,sum+arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= kb.nextInt();
        }
        m = kb.nextInt();
        result = n;
        dfs(0,0);
        System.out.println(result);

    }
}
