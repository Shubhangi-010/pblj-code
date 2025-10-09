 import java.util.*;
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println(id + " | " + name + " | ₹" + salary);
    }
}
public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(154, "Amit", 52000));
        employees.add(new Employee(233, "Gungun", 48000));
        employees.add(new Employee(272, "Shaheen", 60000));

        System.out.println("Before Sorting:");
        employees.forEach(Employee::display);
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nAfter Sorting by Salary:");
        employees.forEach(Employee::display);
    }
}
