
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int studentID;
    String name;
    char grade;

    public Student(int studentID, String name, char grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
               "  ID: " + studentID + "\n" +
               "  Name: " + name + "\n" +
               "  Grade: " + grade;
    }
}