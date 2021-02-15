package java_error_exceptions.util;

import java_error_exceptions.classes.Student;
import java_error_exceptions.classes.Subject;
import java_error_exceptions.exceptions.StudentDoesNotHaveSubject;

import java.util.List;


public class Calculations {

    public static double averageSubjectScore(List<Student> students, Subject subject) throws StudentDoesNotHaveSubject {
        Double averageScore = 0.0;
        int scoreCount = 0;
        for (Student student : students) {
            if(student.getSubjects().contains(subject)){
                List<Integer> grades = StudentUtil.getScoresBySubject(student, subject);
                for (Integer score : grades) {
                    averageScore += score;
                    scoreCount++;
                }
            }
        }
        averageScore = (scoreCount != 0) ? averageScore / scoreCount : averageScore;
        return averageScore;

    }


}
