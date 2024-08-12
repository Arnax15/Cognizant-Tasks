public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        Student student1 = new Student(1, "John Doe", 'A');
        Student student2 = new Student(2, "Jane Doe", 'B');
        Student student3 = new Student(3, "Bob Smith", 'C');

        grades.addStudent(student1);
        grades.addStudent(student2);
        grades.addStudent(student3);

        System.out.println("Initial Students:");
        grades.displayStudents();

        grades.removeStudent(2);

        System.out.println("After removing Student 2:");
        grades.displayStudents();

        grades.updateStudentGrade(1, 'A');

        System.out.println("After updating Student 1 grade:");
        grades.displayStudents();
    }
}
