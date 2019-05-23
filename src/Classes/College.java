package Classes;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student("Gosho", "math", 20);
        Student student2 = new Student("Pesho", "math", 33);
        Student student3 = new Student("Joro", "math", 44);
        Student student4 = new Student("Ivan", "math", 29);
        Student student5 = new Student("Ivo", "english", 18);

        student1.receiveSchoolarship(4.5, 200);
        student4.receiveSchoolarship(3.5, 100);

        student5.upYear();
        student1.upYear();

        StudentGroup studentGroupEnglish = new StudentGroup("English");
        StudentGroup studentGroupMath = new StudentGroup("Math");
        StudentGroup studentGroupChemistry = new StudentGroup("Chemistry");

        studentGroupMath.addStudent(student1);
        studentGroupMath.addStudent(student3);
        studentGroupMath.addStudent(student4);
        studentGroupChemistry.addStudent(student2);
        studentGroupEnglish.addStudent(student5);

        studentGroupEnglish.printStudentsInGroup();
        System.out.println("Best student for " + studentGroupEnglish.groupProject + " is " + studentGroupEnglish.bestStudent());

        studentGroupMath.printStudentsInGroup();
        System.out.println("Best student for " + studentGroupMath.groupProject + " is " + studentGroupMath.bestStudent());

        studentGroupChemistry.printStudentsInGroup();


    }
}
