package interview.preparation.kit;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public List<Integer> dynamicArray(int  n, List<List<Integer>> queries) {

        List<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;

        List<List<Integer>> twoDArray = new ArrayList<>();

        for(int i=0; i<n; i++){
            twoDArray.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            if (query.get(0) == 1) {
                int idx = (query.get(1)  ^ lastAnswer) % n;
                twoDArray.get(idx).add(query.get(2));
            } else {
                int idx = (query.get(1) ^ lastAnswer) % n;
                lastAnswer = twoDArray.get(idx).get(query.get(2) % twoDArray.get(idx).size());
                answers.add(lastAnswer);

            }
        }
        return answers;
        }
}