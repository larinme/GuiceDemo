package larin.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import larin.*;
import larin.CardTypeAdapter;

public class DependencyConfig extends AbstractModule {
        @Override
        protected void configure() {
            bind(ContactWithCustomer.class).to(ContactWithCustomerByPhone.class);
            bind(OrderItemCollector.class).to(OrderItemCollectorImpl.class);
            bind(DeliverOrder.class).to(DeliverOrderToCustomer.class);
            bind(Goodbye.class).to(SayGoodbye.class);
            bind(GoToAddress.class).to(GoToAddressByCar.class);
            bind(GetMoney.class).to(GetMoneyByCard.class);


        }
        @Provides
        CardTypeAdapter getType(){
            CardTypeAdapter adapter = MasterCardTypeAdapter.getInstance();
            adapter.setValue("111");
            return adapter;
        }
    }



