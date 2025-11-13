import model.*;
import visitor.*;
public class Runer {
    private final CPU cpu = new CPU("Intel i7", 300);
    private final GPU gpu = new GPU("NVIDIA RTX 4060", 500);
    private final RAM ram = new RAM(16, 120);
    public void displayProducts() {
        ProductVisitor displayVisitor = new ProductDisplayVisitor();
        cpu.accept(displayVisitor);
        gpu.accept(displayVisitor);
        ram.accept(displayVisitor);
    }
    public void displayTotalPrice() {
        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        cpu.accept(priceVisitor);
        gpu.accept(priceVisitor);
        ram.accept(priceVisitor);
        System.out.println("\nTotal price: $" + priceVisitor.getTotalPrice());
    }
    public void run() {
        displayProducts();
        displayTotalPrice();
    }
}
