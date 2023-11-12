package interview.preparation.kit.dictioneriesandhashmaps;

import java.util.*;

public class FrequencyQueries {
   // https://www.hackerrank.com/challenges/frequency-queries/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps


    public static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> frequenciesOutput = new ArrayList<>();

        //Check iteration performance on LinkedHashMap vs HashMap
        Map<Integer, Integer> mapQuery= new LinkedHashMap<>();

        for(int i=0; i<queries.size(); i++){
            List<Integer> query = queries.get(i);
            int operation = query.get(0);
            int value = query.get(1);

            if(operation==1){
                mapQuery.merge(value, 1, (prev, one) -> prev + 1 );
            }else if(operation==2){
                if(mapQuery.containsKey(value) && mapQuery.get(value)>0)
                    mapQuery.put(value, mapQuery.get(value) - 1);
                else
                    mapQuery.remove(value);
            }else if(operation==3){

                if(mapQuery.containsValue(value)){
                    frequenciesOutput.add(1);
                }else{
                    frequenciesOutput.add(0);
                }

            }
        }

        return frequenciesOutput;
    }

}
