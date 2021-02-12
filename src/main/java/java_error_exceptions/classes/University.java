package java_error_exceptions.classes;

import java_error_exceptions.exceptions.*;
import java.util.List;

public class University {
    private String title;
    private List<Faculty> faculties;

    public University() {
    }

    public University(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Faculty> getFaculties() throws UniversityDoesNotHaveFaculties {
        if (faculties == null){
            throw new UniversityDoesNotHaveFaculties();
        }
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void addStudent(Student student, Faculty faculty, Group group) throws UniversityDoesNotHaveFaculties,
            GroupDoesNotHaveStudent, StudentDoesNotHaveSubject, FacultyDoesNotHaveGroups {
        boolean isHasDepartment = getFaculties().contains(faculty);
        if ((faculty == null) && !isHasDepartment) {
            throw new UniversityDoesNotHaveFaculties();
        }
        assert faculty != null;
        faculty.addStudent(student, group);
        setStudentSubject();
    }

    private void setStudentSubject() throws StudentDoesNotHaveSubject, FacultyDoesNotHaveGroups,
            UniversityDoesNotHaveFaculties, GroupDoesNotHaveStudent{
        for (Faculty faculty : getFaculties()){
            for(Group group : faculty.getGroupList()){
                group.setStudentsSubject();
            }
        }
    }
}
