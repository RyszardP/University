package java_error_exceptions.exceptions;

public class ScoresMustBeInRange extends Exception {
   public ScoresMustBeInRange(){
       super("Score does not in range");
   }

    public ScoresMustBeInRange(String s) {
    }
}
