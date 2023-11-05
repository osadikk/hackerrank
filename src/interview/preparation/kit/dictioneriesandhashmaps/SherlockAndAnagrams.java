package interview.preparation.kit.dictioneriesandhashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    //https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

    public static int sherlockAndAnagrams(String s) {

        Map<String, Integer> anagram = new HashMap<>();
        int sum = 0;

        for(int i=0; i<s.length();i++){
            for(int j=i; j<s.length(); j++){
                String substring = s.substring(i, j+1);
                char[] charArr = substring.toCharArray();
                Arrays.sort(charArr);
                String sortedSubstring = new String(charArr);

                anagram.merge(sortedSubstring, 1, Integer::sum);
                }

            }

        for(Integer occurence : anagram.values()){
            sum+= (occurence*(occurence-1))/2;
        }

        return sum;

    }
}
