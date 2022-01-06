package Inf_java_4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class F5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = kb.nextInt();
        }
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<=N-2;i++){
            for(int j=i+1;j<=N-1;j++){
                for(int k=j+1;k<N;k++){
                    treeSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int count =0;
        int result=-1;
        for(int x: treeSet){
            count++;
            if(count==K)result=x;
        }
        System.out.println(result);
    }
}
