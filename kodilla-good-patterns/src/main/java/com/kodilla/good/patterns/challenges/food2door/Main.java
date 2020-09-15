package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.OnlyGlutenShop;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieveOrder();

        OrderProcessor orderProcessor = new OrderProcessor(new SendInfoToSupplier(),
                new OnlyGlutenShop());

        orderProcessor.process(orderRequest);

    }
}
