package Inf_java_6;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        int[] arr = new int[number];

        for(int i=0;i<number;i++){
            arr[i] = kb.nextInt();
        }
        int key;
        for(int i=1;i<number;i++){
            int j = i-1;
            key = arr[i];
            while(j>=0 && arr[j]>key) arr[j+1]=arr[j--];
            arr[j+1]= key;

        }
        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
