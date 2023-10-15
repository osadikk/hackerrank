package problem.solving;

import java.util.List;

public class BetweenTwoSets {
    //https://www.hackerrank.com/challenges/between-two-sets/problem

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Integer minB=b.stream().min(Integer::compare).get();
        Integer minA=a.stream().min(Integer::compare).get();
        Integer maxA=a.stream().max(Integer::compare).get();

        int total=0;

        for(int i=maxA;i<=minB;i+=maxA){
            final int k=i;
            if(a.stream().filter(x->k%x==0).count()==a.size() && b.stream().filter(x->(x%k==0)).count()==b.size())
                total++;

        }

        return total;
    }

}
