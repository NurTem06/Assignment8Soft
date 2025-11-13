import model.*;
import visitor.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём список продуктов
        List<Product> products = List.of(
                new CPU("Intel i7", 300),
                new GPU("NVIDIA RTX 4060", 500),
                new RAM(16, 120)
        );

        // 1. Вывод информации
        ProductVisitor displayVisitor = new ProductDisplayVisitor();
        products.forEach(p -> p.accept(displayVisitor));

        // 2. Расчёт общей цены
        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        products.forEach(p -> p.accept(priceVisitor));
        System.out.println("\nTotal price: $" + priceVisitor.getTotalPrice());
    }
}
