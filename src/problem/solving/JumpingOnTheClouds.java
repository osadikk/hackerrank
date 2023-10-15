package problem.solving;

public class JumpingOnTheClouds {
    //https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

    static int jumpingOnClouds(int[] c) {
        int i=0;
        int jump=0;
        while(i!=c.length-1){

            if(i != c.length - 2 && c[i+2] == 0)
                i+=2;
            else
                i++;


            jump++;
        }

        return jump;

    }
}
