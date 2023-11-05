package interview.preparation.kit.dictioneriesandhashmaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStrings {
    //https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

    public static String twoStrings(String s1, String s2) {
        char [] char1 = s1.toCharArray();
        char [] char2 = s2.toCharArray();
        
        Map<Character, Boolean> checkedBefore = new HashMap<>();


        if (char1.length < char2.length) {
            return checkStrings(char1, checkedBefore, char2);

        } else {
            return checkStrings(char2, checkedBefore, char1);
        }

    }

    private static String checkStrings(char[] char1, Map<Character, Boolean> checkedBefore, char[] char2) {
        for(Character character: char1){
            if(checkedBefore.get(character)!=null && checkedBefore.get(character))
                continue;

            for(Character character2: char2){
                if (character.equals(character2))
                    return "YES";
                else
                    checkedBefore.put(character,true);
            }
        }
        return "NO";
    }
}
