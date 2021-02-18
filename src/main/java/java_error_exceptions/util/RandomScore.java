package java_error_exceptions.util;

import java_error_exceptions.entity.Student;

import java.util.*;

public class RandomScore {
    public static Random r = new Random();
    public static int randomScore = 4 + r.nextInt(10 - 4 + 1);

    public static List<Integer> fillRandomScoreList() {
        List<Integer> randomScoresList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            randomScoresList.add(4 + r.nextInt(10 - 4 + 1));
        }
        return randomScoresList;
    }

    public static List<Integer> getListOfScores(List<Integer> randomScoresList) {
        for (int i = 0; i < 20; i++) {
            randomScoresList.add(4 + r.nextInt(10 - 4 + 1));
        }
        return randomScoresList;
    }

    public static double averageScore(List<Integer> randomScoresList) {
        Integer sum = 0;
        if (!randomScoresList.isEmpty()) {
            for (Integer mark : randomScoresList) {
                sum += mark;
            }
            return sum.doubleValue() / randomScoresList.size();
        }
        return sum;
    }
}
