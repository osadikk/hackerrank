package problem.solving;

import java.util.HashMap;
import java.util.Map;

public class DesignerPdfViewer {
    //https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

    static int designerPdfViewer(int[] h, String word) {

        String alpahet="abcdefghijklmnopqrstuvwxyz";
        Map<Character,Integer> alpahetOrder =new HashMap<>();
        int index=0;
        for(int i=0;i<word.length();i++){
            index=alpahet.indexOf(word.charAt(i));
            alpahetOrder.put(word.charAt(i),h[index]);
        }

        int max=0;
        for(Map.Entry entry:alpahetOrder.entrySet()){
            if(max<(Integer)entry.getValue()){
                max=(Integer)entry.getValue();
            }
        }
        return max*word.length();
    }
}
