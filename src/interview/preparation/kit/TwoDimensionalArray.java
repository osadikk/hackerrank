package interview.preparation.kit;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class TwoDimensionalArray {
    public int hourglassSum(List<List<Integer>> arr) {
        List<Integer> sums = new ArrayList<>() ;

        for(int i=0; i<4; i++){
            int total = 0;
            for(int j=0; j<4; j++){
                total =  arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                sums.add(total);
            }

        }

        return sums.stream().max(Integer::compare).get();
    }
}
