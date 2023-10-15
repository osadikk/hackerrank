package problem.solving;

import java.util.Arrays;

public class PlusMinus {
    //https://www.hackerrank.com/challenges/plus-minus/problem

    static void plusMinus(int[] arr) {

        long postiveStreamSize= Arrays.stream(arr).filter(i -> i > 0).count();
        long negativeStreamSize=Arrays.stream(arr).filter(i -> i <0).count();
        long zeroStreamSize=Arrays.stream(arr).filter(i -> i == 0).count();

        System.out.printf("%5f%n%5f%n%5f",(float)postiveStreamSize/arr.length,(float)negativeStreamSize/arr.length,(float)zeroStreamSize/arr.length);
    }
}
