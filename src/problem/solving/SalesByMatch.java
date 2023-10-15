package problem.solving;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {
    //https://www.hackerrank.com/challenges/sock-merchant/problem


    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer,Integer> mapSock=new HashMap<>();
        for(int i=0;i < ar.length ; i++){
            if(!mapSock.containsKey(ar[i])){
                mapSock.put(ar[i],1);
            } else{
                int a= mapSock.get(ar[i]);
                mapSock.put(ar[i],a+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapSock.entrySet()) {
            if(entry.getValue()>=2){
                entry.setValue(entry.getValue()/2);
            }else{
                entry.setValue(0);
            }


        }
        int count=0;
        for (Map.Entry<Integer, Integer> entry : mapSock.entrySet()) {
            if(entry.getValue()!=0){
                count=count + entry.getValue();
            }

        }

        return count;
    }
}
