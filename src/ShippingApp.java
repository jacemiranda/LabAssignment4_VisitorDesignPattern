import com.ecommerce.shipping.*;

public class ShippingApp {
    public static void main(String[] args) {
        Chair myChair = new Chair();
        Table myTable = new Table(12.0); // Surface area: 12.0
        Sofa mySofa = new Sofa(50.0);    // Distance: 50.0

        ShippingVisitor shippingCalculator = new ShippingCostCalculator();

        System.out.println("Shipping cost for Chair: ₱" + myChair.accept(shippingCalculator));
        System.out.println("Shipping cost for Table: ₱" + myTable.accept(shippingCalculator));
        System.out.println("Shipping cost for Sofa: ₱" + mySofa.accept(shippingCalculator));
    }
}