package larin.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import larin.CompanyB;
import larin.Order;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new DependencyConfig());
        CompanyB instance = injector.getInstance(CompanyB.class);

        instance.deliver(new Order("test"));
    }
}
