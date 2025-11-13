package model;

import visitor.ProductVisitor;

// Абстрактный интерфейс для всех продуктов
public interface Product {
    void accept(ProductVisitor visitor); // принимает посетителя
}
