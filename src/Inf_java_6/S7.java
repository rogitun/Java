package Inf_java_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//좌표 정렬
public class S7 {
    public static class Point implements Comparable<Point>{
        public int x,y;

        public Point(int x,int y){
            this.y = y;
            this.x = x;
        }
        @Override
        public int compareTo(Point o) {
            if(this.x == o.x)return this.y-o.y;
            else return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Point> arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = kb.nextInt(); int y= kb.nextInt();
            arrayList.add(new Point(x,y));
        }
        Collections.sort(arrayList);
        for(Point x : arrayList){
            System.out.println(x.x + " " + x.y);
        }

    }
}
