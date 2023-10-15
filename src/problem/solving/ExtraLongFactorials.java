package problem.solving;

import java.math.BigInteger;

public class ExtraLongFactorials {
    //https://www.hackerrank.com/challenges/extra-long-factorials/problem

    static void extraLongFactorials(int n) {
        BigInteger k=new BigInteger("1");
        for(int i=1;i<=n;i++){
            BigInteger r= new BigInteger(String.valueOf(i));
            k=k.multiply(r);
        }
        System.out.println(k);
    }
}