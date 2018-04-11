package larin;

import com.google.inject.Inject;

import javax.inject.Named;

            public class GetMoneyByCard implements GetMoney {

                private CardTypeAdapter adapter;

                @Inject
                public void setAdapter(@Named("MasterCard") CardTypeAdapter adapter) {
                    this.adapter = adapter;
                }

                public int get() {

                    return adapter.get();
                }
            }

