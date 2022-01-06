package Inf_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<2;i++){
            t = kb.nextInt();
            for(int j=0;j<t;j++){
                arr.add(kb.nextInt());
            }
        }
        Collections.sort(arr);

        Iterator<Integer> inn = arr.iterator();

        while(inn.hasNext()){
            System.out.print(inn.next() + " ");
        }
    }
}
