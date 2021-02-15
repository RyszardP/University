package java_error_exceptions.util;

import java_error_exceptions.classes.Group;
import java_error_exceptions.classes.Student;
import java_error_exceptions.classes.Subject;
import java_error_exceptions.exceptions.GroupDoesNotHaveStudent;
import java_error_exceptions.exceptions.StudentDoesNotHaveSubject;

import java.util.Optional;

public class GroupUtil extends Calculations {

    public static boolean hasStudent(Group group, long studentIDNUmber) throws GroupDoesNotHaveStudent {
        return  group.getStudents().stream().anyMatch(student -> student.getStudentId() == studentIDNUmber);
    }

    public static Student searchStudent(Group group, long studentId) throws GroupDoesNotHaveStudent {
        Optional<Student> optionalStudent = group.getStudents().stream().
                filter(student -> student.getStudentId() == studentId)
                .findFirst();
        return optionalStudent.orElse(null);
    }

    public static Double getAverageScoreBySubject(Group group, Subject subject)
            throws GroupDoesNotHaveStudent, StudentDoesNotHaveSubject {
        return averageSubjectScore(group.getStudents(),subject);
    }
}
