package Inf_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        int p1 = 0,p2 =0,p3 =0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();


        for(int i=0;i<a;i++){
            arr1.add(kb.nextInt());
        }
        int b = kb.nextInt();
        for(int j=0;j<b;j++){
            arr2.add(kb.nextInt());
        }
        Collections.sort(arr1);
        Collections.sort(arr2);

        while(p1<arr1.size() && p2 < arr2.size()){
            if(arr1.get(p1) < arr2.get(p2)) p1++;
            else if(arr1.get(p1)>arr2.get(p2)) p2++;
            else{
                result.add(arr1.get(p1));
                p1++;p2++;
            }
        }

        Iterator<Integer> iter = result.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

    }
}
