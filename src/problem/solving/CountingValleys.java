package problem.solving;

import java.util.ArrayList;
import java.util.List;

public class CountingValleys {
    //https://www.hackerrank.com/challenges/counting-valleys/problem

    static int countingValleys(int n, String s) {
        List<Character> arrayListString=new ArrayList<>();
        int valley=0;
        int countValley=0;
        boolean isValley=false;
        for(int i=0;i<n;i++){
            arrayListString.add(s.charAt(i));
        }

        for(Character charArray:arrayListString){
            if(valley<0){
                isValley=true;
            }else{
                isValley=false;
            }
            if(charArray.equals('U')){
                valley=valley+1;
            }else if(charArray.equals('D')){
                valley=valley-1;
            }

            if(valley==0 && isValley){
                countValley=countValley+1;
            }
        }
        return countValley;
    }
}
