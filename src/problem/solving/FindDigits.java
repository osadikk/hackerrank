package problem.solving;

public class FindDigits {
    //https://www.hackerrank.com/challenges/find-digits/problem

    static int findDigits(int n) {
        String numberString=String.valueOf(n);

        int count=0;

        for(int i=0;i<numberString.length();i++){
            int a= Character.getNumericValue(numberString.charAt(i));

            try{
                if((n/a>0) && (n%a==0)){

                    count++;
                }
            } catch (ArithmeticException ae) {

            }

        }
        return count;
    }
}
