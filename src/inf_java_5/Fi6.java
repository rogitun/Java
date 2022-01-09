package inf_java_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//큐, 순서 마다 아웃
public class Fi6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int k = kb.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<number;i++){
            queue.add(i+1);
        }
        int cnt =1;
        int tmp = 0;
        while(queue.size()>1){
            if(cnt == k){queue.poll();cnt=1;}
            else{
                tmp = queue.poll();
                queue.offer(tmp);
                cnt++;
            }
        }
        System.out.println(queue.poll());

    }
}
