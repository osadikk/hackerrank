package problem.solving;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    //https://www.hackerrank.com/challenges/compare-the-triplets/problem
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> compareList=new ArrayList<>();
        compareList.add(0,0);
        compareList.add(1,0);

        int k=0;

        for(int i=0;i<a.size();i++){

            if(a.get(i)>b.get(i)){
                k=compareList.get(0);
                compareList.set(0,k+1);
            }else if (b.get(i)>a.get(i)){
                k=compareList.get(1);
                compareList.set(1,k+1);
            }

        }
        return compareList;
    }
}
