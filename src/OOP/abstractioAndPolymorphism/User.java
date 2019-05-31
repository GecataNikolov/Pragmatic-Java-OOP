package OOP.abstractioAndPolymorphism;

import java.time.LocalDate;

public interface User {
    void login(String username);
    void logout();
    String getUsername();
    LocalDate getRegisteredDate();
}
