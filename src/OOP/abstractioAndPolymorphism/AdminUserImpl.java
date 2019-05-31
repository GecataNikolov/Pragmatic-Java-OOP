package OOP.abstractioAndPolymorphism;


import java.time.LocalDate;

public class AdminUserImpl extends AbstractUser implements AdminUser {
    private static final int dbLength = 10;

    LocalDate date = LocalDate.now();
    private DataBase db;


    public AdminUserImpl(String username, boolean isAdmin, LocalDate registeredDate) {
        super(username, isAdmin, registeredDate);
        this.db = new DataBase(dbLength);
    }


    @Override
    public void deleteUser(String username) {
        for (int i = 0; i < dbLength; i++) {
            if (db.getUsers()[i]== null){
                if (i == dbLength-1){
                    System.out.println("There is no such a user registered in DB");
                    break;
                }

            }
            if (db.getUsers()[i].getUsername().equals(username)) {
                db.getUsers()[i] = null;
                break;
            }
        }
    }

    @Override
    public User registerNewUser(String username, boolean isAdmin) {
        User createdUser = null;
        for (int i = 0; i < dbLength; i++) {
            if (db.getUsers()[i] == null) {
                if (isAdmin) {
                    createdUser = new AdminUserImpl(username, isAdmin, date);
                } else {
                    createdUser = new UserImpl(username, isAdmin, date);
                }
                db.getUsers()[i] = createdUser;
            } else if (i == dbLength-1) {
                System.out.println("Max allowed registered users for admin: " + this.getUsername());
                break;
            }

            for (int j = 0; j < dbLength; j++) {
                if (db.getUsers()[j] == null) {
                    continue;
                }
                if (username.equals(db.getUsers()[j].getUsername()) && db.getUsers()[j] != db.getUsers()[i]) {
                    createdUser = null;
                    return db.getUsers()[i] = createdUser;
                }
            }
            //return createdUser;
        }
        return null;
    }

    public User registerNewUser2(String username, boolean isAdmin) {
        int index = -1;

        for (int i = 0; i < dbLength; i++) {
            User current = db.getUsers()[i];
            if (current != null) {
                if (current.getUsername() == username) {
                    //TODO Write that the user exists in the Console
                    return current;
                }
            } else {
                if (index == -1) {
                    index = i;
                }
            }
        }

        if (index == -1) {
            //TODO output that the array is full

            return null;
        } else {
            return isAdmin ? new AdminUserImpl(username, isAdmin, date) : new UserImpl(username, isAdmin, date);
        }
    }


    @Override
    public void printUserInformation() {
        for (int i = 0; i < dbLength; i++) {
            {
                if (db.getUsers()[i] != null){
                    System.out.println(db.getUsers()[i].toString());
                }
            }
        }
    }
}
