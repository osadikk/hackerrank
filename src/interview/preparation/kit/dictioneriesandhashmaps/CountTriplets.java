package interview.preparation.kit.dictioneriesandhashmaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountTriplets {
    //https://www.hackerrank.com/challenges/count-triplets-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

    /*
    * 1,2,4
    * first loop 4 myMapValueCount = {4:1}
    * second loop 2 myMapValueCount = {4:1, 2:1}
    * second loop 2 myMapPair = {2:1}
    * third loop 1 numberOfTriplets = 1
    * third loop 1 myMapPair = {2:1, 1:1}
    * third loop 1 myMapValueCount = {4:1, 2:1, 1:1}
     */

    static long countTriplets(List<Long> arr, long r) {

        long numberOfTriplets = 0L;
        Map<Long, Long> mapValueCount = new HashMap<>();
        Map<Long, Long> mapPair = new HashMap<>();



        for (int i = arr.size()-1; i >= 0; i--) {
            long number = arr.get(i);
            long numberMultiplied = number * r;

            if (mapPair.containsKey(numberMultiplied)) {
                numberOfTriplets += mapPair.get(numberMultiplied);
            }

            if (mapValueCount.containsKey(numberMultiplied)) {
                mapPair.put(number, mapPair.getOrDefault(number, 0L) + mapValueCount.get(numberMultiplied));
            }

            mapValueCount.put(number, mapValueCount.getOrDefault(number, 0L) + 1);

        }

        return numberOfTriplets;

    }
}
