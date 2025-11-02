class ProductFactory {
    public static Product createProduct(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics(name, price);
            case "clothes":
                return new Clothes(name, price);
            case "food":
                return new Food(name, price);
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}