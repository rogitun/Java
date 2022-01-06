package Inf_java_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class F3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = kb.nextInt();
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int rp = K;
        int lp = 0;

        for(int i=0;i<=N-K;i++) {
            while (lp < rp) {
                hashMap.put(arr[lp], hashMap.getOrDefault(arr[lp], 0) + 1);
                lp++;
            }
            rp++;
            arrayList.add(hashMap.size());
            hashMap.put(arr[i],hashMap.get(arr[i])-1);
            if(hashMap.get(arr[i])==0)
                hashMap.remove(arr[i]);
        }
        for(int x:arrayList){
            System.out.print(x+ " ");
        }
    }
}
