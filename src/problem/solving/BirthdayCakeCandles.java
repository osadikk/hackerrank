package problem.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    //https://www.hackerrank.com/challenges/birthday-cake-candles/problem

    static int birthdayCakeCandles(int[] ar) {
        List<Integer> arrayList=new ArrayList<>();

        for(int i:ar){
            arrayList.add(i);
        }

        int maxHeight= Collections.max(arrayList);

        int count=0;
        for(Integer candle:arrayList){

            if(candle==maxHeight){
                count++;
            }
        }
        return count;
    }

}
