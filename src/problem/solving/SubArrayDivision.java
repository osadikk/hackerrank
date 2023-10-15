package problem.solving;

import java.util.List;

public class SubArrayDivision {
    //https://www.hackerrank.com/challenges/the-birthday-bar/problem

    static int birthday(List<Integer> s, int d, int m) {

        int count=0;

        Object[] asList=s.toArray();

        if(asList.length==1){
            if(d==(Integer)asList[0]){
                count++;
            }
        } else{

            for(int l=0;l+m<=asList.length;l++){
                int k=0;
                for(int i=0;i<m;i++){
                    k=k+(Integer)asList[l+i];
                }

                if(d==k){
                    count++;
                }
            }
        }
        return count;
    }
}
