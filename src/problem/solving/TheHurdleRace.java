package problem.solving;

public class TheHurdleRace {
    //https://www.hackerrank.com/challenges/the-hurdle-race/problem

    static int hurdleRace(int k, int[] height) {

        int max=0;
        for(int i=0;i<height.length;i++){
            if(max<height[i]){
                max=height[i];
            }
        }

        if(max>k){
            return max-k;
        }else{
            return 0;
        }
    }
}
