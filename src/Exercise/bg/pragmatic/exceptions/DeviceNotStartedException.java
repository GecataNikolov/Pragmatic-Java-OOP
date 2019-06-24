package Exercise.bg.pragmatic.exceptions;

public class DeviceNotStartedException extends Exception {
    public DeviceNotStartedException() {
    }

    public DeviceNotStartedException(String message) {
        super(message);
    }

    public DeviceNotStartedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeviceNotStartedException(Throwable cause) {
        super(cause);
    }
}
