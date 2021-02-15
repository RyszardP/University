package java_error_exceptions.util;

import java_error_exceptions.classes.Faculty;
import java_error_exceptions.classes.Group;
import java_error_exceptions.classes.Student;
import java_error_exceptions.classes.Subject;
import java_error_exceptions.exceptions.FacultyDoesNotHaveGroups;
import java_error_exceptions.exceptions.GroupDoesNotHaveStudent;
import java_error_exceptions.exceptions.StudentDoesNotHaveSubject;

import java.util.ArrayList;
import java.util.List;

public class FacultyUtil extends Calculations {

    public static boolean hasGroup(Faculty faculty, String groupName) throws FacultyDoesNotHaveGroups {
        return faculty.getGroups().stream().anyMatch(group -> group.getGroupName().equals(groupName));
    }

    private static Group groupWithStudent(Faculty faculty, long studentId) throws FacultyDoesNotHaveGroups,
          GroupDoesNotHaveStudent {
        for (Group group : faculty.getGroups()) {
            if(GroupUtil.hasStudent(group, studentId)){
                return group;
            }
        }
        return null;
    }

    public static Student searchStudent(Faculty faculty, long studentId)
            throws FacultyDoesNotHaveGroups, GroupDoesNotHaveStudent {
        Group groupWithStudent = groupWithStudent(faculty, studentId);
        if (groupWithStudent != null) {
            return GroupUtil.searchStudent(groupWithStudent, studentId);
        }
        else return null;
    }

    public static List<Student> getStudentsOfFaculty(Faculty faculty) throws FacultyDoesNotHaveGroups,
            GroupDoesNotHaveStudent {
        ArrayList<Student> students = new ArrayList<>();
        for (Group group : faculty.getGroups()) {
            students.addAll(group.getStudents());
        }
        return students;
    }

    public static Double getAverageScoreBySubject(Faculty faculty, Subject subject) throws GroupDoesNotHaveStudent,
           FacultyDoesNotHaveGroups, StudentDoesNotHaveSubject {
        return averageSubjectScore(getStudentsOfFaculty(faculty),subject);
    }
}
