package java_error_exceptions.exceptions;

public class UniversityDoesNotHaveFaculties extends Exception {
    public UniversityDoesNotHaveFaculties() {
        super("University must have faculty");
    }
}
