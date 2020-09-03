package com.tnt.beer.order.service.mapper;

import org.mapstruct.Mapper;

import com.tnt.beer.order.domain.BeerOrder;
import com.tnt.beer.order.model.BeerOrderDto;

@Mapper(componentModel = "spring", uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper extends BaseMapper<BeerOrderDto, BeerOrder> {

	@Override
    BeerOrderDto toDto(BeerOrder beerOrder);

	@Override
    BeerOrder fromDto(BeerOrderDto dto);
}
