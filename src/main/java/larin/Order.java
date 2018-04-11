package larin;

import java.util.List;

public class Order {

    private final String address;
    private List items;
    private PaymentType paymentType;

    public Order(String address) {
        this.address = address;
    }

    public List getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}





