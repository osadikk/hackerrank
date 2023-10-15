package problem.solving;

public class BreakingTheRecords {
    //https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

    static int[] breakingRecords(int[] scores) {
        int max=0;
        int min=0;
        int maxPoint=scores[0];
        int minPoint=scores[0];
        for(int i=0;i<scores.length-1;i++){

            if(scores[i]<scores[i+1] && maxPoint<scores[i+1]){
                max++;
                maxPoint=scores[i+1];
            } else if(scores[i]>scores[i+1] && minPoint>scores[i+1]){
                min++;
                minPoint=scores[i+1];
            }

        }
        int[] minmax=new int[2];

        minmax[0]=max;
        minmax[1]=min;

        return minmax;
    }
}
