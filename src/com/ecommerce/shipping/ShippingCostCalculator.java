package com.ecommerce.shipping;

public class ShippingCostCalculator implements ShippingVisitor {
    @Override
    public double visit(Chair chair) {
        return 150.0;
    }

    @Override
    public double visit(Table table) {
        return table.getSurfaceArea() * 10.5;
    }

    @Override
    public double visit(Sofa sofa) {
        return sofa.getDistance() * 5.0;
    }
}