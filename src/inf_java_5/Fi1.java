package inf_java_5;

import java.util.Scanner;
import java.util.Stack;

public class Fi1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        Stack<Character> stack = new Stack<Character>();
        for(char x : n.toCharArray()){
            if(x == '(')
                stack.push(x);
            else if(x == ')') {
                if(stack.isEmpty()){
                    stack.push(x);
                    break;}
                else stack.pop();
            }
        }
        if(stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");

    }
}
