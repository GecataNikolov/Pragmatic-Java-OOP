package OOP.abstractioAndPolymorphism;

import java.time.LocalDate;

public abstract class AbstractUser implements User {

    private String username;
    private boolean isAdmin;
    private boolean isLoggedIn;
    private LocalDate registeredDate;


    public AbstractUser(String username, boolean isAdmin, LocalDate registeredDate) {
        this.username = username;
        this.isAdmin = isAdmin;
        this.registeredDate = registeredDate;
    }

    @Override
    public void login(String username) {
        this.isLoggedIn = true;
    }

    @Override
    public void logout() {
        this.isLoggedIn = false;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public LocalDate getRegisteredDate() {
        return this.registeredDate;
    }

    @Override
    public String toString() {
        return "Information for " + username + "{" +
                "username='" + username + '\'' +
                ", isAdmin=" + isAdmin +
                ", isLoggedIn=" + isLoggedIn +
                ", registeredDate=" + registeredDate +
                '}';
    }
}

