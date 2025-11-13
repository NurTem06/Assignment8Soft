package visitor;
import model.CPU;
import model.GPU;
import model.RAM;
public interface ProductVisitor {
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(RAM ram);
}
