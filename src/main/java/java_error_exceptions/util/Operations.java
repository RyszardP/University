package java_error_exceptions.util;

import java_error_exceptions.classes.Student;
import java_error_exceptions.classes.Subject;

import java.util.Map;

public class Operations {

    Student student = new Student();

    public double middleSubjectScore() {
        double middleSubjectScore;
        int sum = 0;
        for (Map.Entry<Subject, Integer> entry : student.getSubjectScoreSet().entrySet()){
            sum += entry.getValue();
        }
        double value = (double) sum / student.getSubjectScoreSet().size();
        value = value * 10;
        int i = (int) Math.round(value);
        middleSubjectScore = (double) i / 10;
            return middleSubjectScore;
    }


}
