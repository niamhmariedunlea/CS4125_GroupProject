package Controller;

import Model.Payment;

public class PaymentController {
    private Payment model;

    private boolean paymentComplete;

    public void makePayment() {
        //api api api
        //if(payment is valid) {
            this.paymentComplete = true;
        ///
    }

    public boolean isPaymentComplete() {
        return this.paymentComplete;
    }
}
