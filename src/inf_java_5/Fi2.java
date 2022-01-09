package inf_java_5;

import java.util.Scanner;

//괄호 안의 숫자만 남기기
public class Fi2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        int open = 0;
        int close = 0;

        String result = "";
        for(char x : n.toCharArray()){
            if(x == '(')open++;
            else if(x==')') close++;
            else if (open==close){
                result+=x;
            }
        }

        System.out.println(result);
    }
}
