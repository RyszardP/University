package java_error_exceptions.exceptions;

public class StudentDoesNotHaveSubject extends Exception {
    public StudentDoesNotHaveSubject(){
        super("Student must have at least one subject");
    }
}
