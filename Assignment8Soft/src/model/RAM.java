package model;
import visitor.ProductVisitor;
public class RAM implements Product {
    private final int sizeGB;
    private final double price;
    public RAM(int sizeGB, double price) {
        this.sizeGB = sizeGB;
        this.price = price;
    }
    public int getSizeGB() { return sizeGB; }
    public double getPrice() { return price; }
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
