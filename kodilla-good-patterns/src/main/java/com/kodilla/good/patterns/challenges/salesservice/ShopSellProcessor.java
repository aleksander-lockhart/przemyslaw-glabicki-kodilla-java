package com.kodilla.good.patterns.challenges.salesservice;

public class ShopSellProcessor {

    private SalesInformationService salesInformationService;
    private SalesService salesService;
    private SalesRepository salesRepository;

    public ShopSellProcessor(final SalesInformationService salesInformationService,
                             final SalesService salesService,
                             final SalesRepository salesRepository) {
        this.salesInformationService = salesInformationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isSold = salesService.createTransaction(saleRequest.getShopUser(), saleRequest.getTransactionDate(),
                saleRequest.getItemName(), saleRequest.getItemQuantity());

        if(isSold) {
            salesInformationService.inform(saleRequest.getShopUser());
            salesRepository.createTransaction(saleRequest.getShopUser(), saleRequest.getTransactionDate(),
                    saleRequest.getItemName(), saleRequest.getItemQuantity());
            return new SaleDto(saleRequest.getShopUser(), true);
        } else {
            return new SaleDto(saleRequest.getShopUser(), false);
        }
    }
}