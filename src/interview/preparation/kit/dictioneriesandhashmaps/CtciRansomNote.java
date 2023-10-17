package interview.preparation.kit.dictioneriesandhashmaps;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CtciRansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Long> magazineWords = magazine
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> noteWords = note
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean isPrintable = noteWords.entrySet().stream().allMatch(entry->
                magazineWords.containsKey(entry.getKey())
                        && entry.getValue()<=magazineWords.get(entry.getKey()));

        if(isPrintable)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
