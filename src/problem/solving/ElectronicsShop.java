package problem.solving;

public class ElectronicsShop {
    //https://www.hackerrank.com/challenges/electronics-shop/problem

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max=0;
        for(int i=0;i<keyboards.length;i++){
            for(int k=0;k<drives.length;k++){
                int sum=keyboards[i]+drives[k];
                if(sum<=b){
                    if(max<sum){
                        max=sum;
                    }
                }
            }

        }
        if(max==0)
            return -1;
        return max;
    }
}
