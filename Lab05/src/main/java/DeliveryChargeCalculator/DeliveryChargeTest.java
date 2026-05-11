package question01;

public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calc = new DeliveryChargeCalculator();

        System.out.println("Base charge: " + calc.calculateCharge(500));

        System.out.println("Base + Distance: " + 
            calc.calculateCharge(500, 10));

        System.out.println("Base + Distance + Weight: " + 
            calc.calculateCharge(500, 10, 2));

        System.out.println("Base + Express Delivery: " + 
            calc.calculateCharge(500, true));
    }
}