import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ProductStreamOps {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(101, "Laptop", 55000),
            new Product(102, "Mouse", 700),
            new Product(103, "Phone", 30000),
            new Product(104, "Keyboard", 1500)
        );
        System.out.println("Filtered & Sorted Products (price > 1000):");
        products.stream()
                .filter(p -> p.price > 1000)
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(p -> System.out.println(p.name + " : ₹" + p.price));

        double avg = products.stream()
                .mapToDouble(p -> p.price)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage Product Price: ₹" + avg);
    }
}
