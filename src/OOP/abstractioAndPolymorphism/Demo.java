package OOP.abstractioAndPolymorphism;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        AdminUser adm = new AdminUserImpl("First Admin", true, LocalDate.now());

        adm.registerNewUser("NotAdmin", false);
        adm.registerNewUser("Admin", true);
        adm.registerNewUser("NotAdmin2", false);
        adm.registerNewUser("NotAdmin3", false);
        adm.registerNewUser("NotAdmin4", false);
        adm.registerNewUser("NotAdmin5", false);
        adm.registerNewUser("NotAdmin6", false);
        adm.registerNewUser("NotAdmin7", false);
        adm.registerNewUser("Admin2", true);
        adm.registerNewUser("test", false);
        adm.registerNewUser("test", false);

        adm.printUserInformation();
        adm.deleteUser("test");
        adm.printUserInformation();

        adm.deleteUser("ING");
        adm.registerNewUser("ING", true);
        adm.deleteUser("cv");
        adm.registerNewUser("omg", false);



    }
}
