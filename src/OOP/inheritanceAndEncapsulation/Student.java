package OOP.inheritanceAndEncapsulation;

import java.util.Objects;

public class Student extends Person {
    private double score;


    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setScore(score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    void showStudentInfo() {
        System.out.println(this.toString());
    }

    private void setScore(double score) {
        if (score >= 2 && score <= 6) {
            this.score = score;
        } else {
            System.out.println("Invalid score");
        }
    }


}
