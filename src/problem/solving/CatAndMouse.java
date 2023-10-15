package problem.solving;

public class CatAndMouse {
    //https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

    static String catAndMouse(int x, int y, int z) {
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);

        if(a==b){
            return "Mouse C";
        }else if(b>a){
            return "Cat A";
        }else{
            return "Cat B";
        }

    }
}
