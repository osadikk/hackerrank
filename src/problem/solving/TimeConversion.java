package problem.solving;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    //https://www.hackerrank.com/challenges/time-conversion/problem

    static String timeConversion(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");

        LocalTime dateTime = LocalTime.parse(s, formatter);

        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("HH:mm:ss");


        String formatted=dateTime.format(formatter24);
        return formatted;
    }
}
