package com.ecommerce.shipping;

public class Chair implements Furniture {
    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}