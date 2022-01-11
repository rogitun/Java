package Inf_java_6;

import java.util.Arrays;
import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            }
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        for(int i=0;i<n;i++){
                if(arr[i]!= arr2[i]) System.out.print((i+1) + " ");
        }


        }
    }

