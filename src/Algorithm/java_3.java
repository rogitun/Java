package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class java_3 {

    public static boolean six(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                return true;
            }
        }
        return false;
    }

    public static int result(int[] arr,int limit,int last){
        int distance=0;
        int cur=0;
        int camp=0;
        int rest=0;

        while(cur<last) {
            if (cur+15<arr.length) {
                int i = cur + 15; int j = cur + 6;
                while (arr[i] != 3) {
                    i--;
                    if(i<=cur)break;
                }
                camp = i;
                while (arr[j] != 2 || arr[j]!=3) {
                    if(arr[j]==3)break;
                    if(arr[j]==2){rest++;break;}
                    j--;
                }
                cur = (j>=camp)?cur:j;
                if (camp - cur > 6) {
                    int index=0;
                    if(six(Arrays.copyOfRange(arr,cur+1,cur+6))){
                        index = cur+6;
                        while(arr[index]!=2){
                            index--;
                        }
                        cur = index;
                    }
                    else {
                        index = camp - 1;
                        while (arr[index] != 3) {
                            index--;
                        }
                        cur = index; rest--;
                    }
                } else {
                    cur = camp;
                }
            } else {
                cur= limit-16;
            }
        }
        if(cur!=last) return -1;
        else return cur+rest+1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tcase = kb.nextInt();
        int xnum;
        int x=0;
        int[] arr = new int[100000];
        int please=0;
        for(int i=0;i<tcase;i++){
            xnum=kb.nextInt();
            for(int j=0;j<xnum;j++){
                arr[j]=kb.nextInt();
                if(arr[j]==3)x=j;
            }
            please = result(arr,xnum,x);
            System.out.println("#" + (i+1) + " " + please);
        }
    }
}
