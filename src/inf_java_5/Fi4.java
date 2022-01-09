package inf_java_5;

import java.util.Scanner;
import java.util.Stack;

public class Fi4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String state = kb.next();
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int a,b=0;
        for(char x : state.toCharArray()){
            char tmp = x;
            switch (tmp){
                case '+':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a+b);
                    break;
                case '*':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a*b);
                    break;
                case '-':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b-a);
                    break;
                case '/':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.push(Character.getNumericValue(tmp));
                    break;
            }
        }
        System.out.println(stack.pop());

    }
}
