package problem.solving;

import java.util.Arrays;

public class AppleAndOrange {
    //https://www.hackerrank.com/challenges/apple-and-orange/problem

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        System.out.println(Arrays.stream(apples).filter(apple->((s<=(apple+a)) && ((apple+a)<=t))).count());

        System.out.println(Arrays.stream(oranges).filter(orange->((s<=(orange+b)) && ((orange+b)<=t))).count());
    }
}
