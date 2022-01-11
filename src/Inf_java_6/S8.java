package Inf_java_6;

import java.util.Arrays;
import java.util.Scanner;
//이분탐색
public class S8 {

    public static void bin(int[] array, int key,int low ,int high) {
        int middle = (high+low)/2;
        if(array[middle]==key){
            System.out.println(middle+1);
        }
        else if(array[middle] > key){
            bin(array,key,low,middle-1);
        }
        else{
            bin(array,key,middle+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int result=0;
        bin(arr,m,0,arr.length);

    }
}
