package OOP.abstractioAndPolymorphism;

public class DataBase {
     private User[] users;

    public DataBase(int dbLenght) {
        this.users = new User[dbLenght];
    }

    public User[] getUsers() {
        return this.users;
    }

}
