package Inf_Java;

import java.util.Scanner;
//sliding window
//연속된 N일 동안의 최대 매출 기록을 구하는 알고리즘
public class T3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        int start =0;
        int end = 0;

        int sum =0;
        int max =0;
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            sum += arr[i];
            end++;
            if(end-start == k){
                if(sum > max){
                    max = sum;
                }
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(max);
    }
}
