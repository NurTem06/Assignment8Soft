package model;

import visitor.ProductVisitor;
public interface Product {
    void accept(ProductVisitor visitor);
}
