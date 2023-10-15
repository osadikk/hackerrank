package problem.solving;

public class NumberLineJumps {
    //https://www.hackerrank.com/challenges/kangaroo/problem

    static boolean fistBoolean=true;
    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (fistBoolean && (x1<=x2 && v1<=v2))
            return "NO";


        x1+=v1;
        x2+=v2;

        if(!fistBoolean && x1>x2)
            return "NO";

        fistBoolean=false;
        String ret = (x2%x1)==0 ? "YES" : kangaroo(x1, v1, x2, v2);

        return ret;

    }
}
