package Inf_java_4;

import java.util.HashMap;
import java.util.Scanner;
//아나그램
public class F2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        String result = "YES";
        for (char i : a.toCharArray()) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (char j : b.toCharArray()) {
            if (!hashMap.containsKey(j) || hashMap.get(j) <= 0) {
                result = "NO";
            }
            hashMap.put(j,hashMap.get(j)-1);
        }
        System.out.println(result);
    }
}