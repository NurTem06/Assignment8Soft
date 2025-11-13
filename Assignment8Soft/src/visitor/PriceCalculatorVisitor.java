package visitor;
import model.CPU;
import model.GPU;
import model.RAM;
public class PriceCalculatorVisitor implements ProductVisitor {
    private double totalPrice = 0;
    @Override
    public void visit(CPU cpu) {
        totalPrice += cpu.getPrice();
    }
    @Override
    public void visit(GPU gpu) {
        totalPrice += gpu.getPrice();
    }
    @Override
    public void visit(RAM ram) {
        totalPrice += ram.getPrice();
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
