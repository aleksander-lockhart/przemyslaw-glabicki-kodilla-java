package com.kodilla.good.patterns.challenges.salesservice;

public class Main {

    public static void main(String args[]) {

        TransactionRetriever transactionRetriever = new TransactionRetriever();
        SaleRequest saleRequest = transactionRetriever.getRequest();

        ShopSellProcessor sellProcessor = new ShopSellProcessor (
                new InfoService(),
                new SoldSalesService(),
                new SoldSalesRepository());
                sellProcessor.process(saleRequest);
    }

}
