package OOP.inheritanceAndEncapsulation;

import java.util.Objects;

public class Person {
    // default/package access modifier- to be used in Employee.java and Student.java
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo(){
        System.out.println(this.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                isMan == person.isMan &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMan);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }
}
