package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=5;i>0;i--){
            arr.add(i);
        }
        Collections.sort(arr); //정렬
        Iterator<Integer> b = arr.iterator();
        while(b.hasNext()){
            int temp = b.next();
            System.out.println(temp);
        }



    }
}
