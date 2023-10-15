package interview.preparation.kit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArrayManipulation {
    //https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    //prefix sum


    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] currentArray = new long[n+1];


        for (List<Integer> query : queries) {
            int startInclusive = query.get(0);
            int endInclusive = query.get(1);
            int number = query.get(2);

            currentArray[startInclusive - 1] += number;
            currentArray[endInclusive] -= number;

        }

        long currentSum = 0;
        long maxValue = 0;

        for (long l : currentArray) {
            currentSum += l;
            maxValue = Math.max(currentSum, maxValue);
        }

        return maxValue;
}
}
