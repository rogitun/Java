package Inf_java_6;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();

        int[] arr = new int[s];
        int[] cache = new int[n];
        
        for(int i=0;i<n;i++){
            cache[i] = kb.nextInt();
        }


        for(int i : cache){
            int j = cacheCheck(i,arr);
            while (j >= 0)
                arr[j + 1] = arr[j--];
            arr[j + 1] = i;
        }


        for(int x:arr){
            System.out.print(x + " ");
        }
    }

    public static int cacheCheck(int key, int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i-1;
        }
        return arr.length-2;
    }
}
