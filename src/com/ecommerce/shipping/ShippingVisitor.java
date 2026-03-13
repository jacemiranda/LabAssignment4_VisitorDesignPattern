package com.ecommerce.shipping;

public interface ShippingVisitor {
    public double visit(Chair chair);
    public double visit(Table table);
    public double visit(Sofa sofa);
}