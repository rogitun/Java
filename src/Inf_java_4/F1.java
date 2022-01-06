package Inf_java_4;

import java.util.*;

public class F1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        String input = kb.next();

        for(char i : input.toCharArray()){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        char result= ' ';
        int max = Integer.MIN_VALUE;
        for(char j : hashMap.keySet()){
            if(hashMap.get(j) > max){
                max = hashMap.get(j);
                result = j;
            }
        }

        System.out.println(result);
    }
}
