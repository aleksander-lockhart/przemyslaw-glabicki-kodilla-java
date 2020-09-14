package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {

        FirstSupplier firstSupplier = new FirstSupplier();
        SecondSupplier secondSupplier = new SecondSupplier();

        SupplierOrderRequest firstSampleOrderRequest = firstSupplier.process();
        SupplierOrderRequest secondSampleOrderRequest = secondSupplier.process();

        OrderService orderProcessor = new OrderService(new
                NewOrderService(), new SendOrderInformation());
        orderProcessor.process(firstSampleOrderRequest);
        orderProcessor.process(secondSampleOrderRequest);
    }
}
