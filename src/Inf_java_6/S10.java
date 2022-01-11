package Inf_java_6;

import java.util.Arrays;
import java.util.Scanner;

public class S10 {
    public static int count(int[] arr, int mid) {
        int cnt = 1;
        int ep = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-ep>=mid){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = kb.nextInt();
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];
        int result = 0;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)>=c){
                result = mid;
                lt = mid+1;
            }
            else{
                rt = mid-1;
            }
        }


        System.out.println(result);
    }


}
