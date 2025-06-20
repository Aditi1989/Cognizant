import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Fashion"),
            new Product(150, "Mobile", "Electronics"),
            new Product(120, "Watch", "Accessories"),
            new Product(180, "Bag", "Fashion")
        };

        int searchId = 150;

        // Linear Search
        Product resultLinear = linearSearch(products, searchId);
        if (resultLinear != null)
            System.out.println("Linear Search Found: " + resultLinear);
        else
            System.out.println("Linear Search: Product not found");

        // Sort for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        Product resultBinary = binarySearch(products, searchId);
        if (resultBinary != null)
            System.out.println("Binary Search Found: " + resultBinary);
        else
            System.out.println("Binary Search: Product not found");
    }

    public static Product linearSearch(Product[] products, int productId) {
        for (Product p : products) {
            if (p.productId == productId) return p;
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int productId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == productId) {
                return products[mid];
            } else if (products[mid].productId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
