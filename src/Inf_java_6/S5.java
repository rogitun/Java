package Inf_java_6;

import java.util.HashMap;
import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);

        int n = kb.nextInt();

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int i1;
        for(int i=0;i<n;i++){
            i1 = kb.nextInt();
            hashMap.put(i1,hashMap.getOrDefault(i1,0)+1);
        }
        char result = 'U';
        for(int x : hashMap.values()){
            if(x>1){result='D'; break;}

        }
        System.out.println(result);
    }
}
