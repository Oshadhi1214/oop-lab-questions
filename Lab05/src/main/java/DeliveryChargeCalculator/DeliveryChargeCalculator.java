package question01;

public class DeliveryChargeCalculator {

    // 1. Base charge only
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // 2. Base + distance
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * 100.0);
    }

    // 3. Base + distance + weight
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * 100.0) + (weightKg * 50.0);
    }

    // 4. Base + express delivery
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}