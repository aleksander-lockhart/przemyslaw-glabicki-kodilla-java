package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.SupplierProcess;

public class OrderProcessor {
        private final InformationService informationService;
        private final SupplierProcess supplierProcess;

        public OrderProcessor(final InformationService informationService,
                              final SupplierProcess supplierProcess) {
            this.informationService = informationService;
            this.supplierProcess = supplierProcess;
        }

        public SupplierOrderDto process(final OrderRequest orderRequest) {
            boolean gotNewOrder = supplierProcess.process(orderRequest.getSupplier(), orderRequest.getOrderTime());

            if(gotNewOrder) {
                informationService.sendInfoToSupplier(orderRequest.getSupplier());
                return new SupplierOrderDto(orderRequest.getSupplier(), true);
            } else {
                return new SupplierOrderDto(orderRequest.getSupplier(), false);
            }
        }
    }

