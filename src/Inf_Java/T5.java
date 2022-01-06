package Inf_Java;

import java.util.Scanner;
//연속된 자연수의 합
public class T5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int sum =0;
        int lp = 1;
        int count = 0;
        //2개 이상의 연속된 수의 합이기 때문에 i가 n까지 갈 필요 없이 n/2 +1까지만 가면 된다.
        for(int i=1;i<=(n/2)+1;i++){
            sum+=i;
            if(sum==n){
                count++;
            }
            while(sum>=n){
                sum-=lp++;
                if(sum==n){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
