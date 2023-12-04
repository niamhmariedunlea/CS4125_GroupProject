package Controller;

import java.time.DayOfWeek;
import java.time.LocalDate;

import Model.Discount;
import View.DiscountView;

public class DiscountController {
    private Discount model;
    public DiscountController(Discount model, DiscountView view) {
        this.model = model;
        this.model.addObserver(view);
    }

    // check if its Monday
    private boolean isMonday() {
        LocalDate today = LocalDate.now();
        return today.getDayOfWeek() == DayOfWeek.MONDAY;
    }

    // check if the discount is applicable today i.e. if its Monday
    public void checkDiscount() {
        boolean isMonday = isMonday();
        model.notifyDiscountObservers(isMonday);
    }
}

