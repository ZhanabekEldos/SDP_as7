class Clothes extends Product {
    public Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothes: " + name + " | Price: $" + price);
    }
}