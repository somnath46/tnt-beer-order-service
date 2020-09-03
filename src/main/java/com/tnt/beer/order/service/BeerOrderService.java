package com.tnt.beer.order.service;

import java.util.UUID;

import org.springframework.data.domain.Pageable;

import com.tnt.beer.order.model.BeerOrderDto;
import com.tnt.beer.order.model.BeerOrderPagedList;

public interface BeerOrderService {
    BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);

    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

    BeerOrderDto getOrderById(UUID customerId, UUID orderId);

    void pickupOrder(UUID customerId, UUID orderId);
}
