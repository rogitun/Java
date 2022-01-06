package Inf_java_4;

import java.util.HashMap;
import java.util.Scanner;

public class F4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String S = kb.next();
        String T = kb.next();
        HashMap<Character,Integer> hashA = new HashMap<>();
        HashMap<Character,Integer> hashB = new HashMap<>();
        for(char x : T.toCharArray()){
            hashB.put(x,hashB.getOrDefault(x,0)+1);
        }

        char[] arr = S.toCharArray();

        int lp=0;
        int rp=T.length();
        int result = 0;
        for(int i=0;i<=S.length()-T.length();i++){
            while(lp<rp) {
                hashA.put(arr[lp], hashA.getOrDefault(arr[lp], 0) + 1);
                lp++;
            }
            rp++;
            if(hashA.equals(hashB))result++;
            hashA.put(arr[i],hashA.get(arr[i])-1);
            if(hashA.get(arr[i])==0) hashA.remove(arr[i]);
        }
        System.out.println(result);



    }
}
