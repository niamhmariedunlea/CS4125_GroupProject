package Model;

import java.util.ArrayList;
import java.util.List;

import View.DiscountObserver;

public class Discount {
    private List<DiscountObserver> discountObservers = new ArrayList<>();

    // add or remove observers
    public void addObserver(DiscountObserver observer) {
        discountObservers.add(observer);
    }

    public void removeObserver(DiscountObserver observer) {
        discountObservers.remove(observer);
    }

    // notify observers if the condition is met and then apply percentage discount
    public void notifyDiscountObservers(boolean isMonday) {
        if (isMonday) {
            for (DiscountObserver observer : discountObservers) {
                observer.updateDiscount(0.2);
            }
        }
    }
}

