import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public record Producto(int id, String name, double price) {
    public Producto{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Product name cannot be blank");
        }

        if (price <= 0) {
            throw new IllegalArgumentException(
                    "Price must be greater than zero");
        }
    }
}
