package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OredrDto process(final OrderRequest orderRequest) {
        boolean isOrdered = ProductOrderService.order(orderRequest.getUser(), orderRequest.getOrderDateTime());
        if (isOrdered) {
            InformationService.inform(orderRequest.getUser());
            OrderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderDateTime());
            return new OredrDto(orderRequest.getUser(), true);
        } else {
            return new OredrDto(orderRequest.getUser(), false);
        }
    }
}
