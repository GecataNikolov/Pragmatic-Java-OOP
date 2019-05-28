package OOP.inheritanceAndEncapsulation;


public class Demo {
    public static void main(String[] args) {
        Person[] personArray = new Person[10];

        personArray[0] = new Person("Joro", 20, true);
        personArray[1] = new Person("Ivana", 17, false);
        personArray[2] = new Student("Joro Student", 20, true, 4);
        personArray[3] = new Student("Ivana Student", 11, false, 6);
        personArray[4] = new Employee("Joro Employee", 44, true, 100);
        personArray[5] = new Employee("Ivana Employee", 18, false, 10);


        for (Person i : personArray
             ) {
            if (i == null){
                break;
            }
            if (i instanceof Student){
                ((Student) i).showStudentInfo();
            }
            else if (i instanceof Employee){
                ((Employee) i).showEmployeeInfo();
            }
            else{
                i.showPersonInfo();
            }

        }

        for (Person i: personArray) {
            if (i == null){
                break;
            }
            if (i instanceof Employee){
               double overtimePay= ((Employee) i).calculateOvertime(2);
                ((Employee) i).setDaySalary(overtimePay + ((Employee) i).getDaySalary());
                System.out.println("Salary of the Employee: " + i.name + " after the overtime is: "+ ((Employee) i).getDaySalary());
            }
        }

    }
}
