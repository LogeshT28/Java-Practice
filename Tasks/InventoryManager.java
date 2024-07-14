package Tasks;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " (Quantity: " + quantity + ")";
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setQuantity(product.getQuantity() + quantity);
                return;
            }
        }
        products.add(new Product(name, quantity));
    }

    public void removeProduct(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                int currentQuantity = product.getQuantity();
                if (currentQuantity >= quantity) {
                    product.setQuantity(currentQuantity - quantity);
                } else {
                    System.out.println("Cannot remove more than available quantity.");
                }
                if (product.getQuantity() == 0) {
                    products.remove(product);
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void checkLowInventory(int threshold) {
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                System.out.println("Low inventory: " + product);
            }
        }
    }

    @Override
    public String toString() {
        return "Inventory: " + products.toString();
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 50);
        inventory.addProduct("Keyboard", 5);

        System.out.println(inventory);

        inventory.removeProduct("Mouse", 20);
        System.out.println(inventory);

        inventory.checkLowInventory(10);

        inventory.removeProduct("Laptop", 10);
        System.out.println(inventory);

        inventory.checkLowInventory(10);
    }
}

