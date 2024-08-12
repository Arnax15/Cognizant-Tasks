public class Student {
    private int id;
    private String name;
    private char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}
