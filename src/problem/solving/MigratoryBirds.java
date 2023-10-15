package problem.solving;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    //https://www.hackerrank.com/challenges/migratory-birds/problem

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer a:arr){
            if(map.get(a)==null){
                map.put(a,1);
            }else{
                map.put(a,map.get(a) + 1);
            }
        }

        Map.Entry<Integer, Integer> firstEntry = map.entrySet().iterator().next();
        int largestValue = firstEntry.getValue();
        int largestKey=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > largestValue) {
                largestValue = value;
                largestKey = entry.getKey();
            }

        }


        return largestKey;
    }
}
