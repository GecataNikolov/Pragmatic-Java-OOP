package OOP.abstractioAndPolymorphism;

import java.util.Date;

public interface User {
    void login(String username);
    void logout();
    String getUsername();
    Date getRegisteredDate();
}
