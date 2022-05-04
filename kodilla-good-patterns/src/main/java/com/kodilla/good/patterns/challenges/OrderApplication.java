package com.kodilla.good.patterns.challenges;

public class OrderApplication {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new PhoneInformationService(),
                new SingleOrderProcess(),
                new SingleOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
