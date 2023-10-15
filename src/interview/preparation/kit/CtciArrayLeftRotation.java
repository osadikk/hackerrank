package interview.preparation.kit;

import java.util.*;
import java.util.stream.Collectors;

public class CtciArrayLeftRotation{
    //https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
        public static List<Integer> rotLeft(List<Integer> a, int d) {

            Integer[] rotatedIndexArray = new Integer[a.size()];
            for(int i=0; i<a.size(); i++){
                int rotatedIndex = i-d < 0 ? i-d+a.size() : i-d;
                rotatedIndexArray[rotatedIndex] = a.get(i);
            }

            return Arrays.stream(rotatedIndexArray).collect(Collectors.toList());
        }
}
