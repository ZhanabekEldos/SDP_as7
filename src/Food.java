class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Food: " + name + " | Price: $" + price);
    }
}
