import java.util.ArrayList;
import java.util.List;

class CartManager {
    private static CartManager instance;
    private List<Product> cart = new ArrayList<>();

    private CartManager() {} // приватный конструктор

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.name + " added to cart.");
    }

    public void showCart() {
        System.out.println("\n🛒 Cart Contents:");
        for (Product p : cart) {
            p.displayInfo();
        }
    }
}
