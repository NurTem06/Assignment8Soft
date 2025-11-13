package model;

import visitor.ProductVisitor;

public class GPU implements Product {
    private final String brand;
    private final double price;

    public GPU(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public double getPrice() { return price; }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
