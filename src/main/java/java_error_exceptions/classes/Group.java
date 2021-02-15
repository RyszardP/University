package java_error_exceptions.classes;

import java_error_exceptions.exceptions.GroupDoesNotHaveStudentException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private List<Student> students;
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public List<Student> getStudents() throws GroupDoesNotHaveStudentException {
        if (students.isEmpty()) {
            throw new GroupDoesNotHaveStudentException("The group " + getGroupName() + " is empty");
        }
        return students;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public void addRandomStudent() {
        students.add(Student.createStudent());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupName.equals(group.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("groupName='").append(groupName).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
