package java_error_exceptions.classes;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private ArrayList<Student> studentsList = new ArrayList<Student>();
    private ArrayList<Subject> subjectsList = new ArrayList<Subject>();
    public String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectsList;
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    private List<Subject> getSubjects()  {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjects) {
        this.subjectsList = subjectsList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentsList=" + studentsList +
                ", subjectsList=" + subjectsList +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void addRandomStudent() {
        studentsList.add(Student.createStudent());
    }

    void setStudentsSubject()  {
        for (Student studentI : getStudents()) {
            studentI.setSubjects(getSubjects());
        }
    }


}
