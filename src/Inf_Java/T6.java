package Inf_Java;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int sum = 0;
        int count = 0;
        int lp = 0;


        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            if(arr[i]==0) count++;
            while(count>k){
                if(arr[lp]==0)count--;
                lp++;
            }
            sum = (sum>i-lp+1)?sum:(i-lp+1);

        }

        System.out.println(sum);

    }
}
