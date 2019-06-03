package OOP.inheritanceAndEncapsulation;

import java.util.Objects;

public class Employee extends Person{
    private double daySalary;

     Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        setDaySalary(daySalary);
    }

     double calculateOvertime(double hours){
        if(this.age >= 18){
           return  (this.daySalary/8 * 1.5) * hours;
        }
        else{
            return 0;
        }
    }
     void showEmployeeInfo(){
        System.out.println(this.toString());
    }

     void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

     double getDaySalary() {
        return daySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "daySalary=" + daySalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.daySalary, daySalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), daySalary);
    }
}
