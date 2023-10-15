package interview.preparation.kit.arrays;

import java.util.Arrays;

public class MinimumSwaps {

    //https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

    static int minimumSwaps(int[] arr) {

        int[] nonsorted = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            nonsorted[i]=arr[i];
        }


        Arrays.sort(arr);

        int swap = 0;

        for(int i=0; i< arr.length ; i++ ){

            if(arr[i]!= nonsorted[i]){
                int nonsortedIndex = indexOf(nonsorted, arr[i]);
                int temp = nonsorted[i];
                nonsorted[nonsortedIndex] = temp;
                nonsorted[i] = arr[i];
                swap++;
            }

        }

        return swap;

    }


    public static int indexOf(int[] arr, int value)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}


