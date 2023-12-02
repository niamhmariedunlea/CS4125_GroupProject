package View;

public class DiscountView implements DiscountObserver {
    @Override
    public void updateDiscount(double discountPercentage) {
        System.out.println("Discount is now " + (discountPercentage * 100) + "%");
    }
}