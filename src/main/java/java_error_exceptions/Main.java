package java_error_exceptions;

import java_error_exceptions.classes.*;
import java_error_exceptions.exceptions.FacultyDoesNotHaveGroups;
import java_error_exceptions.exceptions.GroupDoesNotHaveStudent;
import java_error_exceptions.exceptions.StudentDoesNotHaveSubject;
import java_error_exceptions.exceptions.UniversityDoesNotHaveFaculties;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        University university = new University("Hogwarts");
        Faculty facultyGryffindor = new Faculty("Gryffindor");
        Faculty facultySlytherin = new Faculty("Slytherin");
        Faculty facultyHufflepuff = new Faculty("Hufflepuff");
        Faculty facultyRavenclaw = new Faculty("Ravenclaw");
        Group firstGryffindorGroup = new Group("1 Gryffindor group");
        Group secondGryffindorGroup = new Group("2 Gryffindor group");
        Group firstSlytherinGroup = new Group("1 Slytherin group");
        Group secondSlytherinGroup = new Group("2 Slytherin group");
        Group firstHufflepuffGroup = new Group("1 Hufflepuff group");
        Group secondHufflepuffGroup = new Group("2 Hufflepuff group");
        Group firstRavenclawGroup = new Group("1 Ravenclaw group");
        Group secondRavenclawGroup = new Group("2 Ravenclaw group");

        try {
            university.setFaculties(new ArrayList<>(Arrays.asList(facultyGryffindor, facultySlytherin,
                    facultyHufflepuff, facultyRavenclaw)));

            facultyGryffindor.setGroupList(new ArrayList<>(Arrays.asList(firstGryffindorGroup, secondGryffindorGroup)));
            facultySlytherin.setGroupList(new ArrayList<>(Arrays.asList(firstSlytherinGroup, secondSlytherinGroup)));
            facultyHufflepuff.setGroupList(new ArrayList<>(Arrays.asList(firstHufflepuffGroup, secondHufflepuffGroup)));
            facultyRavenclaw.setGroupList(new ArrayList<>(Arrays.asList(firstRavenclawGroup, secondRavenclawGroup)));

            firstGryffindorGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.CHEMISTRY,
                    Subject.DESIGN_BASICS, Subject.DRAWING)));
            secondGryffindorGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.PHYSICS, Subject.MATHEMATICS,
                    Subject.STRUCTURAL_MECHANICS)));
            firstSlytherinGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.ELECTRICAL_ENGINEERING,
                    Subject.THEORY_OF_MECHANICS)));
            secondSlytherinGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.ELECTRICAL_ENGINEERING,
                    Subject.DRAWING, Subject.CHEMISTRY)));
            firstHufflepuffGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.CHEMISTRY,
                    Subject.DESIGN_BASICS, Subject.DRAWING)));
            secondHufflepuffGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.CHEMISTRY,
                    Subject.DESIGN_BASICS, Subject.DRAWING)));
            firstRavenclawGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.ELECTRICAL_ENGINEERING,
                    Subject.HYDRODYNAMICS)));
            secondRavenclawGroup.setSubjectsList(new ArrayList<>(Arrays.asList(Subject.ELECTRICAL_ENGINEERING,
                    Subject.DRAWING, Subject.HYDRODYNAMICS)));


            university.addRandomStudentQuantity(facultyGryffindor, firstGryffindorGroup, 20);
            university.addRandomStudentQuantity(facultyGryffindor, secondGryffindorGroup, 20);
            university.addRandomStudentQuantity(facultySlytherin, firstSlytherinGroup, 20);
            university.addRandomStudentQuantity(facultySlytherin, secondSlytherinGroup, 20);
            university.addRandomStudentQuantity(facultyHufflepuff, firstHufflepuffGroup, 20);
            university.addRandomStudentQuantity(facultyHufflepuff, secondHufflepuffGroup, 20);
            university.addRandomStudentQuantity(facultyRavenclaw, firstRavenclawGroup, 20);
            university.addRandomStudentQuantity(facultyRavenclaw, secondRavenclawGroup, 20);


        } catch (UniversityDoesNotHaveFaculties | GroupDoesNotHaveStudent | StudentDoesNotHaveSubject | FacultyDoesNotHaveGroups e) {
            e.printStackTrace();
        }
        //  return university;
        printStudents(university);

    }

    public static void printStudents(University university) {
        try {
            for (Faculty faculty : university.getFaculties()) {
                for (Group group : faculty.getGroupList()) {
                    for (Student student : group.getStudents()) {
                        System.out.println("faculty title: " + faculty.getFacultyName() + ", Group name: " +
                                group.getGroupName() + ", Student name and second name: " + student.getName() + " " +
                                student.getSecondName() + ", Subjects: " + student.getSubjectList() +
                                ", Score list" + student.getScoreList());
                    }
                }
            }
        } catch (UniversityDoesNotHaveFaculties e) {
            e.printStackTrace();
        }
    }

}
