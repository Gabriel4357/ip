package duke;

public class DukeException extends Exception {
    protected String message;
    public DukeException(String error){
        this.message = error;
    }




}