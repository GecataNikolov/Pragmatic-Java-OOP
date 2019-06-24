package Exercise.bg.pragmatic.abstractions;

public interface IElectronicDevice{
    /**
     * Starting the Electronic device. Setting boolean to true.
     */
    void start();

    /**
     * Stopping the Electronic device. Setting boolean to false.
     */
    void stop();

    /**
     * Checking and returning boolean for state of the electronic device.
     * True- electronic device is started
     * False- electronic device is not started
     * @return The state of the Electronic device (started / stopped)
     */
    boolean isStarted();
}
