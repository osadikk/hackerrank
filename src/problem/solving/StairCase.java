package problem.solving;

public class StairCase {
    //https://www.hackerrank.com/challenges/staircase/problem

    static void staircase(int n) {
        for(int k=0;k<n;k++){
            StringBuilder str =new StringBuilder();
            for(int l=0;l<(n-k)-1;l++){
                str.append(" ");
            }
            if(k==0){
                str.append("#");
            }else{
                for(int i=0;i<k+1;i++){
                    str.append("#");
                }
            }
            System.out.println(str);
        }

    }
}
