package larin;


public class CompanyA {

    public void deliver(Order order) {


        // сформировать заказ
        OrderItemCollector orderItemCollector = new OrderItemCollectorImpl();
        orderItemCollector.collect(order.getItems());

        // добраться до адреса
        GoToAddressByCar goToAddress = new GoToAddressByCar();
        goToAddress.goToAddress(order.getAddress());

        // связаться с клиентом
        ContactWithCustomerByPhone contactWithCustomer = new ContactWithCustomerByPhone();
        contactWithCustomer.contact();

        // вручить посылку
        DeliverOrderToCustomer deliverOrderToCustomer = new DeliverOrderToCustomer();
        deliverOrderToCustomer.deliver();

        // получить деньги
        int money = 0;
        if (order.getPaymentType() == PaymentType.CASH) {
            money = getMoneyByCash();
        } else if (order.getPaymentType() == PaymentType.CARD) {
            money = getMoneyByCard(CardType.MASTER_CARD);
        }
        // попрощаться и уйти
        SayGoodbye sayGoodbye = new SayGoodbye();
        sayGoodbye.sayGoodbye();

    }

    private int getMoneyByCard(CardType cardType) {

        GetMoneyByCard getMoneyByCard = new GetMoneyByCard();

        if (CardType.MASTER_CARD.equals(cardType)) {
            getMoneyByCard.setAdapter(new MasterCardTypeAdapter());
        } else {
            getMoneyByCard.setAdapter(new VisaCardTypeAdapterImpl());
        }

        return getMoneyByCard.get();
    }

    private int getMoneyByCash() {
        return 0;
    }
}



