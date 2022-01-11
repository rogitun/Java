package Inf_java_6;

import java.util.Arrays;
import java.util.Scanner;

public class S9 {
    public static int count(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for(int i: arr){
            if(sum+i > mid){
                count++;
                sum=i;
            }
            else sum += i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= kb.nextInt();

        int result = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //최대값 구하기
        int rt = Arrays.stream(arr).sum(); //배열 값 모두 합하기
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                result=mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }
        System.out.println(result);

    }


}
