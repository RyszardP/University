package java_error_exceptions.exceptions;

public class GroupDoesNotHaveStudent extends Exception {
    public GroupDoesNotHaveStudent() {
        super("Students must be in the group");
    }

    public GroupDoesNotHaveStudent(String s) {
    }
}
