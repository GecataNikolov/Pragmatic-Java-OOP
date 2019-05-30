package OOP.abstractioAndPolymorphism;

import java.util.Date;

public abstract class AbstractUser implements User {

    private String username;
    private boolean isAdmin;
    private boolean isLoggedIn;
    private Date registeredDate;


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
    public Date getRegisteredDate() {
        return this.registeredDate;
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "username='" + username + '\'' +
                ", isAdmin=" + isAdmin +
                ", isLoggedIn=" + isLoggedIn +
                ", registeredDate=" + registeredDate +
                '}';
    }
}

