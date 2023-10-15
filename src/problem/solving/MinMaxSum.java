package problem.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    //https://www.hackerrank.com/challenges/mini-max-sum/problem


    static void miniMaxSum(int[] arr) {

        List<Long> arrayList=new ArrayList<>();

        for(int i: arr){
            arrayList.add(Long.valueOf(i));
        }
        Collections.sort(arrayList);

        long minSize=0;
        for(int i=0;i<arrayList.size()-1;i++){


            minSize=minSize+ arrayList.get(i);
        }

        System.out.print(minSize);

        Collections.sort(arrayList,Collections.reverseOrder());
        long maxSize=0;
        for(int i=0;i<arrayList.size()-1;i++){


            maxSize=maxSize+ arrayList.get(i);
        }
        System.out.print(" "+maxSize);
    }
}
