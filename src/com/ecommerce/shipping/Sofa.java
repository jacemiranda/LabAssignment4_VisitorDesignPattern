package com.ecommerce.shipping;

public class Sofa implements Furniture {
    private double distance;

    public Sofa(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}