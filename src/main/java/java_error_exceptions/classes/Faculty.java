package java_error_exceptions.classes;

import java.util.List;

public class Faculty {
    private String FacultyName;
    private List<Group> groupList;

    public Faculty(String facultyName) {
        FacultyName = facultyName;
    }

    public Faculty(String facultyName, List<Group> groupList) {
        FacultyName = facultyName;
        this.groupList = groupList;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (FacultyName != null ? !FacultyName.equals(faculty.FacultyName) : faculty.FacultyName != null) return false;
        return groupList != null ? groupList.equals(faculty.groupList) : faculty.groupList == null;
    }

    @Override
    public int hashCode() {
        int result = FacultyName != null ? FacultyName.hashCode() : 0;
        result = 31 * result + (groupList != null ? groupList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "FacultyName='" + FacultyName + '\'' +
                ", groupList=" + groupList +
                '}';
    }

   public void  addStudent(Student student,Group group) {
        group.addStudent(student);
   }
}
