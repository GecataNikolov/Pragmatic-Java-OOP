package OOP.abstractioAndPolymorphism;


import java.time.LocalDate;

public class UserImpl extends AbstractUser implements User {

    public UserImpl(String username, boolean isAdmin, LocalDate registeredDate) {
        super(username, isAdmin, registeredDate);
    }
}
