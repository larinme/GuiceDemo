package larin;

import com.google.inject.Inject;

public class CompanyB {

            private OrderItemCollector orderItemCollector;
            private GoToAddress goToAddress;
            private ContactWithCustomer contactWithCustomer;
            private DeliverOrder deliverOrder;
            private GetMoney getMoney;
            private Goodbye goodbye;

            @Inject
            public CompanyB(
                    OrderItemCollector orderItemCollector,
                    GoToAddress goToAddress,
                    ContactWithCustomer contactWithCustomer,
                    DeliverOrder deliverOrder,
                    GetMoney getMoney,
                    Goodbye goodbye){

                this.orderItemCollector = orderItemCollector;
                this.goToAddress = goToAddress;
                this.contactWithCustomer = contactWithCustomer;
                this.deliverOrder = deliverOrder;
                this.getMoney = getMoney;
                this.goodbye = goodbye;
            }


            public void deliver(Order order){

                // сформировать заказ
                orderItemCollector.collect(order.getItems());
                // добраться до адреса
                goToAddress.goToAddress(order.getAddress());
                // связаться с клиентом
                contactWithCustomer.contact();
                // вручить посылку
                deliverOrder.deliver();
                // получить деньги
                getMoney.get();
                // попрощаться и уйти
                goodbye.sayGoodbye();
            }

        }


