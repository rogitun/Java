package inf_java_5;

import java.util.Scanner;
import java.util.Stack;
//쇠막대기 백준 10799
public class Fi5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '(')
                stack.push(n.charAt(i));
            else{
                if(n.charAt(i-1) == '('){
                    stack.pop();
                    result += stack.size();
                }
                else{
                    result+=1;
                    stack.pop();
                }
            }
        }
        System.out.println(result);
    }
}
