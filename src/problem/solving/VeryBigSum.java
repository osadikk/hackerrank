package problem.solving;

public class VeryBigSum {
    //https://www.hackerrank.com/challenges/a-very-big-sum/problem

    static long aVeryBigSum(long[] ar) {
        long sum=0;

        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }

        return sum;
    }

}
