import java.util.Arrays;
import java.util.Comparator;

public class SearchExample {

    public static int linearSearch(Product[] products, String searchName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String searchName) {
        int start = 0;
        int end = products.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = searchName.compareToIgnoreCase(products[mid].productName);

            if (cmp == 0) return mid;
            else if (cmp > 0) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mouse", "Accessories"),
            new Product(3, "Keyboard", "Accessories"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Tablet", "Electronics")
        };

        int result1 = linearSearch(products, "Phone");
        System.out.println("Linear Search: Found at index = " + result1);

        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.productName.compareToIgnoreCase(p2.productName);
            }
        });

        int result2 = binarySearch(products, "Phone");
        System.out.println("Binary Search: Found at index = " + result2);
    }
}
