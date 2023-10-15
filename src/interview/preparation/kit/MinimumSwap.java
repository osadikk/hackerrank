package interview.preparation.kit;

import java.util.*;

public class MinimumSwap {
    //https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

    public int minimumSwap(int[] arr) {

                Integer[] nonsorted = new Integer[arr.length];

                List<Integer> nonSortedList = Arrays.asList(nonsorted);

                for(int i=0; i<arr.length; i++){
                    nonsorted[i]=arr[i];
                }


                Arrays.sort(arr);

                int swap = 0;

                for(int i=0; i< arr.length ; i++ ){

                    if(arr[i]!= nonsorted[i]){
                        int nonsortedIndex = nonSortedList.indexOf(arr[i]);
                        int temp = nonsorted[i];
                        nonsorted[nonsortedIndex] = temp;
                        nonsorted[i] = arr[i];
                        swap++;
                    }

                }

                return swap;
    }
}
