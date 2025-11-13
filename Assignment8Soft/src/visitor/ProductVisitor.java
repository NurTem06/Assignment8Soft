package visitor;

import model.CPU;
import model.GPU;
import model.RAM;

// Интерфейс Visitor — объявляет методы для каждого типа продукта
public interface ProductVisitor {
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(RAM ram);
}
