package Classes;

public class StudentGroup {
    String groupProject;
    Student[] students;
    int freePlaces;


    public StudentGroup() {
        this.students = new Student[5];
        freePlaces = 5;
    }

    public StudentGroup(String groupProject) {
        this();
        this.groupProject = groupProject;
    }


    void addStudent(Student student) {
        int index = this.students.length - freePlaces;
        if (this.groupProject.equalsIgnoreCase(student.subject) && this.freePlaces <= 5) {
            this.students[index] = student;
            this.freePlaces--;
        } else {
            System.out.println("Not the same subject or no more free places in this group");
        }
    }

    void emptyGroup() {
        this.students = new Student[5];
        freePlaces = 5;
    }

    String bestStudent() {
        double maxGrade = 0;
        String studentName = "";
//                this.students[0].name;

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                break;
            }
            double currentGrade = this.students[i].grade;

            if (maxGrade <= currentGrade) {
                if (currentGrade == maxGrade) {
                    studentName += " and " + this.students[i].name;
                    continue;
                }
                maxGrade = this.students[i].grade;
                studentName = this.students[i].name;
            }

        }
        return studentName;
    }

    void printStudentsInGroup() {
        System.out.println("--------------------------------");
        System.out.println("All students in " + this.groupProject + " are");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                if (i == 0){
                    System.out.println("No students in this group " + this.groupProject);
                }
                break;
            }
            System.out.println("Student " + (i + 1) + " ");
            students[i].printStudentInfo();
            System.out.println("----------------------------");
        }


    }

}
