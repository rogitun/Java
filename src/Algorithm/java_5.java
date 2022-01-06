package Algorithm;

import java.util.Scanner;

public class java_5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number=kb.nextInt();
        for(int x=0;x<number;x++){

        int v=0;
        int v2=0;
        int e=0;
        int iter = kb.nextInt();
        int INF = 100001;
        int[][] arr = new int[iter+1][iter+1];

            for(int i=1;i<=iter;i++){
                for(int j=1;j<=iter;j++) {
                    arr[i][j] = INF;
                }
            }


        for(int i=0;i<iter-1;i++){
            v = kb.nextInt();
            v2 = kb.nextInt();
            e = kb.nextInt();
            arr[v][v2] = e;
            arr[v2][v] = e;
        }

        int min = Integer.MAX_VALUE;
        int sum =0 ;
        int count =1;
        int test =0 ;
        for(int i=1;i<=iter;i++){
            for(int j=1;j<=iter;j++){
                for(int k=1;k<=iter;k++){
                    if((arr[j][k]>arr[j][i]+arr[i][k])) {
                        if(arr[j][i]!=INF && arr[i][k]!=INF){
                            arr[j][k] = arr[j][i] + arr[i][k];
                        }
                    }
                }
            }
        }

        for(int i=1;i<=iter;i++){
            for(int j=1;j<=iter;j++){
                if(i!=j){
                    sum += arr[j][i];
                }

            }
            if(min==sum)count++;
            min = (sum<min)?sum:min;
            sum=0;

        }

        System.out.println("#" + (x+1) + " " + count + " " + min);

        }
    }
}
