package java_error_exceptions.classes;

import java_error_exceptions.util.RandomNames;
import java_error_exceptions.util.RandomScore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Student {
    private String name;
    private String secondName;
    private List<Integer> scoreList;
    private HashMap<Subject, Set<Integer>> subjectScoreSet = new HashMap<>();
    private List<Subject> subjectList = new ArrayList<Subject>();

    public Student() {
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }


    public Student(String name, String secondName, List<Integer> scoreList) {
        this.name = name;
        this.secondName = secondName;
        this.scoreList = scoreList;
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

    public HashMap<Subject, Set<Integer>> getSubjectScoreSet() {
        return subjectScoreSet;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectScoreSet(HashMap<Subject, Set<Integer>> subjectScoreSet) {
        this.subjectScoreSet = subjectScoreSet;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjectList = subjects;
    }

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Integer> scoreList) {
        this.scoreList = scoreList;
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


    public static Student createStudent() {
        Student student = new Student(RandomNames.getRandomName(), RandomNames.getRandomSecondName(), RandomScore.fillRandomScoreList());
        return student;
    }

    public static void main(String[] args) {
        System.out.println(createStudent().getScoreList());
    }

}
