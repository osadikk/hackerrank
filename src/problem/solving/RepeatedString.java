package problem.solving;

public class RepeatedString {
    //https://www.hackerrank.com/challenges/repeated-string/problem

    static long repeatedString(String s, long n) {
        long length= s.length();
        long modLength=n%length;
        long divideLength=n/length;

        long basecount = s.chars().filter(ch -> ch == 'a').count();
        long substrcount=0;
        basecount=basecount * divideLength;

        if(modLength!=0){
            String substr= s.substring(0,(int)modLength);
            substrcount= substr.chars().filter(ch -> ch == 'a').count();
        }

        return basecount+substrcount;
    }
}
