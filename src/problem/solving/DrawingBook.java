package problem.solving;

public class DrawingBook {
    //https://www.hackerrank.com/challenges/drawing-book/problem

    static int pageCount(int n, int p) {

        if((n-p<p-1) || (((n-p)==(p-1)) && !(n%2==0))){
            if((n%2==0 && n-p>0) || (!(n%2==0) && (n-p>1))){

                return (n-p)%2==0 ? (n-p)/2 : n-p==1 ? 1 :((n-p)-1)/2;

            }else{
                return 0;
            }
        }else if(p-1>0){

            return (p-1)%2==0 ? (p-1)/2 : ((p-1)+1)/2;


        }else{
            return 0;
        }

    }
}
