package com.tnt.beer.order.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tnt.beer.order.domain.BeerOrderLine;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
