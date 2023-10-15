package problem.solving;

import java.util.List;

public class DiagonalDifference {
    //https://www.hackerrank.com/challenges/diagonal-difference/problem

    public static int diagonalDifference(List<List<Integer>> arr) {

        int i=0;
        int p=arr.size()-1;
        int sumi=0;
        int sump=0;
        for(List<Integer> list: arr){
            sumi+=list.get(i);
            sump+=list.get(p);
            i++;
            p--;
        }
        return Math.abs(sumi-sump);
    }
}
