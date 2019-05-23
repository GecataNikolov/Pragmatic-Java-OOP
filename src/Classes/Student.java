package Classes;

public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    public Student() {
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }
    // Need to add constructor...

    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    void upYear() {
        if (!isDegree) {
            yearInCollege++;
            if (yearInCollege == 4) {
                isDegree = true;
            }
        } else {
            System.out.println("Already finished the college ");
        }
    }

    double receiveSchoolarship(double min, double amount) {
        if (this.grade >= min && this.age < 30) {
            this.money += amount;
        } else {
            System.out.println("Need to improve your grades in order to take scholarship");
        }
        return this.money;
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
        System.out.println("isDegree: " + this.isDegree);
        System.out.println("Money: " + this.money);
        System.out.println("Year in college: " + this.yearInCollege);
        System.out.println("Subject: " + this.subject);
    }

}