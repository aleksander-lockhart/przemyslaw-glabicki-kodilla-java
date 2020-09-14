package com.kodilla.good.patterns.challenges.food2door;

    public class OrderService {
        private final NewOrder newOrder;
        private final InfoForNewOrder infoForNewOrder;

        public OrderService(final NewOrder newOrder,
                                    final InfoForNewOrder infoForNewOrder) {
            this.newOrder = newOrder;
            this.infoForNewOrder = infoForNewOrder;
        }

        public SupplierOrderDto process(final SupplierOrderRequest supplierOrderRequest) {
            boolean gotNewOrder = newOrder.createOrder(supplierOrderRequest.getSupplier(),
                    supplierOrderRequest.getWhen());

            if(gotNewOrder) {
                infoForNewOrder.sendInfoToSupplier(supplierOrderRequest.getSupplier());
                return new SupplierOrderDto(supplierOrderRequest.getSupplier(), true);
            } else {
                return new SupplierOrderDto(supplierOrderRequest.getSupplier(), false);
            }
        }
    }

