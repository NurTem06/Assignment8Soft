package visitor;
import model.CPU;
import model.GPU;
import model.RAM;
public class ProductDisplayVisitor implements ProductVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("CPU: " + cpu.getBrand() +" " + " Price: $" + cpu.getPrice());
    }
    @Override
    public void visit(GPU gpu) {
        System.out.println("GPU: " + gpu.getBrand() +" " + " Price: $" + gpu.getPrice());
    }
    @Override
    public void visit(RAM ram) {
        System.out.println("RAM: " + ram.getSizeGB() + " гб" + " " + "Price: $" + ram.getPrice());
    }
}
