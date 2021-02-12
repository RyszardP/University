package java_error_exceptions.classes;

import java_error_exceptions.util.RandomNames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Student {
    private String name;
    private String secondName;
    private HashMap<Subject, Integer> subjectScoreSet = new HashMap<Subject, Integer>();
    private List<Subject> subjectList = new ArrayList<Subject>();

    public Student() {
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public HashMap<Subject, Integer> getSubjectScoreSet() {
        return subjectScoreSet;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectScoreSet(HashMap<Subject, Integer> subjectScoreSet) {
        this.subjectScoreSet = subjectScoreSet;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;
        return subjectList != null ? subjectList.equals(student.subjectList) : student.subjectList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (subjectList != null ? subjectList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjectList = subjects;
    }

    public static Student createStudent() {
        Student student = new Student(RandomNames.getRandomName(), RandomNames.getRandomSecondName());
        return student;
    }
}
