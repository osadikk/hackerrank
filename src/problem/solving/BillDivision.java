package problem.solving;

import java.util.List;

public class BillDivision {
    //https://www.hackerrank.com/challenges/bon-appetit/problem

    static void bonAppetit(List<Integer> bill, int k, int b) {


        bill.remove(k);
        int sum=0;
        for(Integer a :bill){
            sum=sum+a;

        }
        int charged=sum/2;

        if(charged==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-charged);
        }

    }
}
