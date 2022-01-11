package Inf_java_7;

import java.util.Scanner;

public class JustTest {

    public static void recur(int n){
        if(n==0){
            return;
        }
        else{
            recur(n-1);
            System.out.println(n);
        }
    }

    public static void binRecur(int n){
        if(n<=0){
            return;
        }
        else{
            binRecur(n/2);
            System.out.print(n%2 + " ");
        }
    }
    public static int facto(int n){
        if(n==1){
            return 1;
        }
        else{
            return n * facto(n-1);
        }

    }
    public static int fibo(int n){
        if(n<=1){
            if(n==0)return 0;
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    static int[] fiboArr;
    public static int fiboMemo(int n){
        if(fiboArr[n]>0) return fiboArr[n];
        else if(n==1) return fiboArr[n]=1;
        else if(n==2) return fiboArr[n]=1;
        else return fiboArr[n] = fiboMemo(n-1) + fiboMemo(n-2);
    }

    //부분집합
    static int[] arr;
    static int limit;
    public static void subSet(int l){
        if(l==limit+1){
            for(int i=1;i<4;i++){
                if(arr[i]!=0) System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
            arr[l]=1;
            subSet(l+1);
            arr[l]=0;
            subSet(l+1);
        }
    }
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //recur(n); 단순 재귀
        //binRecur(n); 이진수 재귀
        //System.out.println(facto(n)); 팩토리얼
        //System.out.println(fibo(n)); 피보나치

//        fiboArr = new int[n+1]; 피보나치 메모제이션
//        fiboMemo(n);
//        System.out.println(fiboArr[n]);

//        limit= 3;
//        arr = new int[limit+1];
//        subSet(1); 부분집합


    }
}
