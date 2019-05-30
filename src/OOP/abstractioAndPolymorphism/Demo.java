package OOP.abstractioAndPolymorphism;

public class Demo {
    public static void main(String[] args) {
        AdminUser adm = new AdminUserImpl();
        adm.registerNewUser("KZL", true);
        adm.registerNewUser("ASL", false);
        adm.registerNewUser("ING", false);

    }
}
