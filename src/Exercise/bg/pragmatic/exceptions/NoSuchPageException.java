package Exercise.bg.pragmatic.exceptions;

public class NoSuchPageException extends Exception {

    public NoSuchPageException() {
    }

    public NoSuchPageException(String message) {
        super(message);
    }

    public NoSuchPageException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPageException(Throwable cause) {
        super(cause);
    }
}
