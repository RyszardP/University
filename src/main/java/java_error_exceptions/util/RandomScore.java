package java_error_exceptions.util;

import java_error_exceptions.classes.Student;

import java.util.*;

public class RandomScore {
    public static Random r = new Random();
    public static int randomScore = 4 + r.nextInt(10 - 4 + 1);

    public static List<Integer> randomScoresList = new ArrayList<Integer>();
    public static List<Integer> randomScoreSet = new ArrayList<>();

    public static List<Integer> fillRandomScoreList() {
        for (int i = 0; i <= 10; i++) {
            randomScoreSet.add(4 + r.nextInt(10 - 4 + 1));
        }
        return randomScoreSet;
    }


    public static List<Integer> getListOfScores() {
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

    public static void main(String[] args) {
       // System.out.println(randomScore);

      //  System.out.println(getListOfScores());
      //  System.out.println(averageScore(randomScoresList));
Student student = new Student();


        //System.out.println(student.setScoreList(fillRandomScoreList()));
    }


}
