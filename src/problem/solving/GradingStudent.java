package problem.solving;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudent {
    //https://www.hackerrank.com/challenges/grading/problem

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradeAll= grades.stream()
                .map(value -> {
                    if (value%5!=0 && 5-value%5<3 && value + 5-value%5 >39)
                        return (value + 5-value%5);
                    else
                        return value;
                }).collect(Collectors.toList());
        return gradeAll;

    }
}
