public class Main {
    public static void main(String[] args) {
        // Используем Factory Method
        Product laptop = ProductFactory.createProduct("electronics", "Laptop", 1200);
        Product tshirt = ProductFactory.createProduct("clothes", "T-shirt", 30);
        Product apple = ProductFactory.createProduct("food", "Apple", 2);

        // Singleton — один экземпляр корзины
        CartManager cart = CartManager.getInstance();
        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(apple);

        cart.showCart();
    }
}