
//https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true

import java.util.List;

public class MagicSquareForming {

    public int formingMagicSquare(List<List<Integer>> s) {

        int n = s.size();
        int cost = Integer.MAX_VALUE;

        // all possible magic arrays
        int[][][] total = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
                { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
                { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
                { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } } };

        Integer[][] twoDArray = s.stream()
                .map(l -> l.toArray(new Integer[n]))
                .toArray(Integer[][]::new);


        for(int i=0; i<Math.pow(n,2)-1 ; i++){
            int diff = 0;
            for(int j=0; j<n; j++){
               for (int k=0; k<n; k++){
                   diff += Math.abs(total[i][j][k] - twoDArray[j][k]);
               }
            }


            if(diff < cost){
                cost = diff;
            }
        }

        return cost;

    }
}
