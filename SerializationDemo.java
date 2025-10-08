
import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 'A');
        String filename = "student.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Student object has been serialized and saved to " + filename);
            System.out.println("Original Object: \n" + student);
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }

        System.out.println("\n-----------------------------------\n");

        Student deserializedStudent = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedStudent = (Student) in.readObject();
            System.out.println("Student object has been deserialized from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }

        if (deserializedStudent != null) {
            System.out.println("Deserialized Object: \n" + deserializedStudent);
        }
    }
}