package inf_java_5;

import java.util.Scanner;
import java.util.Stack;
//크레인 인형뽑기(카카오)
public class Fi3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        int M = kb.nextInt();
        int[] moves = new int[M];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<M;i++){
            moves[i] = kb.nextInt();
        }
        int result = 0;

        for(int x : moves){
            int down =0;
            while(down < N && arr[down][x-1]==0){
                down++;
            }
            if(down < N){
                if(!stack.isEmpty() && stack.peek() ==arr[down][x-1]){
                    stack.pop();
                    result+=2;
                }
                else stack.push(arr[down][x-1]);
                arr[down][x-1] = 0;
            }

        }
        System.out.println(result);

    }
}
