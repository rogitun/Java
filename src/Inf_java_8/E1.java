package Inf_java_8;

import java.util.HashMap;
import java.util.Scanner;

public class E1 {
    static String result = "NO";
    static int n;
    static int number=0;
    static boolean flag = false;
    public static void dfs(int L,int sum,int[] arr){
        if(flag && sum>number/2)return;
        if(L==n){
            if((number-sum)==sum){
                result="YES";
                flag=true;
            }

        }
        else{
            dfs(L+1,sum+arr[L],arr);
            dfs(L+1,sum,arr);
        }


    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] array;
        n = kb.nextInt();
        array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = kb.nextInt();
            number+=array[i];
        }

        dfs(0,0,array);
        System.out.println(result);



    }
}
