package java_error_exceptions;

import java_error_exceptions.classes.*;
import java_error_exceptions.exceptions.GroupDoesNotHaveStudent;


public class Main {

    public static void main(String[] args)  {
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

        //  return university;
      //  printStudents(university);
    }


}
