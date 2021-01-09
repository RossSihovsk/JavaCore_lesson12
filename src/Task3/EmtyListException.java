package Task3;

public class EmtyListException extends Exception {

    String message;

    public EmtyListException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
