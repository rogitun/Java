package Algorithm;

import java.util.*;

public class java_1 {

    public static int result(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size();
        int point = 0;
        int high_point=0;
        int temp = 0;
        boolean swt = false;
        while (high > low) {
            high--;
            high_point=arr.get(high); arr.set(high,0);
            if(high_point%2==0 && high_point!=0){
                while(arr.get(low)%2!=0 || arr.get(low)==0){
                    if(arr.get(low)!=0) temp = low;
                    low++;
                    if(low>=high)break;
                }
                if(low>=high){
                    point+=arr.get(temp); arr.set(temp,0); arr.set(high,0);
                    low =0;
                }
                else{
                    arr.set(low,0);
                    arr.set(high,0);
                    point+=high_point;
                    low =0;
                }
            }
            else if(high_point%2!=0 && high_point!=0) {
                while(arr.get(low)%2==0 || arr.get(low)==0){
                    if(arr.get(low)!=0) temp = low;
                    low++;
                    if(low>=high)break;
                }
                if(low>=high){
                    point+=arr.get(temp); arr.set(temp,0); arr.set(high,0);
                    low =0;
                }
                else{
                    arr.set(low,0);
                    arr.set(high,0);
                    point+=high_point;
                    low =0;
                }
            }
        }
        return point;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();

        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int limit = 0;
        int res = 0;
        for(int i=0;i<number;i++){
            limit = kb.nextInt();
            for(int j=0;j<limit;j++){
                arr.add(kb.nextInt());
            }
            Collections.sort(arr);
            res=result(arr);
            System.out.println("#"+(i+1) + " " + res);
            arr.clear();
        }
    }

}
