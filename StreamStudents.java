import java.util.*;
class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void show() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}
public class StreamStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Riya", 78.5),
            new Student(2, "Aman", 88.0),
            new Student(3, "Neha", 60.4),
            new Student(4, "Karan", 91.2)
        );

        System.out.println("Students scoring above 70 (sorted by marks):");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .forEach(Student::show);
    }
}
