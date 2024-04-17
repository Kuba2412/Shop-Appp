public class Discount implements Promotion {
    private final double discountRate;

    public Discount(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double applyPromotion(double total) {
        return total * (1 - discountRate);
    }

}
