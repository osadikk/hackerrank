package problem.solving;

public class DivisibleSumPair {
    //https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int count=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i<j){
                    int sum=ar[i]+ar[j];

                    if(sum%k==0){
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
