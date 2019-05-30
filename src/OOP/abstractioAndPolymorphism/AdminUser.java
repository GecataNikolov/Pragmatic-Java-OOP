package OOP.abstractioAndPolymorphism;

public interface AdminUser extends User{
    void deleteUser(String username);
    User registerNewUser(String username, boolean isAdmin);
    void printUserInformation(String username);
}
