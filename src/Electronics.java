class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + name + " | Price: $" + price);
    }
}
