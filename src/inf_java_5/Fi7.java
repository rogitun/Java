package inf_java_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//교육과정 설계
//N은 교욱 순서이고 MY는 나의 수강신청 내역이다. N의 순서가 MY에 적용되었는지 확인한다.
public class Fi7 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        String n = kb.next();
        String my = kb.next();


        Queue<Character> nes = new LinkedList<>();
        for(char x : n.toCharArray()){
            nes.offer(x);
        }

        char compare = ' ';
        String result = "";
        while(!nes.isEmpty()) {
            compare = nes.poll();
            for (char x : my.toCharArray()) {
                if(x==compare) result+=x;
            }
        }
        if(result.equals(n)) System.out.println("YES");
        else System.out.println("NO");

    }
}
