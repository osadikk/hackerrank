package interview.preparation.kit.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class NewYearChaos {
    //https://www.hackerrank.com/challenges/new-year-chaos/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

    public void minimumBribes(List<Integer> q) {

    int bribes = 0;

    for(int i=q.size()-1; i>=0;i--){
        if(q.get(i) - (i+1)>2){
            System.out.println("Too chaotic");
            return;
        }

        for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
            if (q.get(j) > q.get(i)) {
                bribes++;
            }
        }

    }
        System.out.println(bribes);
    }
    }

