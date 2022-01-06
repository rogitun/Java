package Inf_Java;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        int lt=0;
        int sum=0;
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            sum+=arr[i];
            if(sum==m){
                count++;
                sum-=arr[lt++];
            }
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) count++;
            }

        }

        System.out.println(count);


    }
}
