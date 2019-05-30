package OOP.abstractioAndPolymorphism;


import java.time.LocalDateTime;
import java.util.Date;

public class AdminUserImpl extends AbstractUser implements AdminUser {
    private static final int dbLength = 10;

    private DataBase db;


    public AdminUserImpl() {
        this.db = new DataBase(dbLength);
    }

    @Override
    public void deleteUser(String username) {
        for (int i = 0; i < dbLength; i++) {
            if (db.getUsers()[i].getUsername().equals(username)) {
                db.getUsers()[i] = null;
            }
        }
    }

    @Override
    public User registerNewUser(String username, boolean isAdmin) {
        return  null;
    }


    @Override
    public void printUserInformation(String username) {
        for (int i = 0; i < dbLength; i++) {
            if (db.getUsers()[i].getUsername().equals(username)) {
                db.getUsers()[i].toString();
            }
        }
    }
}
